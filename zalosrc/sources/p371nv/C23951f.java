package p371nv;

import fn0.AbstractC19074t;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: nv.f */
/* loaded from: classes.dex */
public final class C23951f extends AbstractC23950e {

    /* renamed from: c */
    private File f115922c;

    /* renamed from: d */
    private long f115923d;

    /* renamed from: e */
    private PrintWriter f115924e;

    /* renamed from: f */
    private final DateFormat f115925f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23951f(File file, String str, long j11) {
        super(file, str, j11);
        AbstractC19074t.m100208f(file, "logFolder");
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(2, 2);
        AbstractC19074t.m100207e(dateTimeInstance, "getDateTimeInstance(Date…EDIUM, DateFormat.MEDIUM)");
        this.f115925f = dateTimeInstance;
        try {
            m125334l();
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    private final void m125333k() {
        PrintWriter printWriter = this.f115924e;
        if (printWriter == null) {
            return;
        }
        if (printWriter != null) {
            try {
                printWriter.flush();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        PrintWriter printWriter2 = this.f115924e;
        if (printWriter2 != null) {
            printWriter2.close();
        }
        this.f115922c = null;
        this.f115924e = null;
        this.f115923d = 0L;
    }

    /* renamed from: l */
    private final void m125334l() {
        this.f115922c = new File(m125332f(), String.valueOf(System.currentTimeMillis()));
        File file = this.f115922c;
        AbstractC19074t.m100205c(file);
        this.f115924e = new PrintWriter(new OutputStreamWriter(m125330d(file), "UTF-8"));
    }

    @Override // p371nv.AbstractC23950e
    /* renamed from: e */
    public void mo125331e() {
        try {
            PrintWriter printWriter = this.f115924e;
            if (printWriter != null) {
                printWriter.flush();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: m */
    public final void m125335m(int i11, String str, String str2, Throwable th2) {
        File file;
        try {
            long j11 = this.f115923d;
            this.f115923d = 1 + j11;
            if (j11 % 1000 == 0 && (file = this.f115922c) != null) {
                AbstractC19074t.m100205c(file);
                if (file.exists()) {
                    File file2 = this.f115922c;
                    AbstractC19074t.m100205c(file2);
                    if (file2.length() > 131072) {
                        m125333k();
                    }
                }
            }
            if (this.f115924e == null) {
                m125334l();
            }
            switch (i11) {
                case 2:
                    PrintWriter printWriter = this.f115924e;
                    AbstractC19074t.m100205c(printWriter);
                    printWriter.append((CharSequence) "V/");
                    break;
                case 3:
                    PrintWriter printWriter2 = this.f115924e;
                    AbstractC19074t.m100205c(printWriter2);
                    printWriter2.append((CharSequence) "D/");
                    break;
                case 4:
                    PrintWriter printWriter3 = this.f115924e;
                    AbstractC19074t.m100205c(printWriter3);
                    printWriter3.append((CharSequence) "I/");
                    break;
                case 5:
                    PrintWriter printWriter4 = this.f115924e;
                    AbstractC19074t.m100205c(printWriter4);
                    printWriter4.append((CharSequence) "W/");
                    break;
                case 6:
                    PrintWriter printWriter5 = this.f115924e;
                    AbstractC19074t.m100205c(printWriter5);
                    printWriter5.append((CharSequence) "E/");
                    break;
                case 7:
                    PrintWriter printWriter6 = this.f115924e;
                    AbstractC19074t.m100205c(printWriter6);
                    printWriter6.append((CharSequence) "A/");
                    break;
            }
            if (str != null && str.length() != 0) {
                PrintWriter printWriter7 = this.f115924e;
                AbstractC19074t.m100205c(printWriter7);
                printWriter7.append((CharSequence) str).append(' ');
            }
            PrintWriter printWriter8 = this.f115924e;
            AbstractC19074t.m100205c(printWriter8);
            printWriter8.append((CharSequence) str2).append('\n');
            if (th2 != null) {
                PrintWriter printWriter9 = this.f115924e;
                AbstractC19074t.m100205c(printWriter9);
                th2.printStackTrace(printWriter9);
                PrintWriter printWriter10 = this.f115924e;
                AbstractC19074t.m100205c(printWriter10);
                printWriter10.append('\n');
            }
            if (this.f115923d % 100 == 0) {
                PrintWriter printWriter11 = this.f115924e;
                AbstractC19074t.m100205c(printWriter11);
                printWriter11.append((CharSequence) "Time ").append((CharSequence) this.f115925f.format(new Date(System.currentTimeMillis()))).append('\n');
                PrintWriter printWriter12 = this.f115924e;
                AbstractC19074t.m100205c(printWriter12);
                printWriter12.flush();
            }
        } catch (Exception unused) {
        }
    }
}
