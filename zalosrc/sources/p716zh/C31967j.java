package p716zh;

import a30.C0107f;
import android.text.TextUtils;
import b40.C2546u;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import java.util.Objects;
import p405ov.C24559a;
import vg.AbstractC28054e7;

/* renamed from: zh.j */
/* loaded from: classes3.dex */
public class C31967j {

    /* renamed from: d */
    static C31967j f146917d;

    /* renamed from: a */
    private int f146918a = -1;

    /* renamed from: b */
    private MessageId f146919b = null;

    /* renamed from: c */
    private String f146920c = "";

    /* renamed from: a */
    public static synchronized C31967j m153687a() {
        C31967j c31967j;
        synchronized (C31967j.class) {
            try {
                if (f146917d == null) {
                    f146917d = new C31967j();
                }
                c31967j = f146917d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c31967j;
    }

    /* renamed from: b */
    public boolean m153688b() {
        if (this.f146920c != null && C7853b.m40052a0().m40139l0(this.f146920c)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m153689c(int i11) {
        if (i11 != -1 && i11 == this.f146918a && this.f146920c != null && C7853b.m40052a0().m40139l0(this.f146920c)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m153690d(int i11) {
        if (i11 != -1 && i11 == this.f146918a && this.f146920c != null && C7853b.m40052a0().m40142n0(this.f146920c)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m153691e(String str, MessageId messageId) {
        if (!TextUtils.isEmpty(str) && TextUtils.equals(this.f146920c, str) && Objects.equals(this.f146919b, messageId)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m153692f(int i11, String str, MessageId messageId, int i12, AbstractC28054e7 abstractC28054e7, boolean z11) {
        if (i12 < 0) {
            i12 = 0;
        }
        try {
            this.f146920c = str;
            this.f146918a = i11;
            this.f146919b = messageId;
            if (i11 == 1) {
                C7853b.m40052a0().m40121b1(true);
                C7853b.m40052a0().m40123c1(this.f146919b);
            }
            C7853b.m40052a0().m40129g1(this.f146919b);
            C7853b.m40052a0().m40092C0(this.f146920c, i12, abstractC28054e7, z11);
        } catch (Exception e11) {
            if (i11 == 1) {
                C24559a.m127935e("NaN", str, e11);
            }
            if (this.f146919b != null) {
                C0107f.m476a().m478c(this.f146919b, 0);
                this.f146919b = null;
            }
            this.f146920c = "";
            this.f146918a = -1;
        }
    }

    /* renamed from: g */
    public void m153693g(C7853b.b bVar) {
        C7853b.m40052a0().m40126e1(bVar);
    }

    /* renamed from: h */
    public void m153694h(C7853b.d dVar) {
        C7853b.m40052a0().m40127f1(dVar);
    }

    /* renamed from: i */
    public void m153695i() {
        try {
            if (this.f146919b == null) {
                C0107f.m476a().m478c(this.f146919b, 0);
                this.f146919b = null;
            }
            if (this.f146918a == 1) {
                C2546u.f10363a.m12825l(this.f146919b, C2546u.b.f10375r);
            }
            this.f146920c = "";
            this.f146918a = -1;
            C7853b.m40052a0().m40136j1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
