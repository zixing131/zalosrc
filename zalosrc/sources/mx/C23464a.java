package mx;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import me0.AbstractC23122k6;

/* renamed from: mx.a */
/* loaded from: classes4.dex */
public class C23464a {

    /* renamed from: a */
    private final List f113978a;

    /* renamed from: b */
    private final String f113979b;

    public C23464a(List list, String str) {
        this.f113978a = (List) AbstractC23122k6.m118609a(list);
        this.f113979b = (String) AbstractC23122k6.m118609a(str);
    }

    /* renamed from: a */
    public String m123197a() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f113979b);
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
                try {
                    byte[] bArr = new byte[ZVideoUtilMetadata.FF_PROFILE_H264_INTRA];
                    for (int i11 = 0; i11 < this.f113978a.size(); i11++) {
                        FileInputStream fileInputStream = new FileInputStream((String) this.f113978a.get(i11));
                        try {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
                            try {
                                zipOutputStream.putNextEntry(new ZipEntry(((String) this.f113978a.get(i11)).substring(((String) this.f113978a.get(i11)).lastIndexOf("zam"))));
                                while (true) {
                                    int read = bufferedInputStream.read(bArr, 0, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
                                    if (read == -1) {
                                        break;
                                    }
                                    zipOutputStream.write(bArr, 0, read);
                                }
                                bufferedInputStream.close();
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    bufferedInputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    }
                    String str = this.f113979b;
                    zipOutputStream.close();
                    fileOutputStream.close();
                    return str;
                } catch (Throwable th6) {
                    try {
                        zipOutputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                }
                throw th8;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }
}
