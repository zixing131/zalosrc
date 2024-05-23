package cx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/* renamed from: cx.c */
/* loaded from: classes4.dex */
public class C17578c {

    /* renamed from: a */
    private final File f89536a;

    public C17578c(File file) {
        this.f89536a = file;
    }

    /* renamed from: a */
    private String m93610a(String str, InterfaceC17577b interfaceC17577b) {
        int i11;
        int indexOf;
        int indexOf2 = str.indexOf("->");
        if (indexOf2 < 0 || (indexOf = str.indexOf(58, (i11 = indexOf2 + 2))) < 0) {
            return null;
        }
        String trim = str.substring(0, indexOf2).trim();
        if (!interfaceC17577b.mo93607a(trim, str.substring(i11, indexOf).trim())) {
            return null;
        }
        return trim;
    }

    /* renamed from: b */
    private void m93611b(String str, String str2, InterfaceC17577b interfaceC17577b) {
        int indexOf;
        int indexOf2;
        int indexOf3;
        int i11;
        int i12;
        String str3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int parseInt;
        int indexOf4 = str2.indexOf(58);
        int i19 = -1;
        if (indexOf4 < 0) {
            indexOf = -1;
        } else {
            indexOf = str2.indexOf(58, indexOf4 + 1);
        }
        int indexOf5 = str2.indexOf(32, indexOf + 2);
        int i21 = indexOf5 + 1;
        int indexOf6 = str2.indexOf(40, i21);
        if (indexOf6 < 0) {
            indexOf2 = -1;
        } else {
            indexOf2 = str2.indexOf(41, indexOf6 + 1);
        }
        if (indexOf2 < 0) {
            indexOf3 = -1;
        } else {
            indexOf3 = str2.indexOf(58, indexOf2 + 1);
        }
        if (indexOf3 >= 0) {
            i19 = str2.indexOf(58, indexOf3 + 1);
        }
        if (i19 >= 0) {
            i11 = i19;
        } else if (indexOf3 >= 0) {
            i11 = indexOf3;
        } else if (indexOf2 >= 0) {
            i11 = indexOf2;
        } else {
            i11 = indexOf5;
        }
        int indexOf7 = str2.indexOf("->", i11 + 1);
        if (indexOf5 >= 0 && indexOf7 >= 0) {
            String trim = str2.substring(indexOf + 1, indexOf5).trim();
            if (indexOf6 >= 0) {
                i12 = indexOf6;
            } else {
                i12 = indexOf7;
            }
            String trim2 = str2.substring(i21, i12).trim();
            String trim3 = str2.substring(indexOf7 + 2).trim();
            int lastIndexOf = trim2.lastIndexOf(46);
            int i22 = 0;
            if (lastIndexOf >= 0) {
                str3 = trim2.substring(0, lastIndexOf);
                trim2 = trim2.substring(lastIndexOf + 1);
            } else {
                str3 = str;
            }
            String str4 = trim2;
            if (trim.length() > 0 && str4.length() > 0 && trim3.length() > 0) {
                if (indexOf2 < 0) {
                    interfaceC17577b.mo93609c(str3, trim, str4, str, trim3);
                    return;
                }
                if (indexOf >= 0) {
                    i22 = Integer.parseInt(str2.substring(0, indexOf4).trim());
                    i13 = Integer.parseInt(str2.substring(indexOf4 + 1, indexOf).trim());
                    i15 = i13;
                    i14 = i22;
                } else {
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                }
                if (indexOf3 >= 0) {
                    int i23 = indexOf3 + 1;
                    if (i19 > 0) {
                        i18 = i19;
                    } else {
                        i18 = indexOf7;
                    }
                    int parseInt2 = Integer.parseInt(str2.substring(i23, i18).trim());
                    if (i19 < 0) {
                        parseInt = parseInt2;
                    } else {
                        parseInt = Integer.parseInt(str2.substring(i19 + 1, indexOf7).trim());
                    }
                    i16 = parseInt;
                    i17 = parseInt2;
                } else {
                    i16 = i13;
                    i17 = i22;
                }
                interfaceC17577b.mo93608b(str3, i17, i16, trim, str4, str2.substring(indexOf6 + 1, indexOf2).trim(), str, i14, i15, trim3);
            }
        }
    }

    /* renamed from: c */
    public void m93612c(InterfaceC17577b interfaceC17577b) {
        LineNumberReader lineNumberReader = new LineNumberReader(new BufferedReader(new FileReader(this.f89536a)));
        String str = null;
        while (true) {
            try {
                try {
                    String readLine = lineNumberReader.readLine();
                    if (readLine == null) {
                        try {
                            lineNumberReader.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    String trim = readLine.trim();
                    if (!trim.startsWith("#")) {
                        if (trim.endsWith(":")) {
                            str = m93610a(trim, interfaceC17577b);
                        } else if (str != null) {
                            m93611b(str, trim, interfaceC17577b);
                        }
                    }
                } catch (IOException e11) {
                    throw new IOException("Can't process mapping file (" + e11.getMessage() + ")");
                }
            } catch (Throwable th2) {
                try {
                    lineNumberReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
        }
    }
}
