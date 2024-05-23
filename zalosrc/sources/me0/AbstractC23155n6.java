package me0;

import ae.C0766k;
import android.content.Context;
import au.AbstractC2371s;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.io.File;
import java.io.IOException;
import mm0.AbstractC23350e;
import mm0.C23348c;

/* renamed from: me0.n6 */
/* loaded from: classes4.dex */
public abstract class AbstractC23155n6 {

    /* renamed from: a */
    static final String f112293a = "n6";

    /* renamed from: me0.n6$a */
    /* loaded from: classes4.dex */
    class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C23348c f112294a;

        /* renamed from: b */
        final /* synthetic */ File f112295b;

        a(C23348c c23348c, File file) {
            this.f112294a = c23348c;
            this.f112295b = file;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str = AbstractC23155n6.f112293a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("error_message: ");
            sb2.append(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str = AbstractC23155n6.f112293a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("entity: ");
            sb2.append(obj);
            try {
                this.f112294a.m122762b(1024);
            } catch (IOException e11) {
                AbstractC23350e.m122776f(AbstractC23155n6.f112293a, e11);
                try {
                    this.f112295b.delete();
                } catch (Exception e12) {
                    AbstractC23350e.m122776f(AbstractC23155n6.f112293a, e12);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m119167a(Context context) {
        try {
            File file = new File(context.getFilesDir(), "log_data.dat");
            C23348c c23348c = new C23348c(file, new File(context.getFilesDir(), "log_data.dat.tmp"), 1024, 12);
            byte[] m122761a = c23348c.m122761a(1024);
            if (m122761a != null && m122761a.length != 0) {
                int length = m122761a.length / 12;
                int length2 = m122761a.length + 4;
                byte[] bArr = new byte[length2];
                System.arraycopy(m122761a, 0, bArr, 4, m122761a.length);
                byte[] m93344g = AbstractC17522a.m93344g(length);
                bArr[0] = m93344g[0];
                bArr[1] = m93344g[1];
                bArr[2] = m93344g[2];
                bArr[3] = m93344g[3];
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a(c23348c, file));
                c0766k.mo1594a5(bArr);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("uploadLog (length):");
                sb2.append(length2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("uploadLog:");
                sb3.append(AbstractC2371s.m12396a(bArr));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f112293a, e11);
        }
    }
}
