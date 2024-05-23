package p043c;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import p025b.AbstractC2472a;
import p174g.AbstractC19175a;
import p174g.C19176b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.k */
/* loaded from: classes2.dex */
public final class C3175k implements InterfaceC3174j {

    /* renamed from: a */
    private static final String f13399a = "n";

    /* renamed from: b */
    private static C3175k f13400b;

    private C3175k() {
        try {
            m15970d(AbstractC2472a.f10076a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C3175k m15967a() {
        if (f13400b == null) {
            f13400b = new C3175k();
        }
        return f13400b;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x002f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:33:0x002f */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m15968b(Context context, String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3 = null;
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
                boolean z11 = true;
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (z11) {
                            z11 = false;
                        } else {
                            sb2.append('\n');
                        }
                        sb2.append(readLine);
                    } catch (Exception unused) {
                        AbstractC3173i.m15965a(f13399a, "Error opening asset " + str);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused2) {
                                AbstractC3173i.m15965a(f13399a, "Error closing asset " + str);
                            }
                        }
                        return null;
                    }
                }
                String sb3 = sb2.toString();
                try {
                    bufferedReader.close();
                } catch (Exception unused3) {
                    AbstractC3173i.m15965a(f13399a, "Error closing asset " + str);
                }
                return sb3;
            } catch (Exception unused4) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader3 != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader3 = bufferedReader2;
            if (bufferedReader3 != null) {
                try {
                    bufferedReader3.close();
                } catch (Exception unused5) {
                    AbstractC3173i.m15965a(f13399a, "Error closing asset " + str);
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    public String m15969c(String str) {
        try {
            String[] strArr = AbstractC3177m.f13412l;
            String[] split = str.split(strArr[6]);
            String str2 = split[0];
            String[] split2 = split[1].split(strArr[7]);
            return AbstractC19175a.m100631e(C19176b.m100632a().m100633b(str2, split[2])).replace(split2[0], "").replace(split2[1], "").replace(split2[2], "");
        } catch (Exception e11) {
            AbstractC3173i.m15966b(f13399a, "parseBackup", e11);
            return null;
        }
    }

    /* renamed from: d */
    public void m15970d(Context context) {
        try {
            String[] strArr = AbstractC3177m.f13412l;
            String str = strArr[2];
            String str2 = strArr[3];
            String str3 = strArr[4];
            String m15968b = m15968b(context, str);
            String[] split = m15968b.substring(m15968b.indexOf(str2), m15968b.indexOf(str3)).replace(str2, "").replace(str3, "").split(strArr[5]);
            AbstractC3177m.f13409i = m15969c(split[0]);
            AbstractC3177m.f13410j = m15969c(split[1]);
            AbstractC3177m.f13411k = m15969c(split[2]);
        } catch (Exception e11) {
            AbstractC3173i.m15966b(f13399a, "loadData", e11);
        }
    }
}
