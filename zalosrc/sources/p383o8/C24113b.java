package p383o8;

import android.content.Context;
import com.google.android.datatransport.cct.C3994a;
import java.nio.charset.Charset;
import p010a4.C0128u;
import p232i8.AbstractC20411p;
import p232i8.C20384b0;
import p292k8.AbstractC21569b0;
import p318l8.C22120h;
import p342m6.AbstractC22888j;
import p418p8.InterfaceC24673i;
import p668y3.C30276b;
import p668y3.InterfaceC30279e;
import p668y3.InterfaceC30281g;

/* renamed from: o8.b */
/* loaded from: classes.dex */
public class C24113b {

    /* renamed from: c */
    private static final C22120h f116497c = new C22120h();

    /* renamed from: d */
    private static final String f116498d = m125995e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e */
    private static final String f116499e = m125995e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f */
    private static final InterfaceC30279e f116500f = new InterfaceC30279e() { // from class: o8.a
        @Override // p668y3.InterfaceC30279e
        public final Object apply(Object obj) {
            byte[] m125994d;
            m125994d = C24113b.m125994d((AbstractC21569b0) obj);
            return m125994d;
        }
    };

    /* renamed from: a */
    private final C24116e f116501a;

    /* renamed from: b */
    private final InterfaceC30279e f116502b;

    C24113b(C24116e c24116e, InterfaceC30279e interfaceC30279e) {
        this.f116501a = c24116e;
        this.f116502b = interfaceC30279e;
    }

    /* renamed from: b */
    public static C24113b m125993b(Context context, InterfaceC24673i interfaceC24673i, C20384b0 c20384b0) {
        C0128u.m563f(context);
        InterfaceC30281g m565g = C0128u.m561c().m565g(new C3994a(f116498d, f116499e));
        C30276b m149414b = C30276b.m149414b("json");
        InterfaceC30279e interfaceC30279e = f116500f;
        return new C24113b(new C24116e(m565g.mo552a("FIREBASE_CRASHLYTICS_REPORT", AbstractC21569b0.class, m149414b, interfaceC30279e), interfaceC24673i.mo128225b(), c20384b0), interfaceC30279e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ byte[] m125994d(AbstractC21569b0 abstractC21569b0) {
        return f116497c.m115367G(abstractC21569b0).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    private static String m125995e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
            for (int i11 = 0; i11 < str.length(); i11++) {
                sb2.append(str.charAt(i11));
                if (str2.length() > i11) {
                    sb2.append(str2.charAt(i11));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    /* renamed from: c */
    public AbstractC22888j m125996c(AbstractC20411p abstractC20411p, boolean z11) {
        return this.f116501a.m126012i(abstractC20411p, z11).m117594a();
    }
}
