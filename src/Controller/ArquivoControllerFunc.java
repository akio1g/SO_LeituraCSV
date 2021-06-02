package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoControllerFunc implements ArquivoController {

	@Override
	public void lerArquivo(String arq) throws IOException {
		var file = new File(arq);
		if (file.exists() && file.isFile()) {;
			var buffer = new BufferedReader(new FileReader(arq));
			String linha = buffer.readLine();
			while (linha != null) {
				String fields[] = linha.split(",");
				System.out.printf("%s \t %s \t %s\n",fields[0],fields[1],fields[2]);
				linha = buffer.readLine();
			}
			buffer.close();
		}
		else {
			throw new IOException("Arquivo inválido");
		}
	}

}
