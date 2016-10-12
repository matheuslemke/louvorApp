package lemke.com.br.louvor.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import lemke.com.br.louvor.model.Praise;

/**
 * Created by Matheus Lemke on 12-Oct-16.
 */

public class Changer {
    public void increaseTone(File praiseFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(praiseFile));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
