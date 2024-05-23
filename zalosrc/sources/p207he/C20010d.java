package p207he;

import ag0.AbstractC0837p0;
import com.zing.zalo.p062db.C7962g;
import hm0.C20097d;
import hm0.InterfaceC20098e;
import java.util.Hashtable;
import p135em.C18489c;

/* renamed from: he.d */
/* loaded from: classes3.dex */
public class C20010d extends C20097d {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m103836j(String str, Hashtable hashtable, String str2, String str3, String str4) {
        m104498d(C18489c.m97849k(C7962g.c.a.QOS_TALK_ZING_S) + "/api/qos/uploadcalllog", str, hashtable, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m103837k(String str, String str2, Hashtable hashtable, String str3, String str4, String str5) {
        m104498d(str, str2, hashtable, str3, str4, str5);
    }

    /* renamed from: l */
    public void m103838l(final String str, InterfaceC20098e interfaceC20098e, final Hashtable hashtable, final String str2, final String str3, final String str4) {
        m104500f(interfaceC20098e);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: he.b
            @Override // java.lang.Runnable
            public final void run() {
                C20010d.this.m103836j(str, hashtable, str2, str3, str4);
            }
        });
    }

    /* renamed from: m */
    public void m103839m(final String str, final String str2, InterfaceC20098e interfaceC20098e, final Hashtable hashtable, final String str3, final String str4, final String str5) {
        m104500f(interfaceC20098e);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: he.c
            @Override // java.lang.Runnable
            public final void run() {
                C20010d.this.m103837k(str, str2, hashtable, str3, str4, str5);
            }
        });
    }
}
