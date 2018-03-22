
package com.mycompany.subir;

import java.io.IOException;
import org.kohsuke.github.GHCreateRepositoryBuilder;
import  org.kohsuke.github.GitHub;;
public class Celstar {
    

public static void main(String[] args) throws IOException {
      GitHub github = GitHub.connect();
  GHCreateRepositoryBuilder builder;
  builder=github.createRepository("Nuevo repositorio");
  builder.create();
    }
}
