package jm0;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

/* renamed from: jm0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC21291a {
    /* renamed from: a */
    public static String m110256a(InputStream inputStream, boolean z11) {
        if (z11) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } catch (Exception e11) {
                e11.printStackTrace();
                return "Error";
            }
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine + "\n");
            } else {
                bufferedReader.close();
                return sb2.toString();
            }
        }
    }
}
