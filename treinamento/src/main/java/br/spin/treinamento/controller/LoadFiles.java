package br.spin.treinamento.controller;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
@RequestMapping("/fotos")
public class LoadFiles {
    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            // Processar o arquivo aqui
            // Exemplo: salvar o arquivo em disco
            try {
                // Define o diretório onde o arquivo será salvo
                String diretorioDestino = "C:\\Users\\gabriel.hawerroth\\Downloads\\teste\\";

                // Gera um nome único para o arquivo, por exemplo, usando o timestamp atual
                String nomeArquivo = System.currentTimeMillis() + "-" + file.getOriginalFilename();

                // Cria o caminho completo para o arquivo
                Path caminhoCompleto = Path.of(diretorioDestino + nomeArquivo);

                // Salva o arquivo no disco
                Files.copy(file.getInputStream(), caminhoCompleto, StandardCopyOption.REPLACE_EXISTING);

                return "Upload realizado com sucesso!";
            } catch (IOException e) {
                return "Erro ao realizar o upload do arquivo.";
            }
        } else {
            return "O arquivo está vazio.";
        }
    }

//  § Exemplo HTML para selecionar e fazer upload do arquivo §  //
//<form method="POST" action="/upload" enctype="multipart/form-data">
//<input type="file" name="file" />
//<input type="submit" value="Upload" />
//</form>

    @GetMapping("/download/{fileName}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) {
        // Define o diretório onde o arquivo está localizado
        String diretorioArquivos = "C:\\Users\\gabriel.hawerroth\\";

        try {
            // Cria o caminho completo para o arquivo
            Path caminhoCompleto = Paths.get(diretorioArquivos + fileName);

            // Cria um objeto Resource a partir do caminho do arquivo
            Resource resource = new org.springframework.core.io.UrlResource(caminhoCompleto.toUri());

            // Verifica se o arquivo existe
            if (resource.exists()) {
                // Configura o cabeçalho da resposta HTTP
                HttpHeaders headers = new HttpHeaders();
                headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"");

                // Retorna a resposta com o arquivo para download
                System.out.println("sucesso");
                return ResponseEntity.ok()
                        .contentType(MediaType.APPLICATION_OCTET_STREAM)
                        .headers(headers)
                        .body(resource);
            } else {
                System.out.println("resource not exists");
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            System.out.println("catch");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
