package p564v1;

import android.content.Context;
import androidx.core.util.AbstractC1480b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: v1.b */
/* loaded from: classes2.dex */
public abstract class AbstractC27421b {

    /* renamed from: a */
    int f129078a;

    /* renamed from: b */
    a f129079b;

    /* renamed from: c */
    Context f129080c;

    /* renamed from: d */
    boolean f129081d = false;

    /* renamed from: e */
    boolean f129082e = false;

    /* renamed from: f */
    boolean f129083f = true;

    /* renamed from: g */
    boolean f129084g = false;

    /* renamed from: h */
    boolean f129085h = false;

    /* renamed from: v1.b$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo9426a(AbstractC27421b abstractC27421b, Object obj);
    }

    public AbstractC27421b(Context context) {
        this.f129080c = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m140436a() {
        this.f129082e = true;
        m140444j();
    }

    /* renamed from: b */
    public boolean m140437b() {
        return mo140426k();
    }

    /* renamed from: c */
    public void m140438c() {
        this.f129085h = false;
    }

    /* renamed from: d */
    public String m140439d(Object obj) {
        StringBuilder sb2 = new StringBuilder(64);
        AbstractC1480b.m7473a(obj, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: e */
    public void m140440e() {
    }

    /* renamed from: f */
    public void m140441f(Object obj) {
        a aVar = this.f129079b;
        if (aVar != null) {
            aVar.mo9426a(this, obj);
        }
    }

    /* renamed from: g */
    public void mo140425g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f129078a);
        printWriter.print(" mListener=");
        printWriter.println(this.f129079b);
        if (this.f129081d || this.f129084g || this.f129085h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f129081d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f129084g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f129085h);
        }
        if (this.f129082e || this.f129083f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f129082e);
            printWriter.print(" mReset=");
            printWriter.println(this.f129083f);
        }
    }

    /* renamed from: h */
    public void m140442h() {
        mo140427m();
    }

    /* renamed from: i */
    public boolean m140443i() {
        return this.f129082e;
    }

    /* renamed from: j */
    protected void m140444j() {
    }

    /* renamed from: k */
    protected abstract boolean mo140426k();

    /* renamed from: l */
    public void m140445l() {
        if (this.f129081d) {
            m140442h();
        } else {
            this.f129084g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void mo140427m() {
    }

    /* renamed from: n */
    protected void m140446n() {
    }

    /* renamed from: o */
    protected abstract void mo139157o();

    /* renamed from: p */
    protected void m140447p() {
    }

    /* renamed from: q */
    public void m140448q(int i11, a aVar) {
        if (this.f129079b == null) {
            this.f129079b = aVar;
            this.f129078a = i11;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: r */
    public void m140449r() {
        m140446n();
        this.f129083f = true;
        this.f129081d = false;
        this.f129082e = false;
        this.f129084g = false;
        this.f129085h = false;
    }

    /* renamed from: s */
    public void m140450s() {
        if (this.f129085h) {
            m140445l();
        }
    }

    /* renamed from: t */
    public final void m140451t() {
        this.f129081d = true;
        this.f129083f = false;
        this.f129082e = false;
        mo139157o();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        AbstractC1480b.m7473a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f129078a);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    public void m140452u() {
        this.f129081d = false;
        m140447p();
    }

    /* renamed from: v */
    public void m140453v(a aVar) {
        a aVar2 = this.f129079b;
        if (aVar2 != null) {
            if (aVar2 == aVar) {
                this.f129079b = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }
}
