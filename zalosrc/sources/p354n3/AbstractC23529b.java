package p354n3;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RunnableC3975h;
import java.io.File;
import lu.C22652b;
import p379o3.AbstractC24006q;
import p379o3.AbstractRunnableC23992c;
import p379o3.C23994e;
import p379o3.C23999j;
import p379o3.C24002m;
import p379o3.C24003n;
import p471r3.EnumC25629a;

/* renamed from: n3.b */
/* loaded from: classes.dex */
public abstract class AbstractC23529b {

    /* renamed from: a */
    protected Activity f114322a;

    /* renamed from: b */
    protected InterfaceC3968a f114323b;

    /* renamed from: c */
    protected Object f114324c;

    /* renamed from: d */
    private View f114325d;

    /* renamed from: e */
    private Context f114326e;

    /* renamed from: f */
    private int f114327f = 0;

    /* renamed from: g */
    private int f114328g = 0;

    public AbstractC23529b(Activity activity) {
        this.f114322a = activity;
    }

    /* renamed from: Q */
    private void m123574Q() {
        this.f114324c = null;
        this.f114327f = 0;
        this.f114328g = 0;
    }

    /* renamed from: R */
    private AbstractC23529b m123575R() {
        return this;
    }

    /* renamed from: h */
    public static File m123576h(Context context, String str) {
        File m18747D = AbstractC3972e.m18747D(AbstractC3972e.m18807t(context, 1), str);
        if (m18747D == null) {
            return AbstractC3972e.m18747D(AbstractC3972e.m18807t(context, 0), str);
        }
        return m18747D;
    }

    /* renamed from: A */
    public AbstractC23529b m123577A(String str, C24003n c24003n, int i11, C23999j c23999j) {
        return m123620z(str, c24003n, i11, C3979l.b.UNKNOWN, c23999j);
    }

    /* renamed from: B */
    public AbstractC23529b m123578B(String str, C24003n c24003n, C3979l.b bVar, C23999j c23999j) {
        ((C23999j) ((C23999j) ((C23999j) c23999j.m125757D3(c24003n.f116260a).m125777n2(c24003n.f116271l).m125635v1(str)).m125761G2(bVar).m125596P0(c24003n.f116275p)).m125602Z(c24003n.f116276q)).m125773e3(c24003n.f116263d).m125769Y2(c24003n.f116261b).m125781r3(c24003n.f116272m).m125783y3(c24003n.f116266g).m125778n3(c24003n.f116268i).m125776k3(c24003n.f116280u).m125779o3(c24003n.f116269j);
        int i11 = c24003n.f116264e;
        if (i11 > 0) {
            c23999j.m125774f3(i11);
        }
        c23999j.m125775h2(c24003n.f116282w);
        int i12 = c24003n.f116262c;
        if (i12 >= 0) {
            c23999j.m125762H1(i12);
        }
        if (c24003n.f116265f) {
            c23999j.m125611h1(26005, 0);
            c24003n.f116265f = false;
        }
        if (c24003n.f116283x) {
            c23999j.m125611h1(26008, 0);
            c24003n.f116283x = false;
        }
        if (c24003n.f116284y) {
            c23999j.m125611h1(26016, 99999);
            c24003n.f116284y = false;
        }
        if (c24003n.f116273n) {
            c23999j.m125611h1(26014, 0);
            c24003n.f116273n = false;
        }
        if (c24003n.f116267h) {
            c23999j.m125611h1(26015, 0);
            c24003n.f116267h = false;
        }
        return m123587K(c23999j);
    }

    /* renamed from: C */
    public AbstractC23529b m123579C(String str, C24003n c24003n, C23999j c23999j) {
        return m123578B(str, c24003n, C3979l.b.UNKNOWN, c23999j);
    }

    /* renamed from: D */
    public AbstractC23529b m123580D(String str, boolean z11, boolean z12, int i11, int i12) {
        return m123581E(str, z11, z12, i11, i12, null, null, 0);
    }

    /* renamed from: E */
    public AbstractC23529b m123581E(String str, boolean z11, boolean z12, int i11, int i12, Drawable drawable, Drawable drawable2, int i13) {
        return m123582F(str, z11, z12, i11, i12, drawable, drawable2, i13, 0.0f);
    }

    /* renamed from: F */
    public AbstractC23529b m123582F(String str, boolean z11, boolean z12, int i11, int i12, Drawable drawable, Drawable drawable2, int i13, float f11) {
        if (this.f114323b instanceof InterfaceC3968a) {
            C23999j.m125695L1(this.f114322a, m123611q(), this.f114323b, str, z11, z12, i11, i12, drawable, drawable2, i13, f11, Float.MAX_VALUE, this.f114324c, this.f114327f, 0, this.f114328g, EnumC25629a.DEFAULT);
            m123574Q();
        }
        return m123575R();
    }

    /* renamed from: G */
    public AbstractC23529b m123583G(String str, boolean z11, boolean z12, int i11, int i12, Drawable drawable, C23999j c23999j, EnumC25629a enumC25629a) {
        ((C23999j) ((C23999j) ((C23999j) c23999j.m125757D3(i11).m125777n2(i12).m125635v1(str)).m125596P0(z11)).m125602Z(z12)).m125769Y2(drawable).m125783y3(enumC25629a);
        return m123587K(c23999j);
    }

    /* renamed from: H */
    public AbstractC23529b m123584H(String str, boolean z11, boolean z12, int i11, int i12, C23999j c23999j) {
        return m123585I(str, z11, z12, i11, i12, c23999j, EnumC25629a.DEFAULT);
    }

    /* renamed from: I */
    public AbstractC23529b m123585I(String str, boolean z11, boolean z12, int i11, int i12, C23999j c23999j, EnumC25629a enumC25629a) {
        ((C23999j) ((C23999j) ((C23999j) c23999j.m125757D3(i11).m125777n2(i12).m125635v1(str)).m125596P0(z11)).m125602Z(z12)).m125783y3(enumC25629a);
        return m123587K(c23999j);
    }

    /* renamed from: J */
    public AbstractC23529b m123586J(String str, boolean z11, boolean z12, int i11, int i12, C23999j c23999j, boolean z13, EnumC25629a enumC25629a, boolean z14) {
        ((C23999j) ((C23999j) ((C23999j) c23999j.m125757D3(i11).m125777n2(i12).m125635v1(str)).m125596P0(z11)).m125602Z(z12)).m125776k3(z13).m125783y3(enumC25629a).m125782s3(z14);
        return m123587K(c23999j);
    }

    /* renamed from: K */
    public AbstractC23529b m123587K(C23999j c23999j) {
        C22652b.m117234a(c23999j.m125633u0());
        InterfaceC3968a interfaceC3968a = this.f114323b;
        if (interfaceC3968a instanceof InterfaceC3968a) {
            c23999j.m125763H2(interfaceC3968a);
            m123590N(c23999j);
        }
        return m123575R();
    }

    /* renamed from: L */
    public void m123588L(String str, C24003n c24003n, int i11, C23999j c23999j) {
        ((C23999j) ((C23999j) ((C23999j) c23999j.m125757D3(i11).m125777n2(c24003n.f116271l).m125635v1(str)).m125596P0(c24003n.f116275p)).m125602Z(c24003n.f116276q)).m125773e3(c24003n.f116263d).m125769Y2(c24003n.f116261b).m125781r3(c24003n.f116272m).m125783y3(c24003n.f116266g).m125778n3(c24003n.f116268i).m125776k3(c24003n.f116280u).m125779o3(c24003n.f116269j);
        int i12 = c24003n.f116264e;
        if (i12 > 0) {
            c23999j.m125774f3(i12);
        }
        c23999j.m125775h2(c24003n.f116282w);
        int i13 = c24003n.f116262c;
        if (i13 >= 0) {
            c23999j.m125762H1(i13);
        }
        m123587K(c23999j);
    }

    /* renamed from: M */
    public AbstractC23529b m123589M(String str) {
        File m123603i = m123603i(str);
        if (m123603i != null) {
            m123603i.delete();
        }
        return m123575R();
    }

    /* renamed from: N */
    protected AbstractC23529b m123590N(AbstractRunnableC23992c abstractRunnableC23992c) {
        abstractRunnableC23992c.m125603Z0(this.f114324c);
        abstractRunnableC23992c.m125627r1(null);
        abstractRunnableC23992c.m125600W0(this.f114327f);
        Activity activity = this.f114322a;
        if (activity != null) {
            abstractRunnableC23992c.m125621p(activity);
        } else {
            abstractRunnableC23992c.mo125623q(m123611q());
        }
        m123574Q();
        return m123575R();
    }

    /* renamed from: O */
    public AbstractC23529b m123591O(int i11) {
        this.f114328g = i11;
        return m123575R();
    }

    /* renamed from: P */
    public AbstractC23529b m123592P(Object obj) {
        this.f114324c = obj;
        return m123575R();
    }

    /* renamed from: S */
    public boolean m123593S(int i11, View view, ViewGroup viewGroup, String str) {
        if (!(viewGroup instanceof ExpandableListView)) {
            return RunnableC3975h.m18827i(i11, view, viewGroup, str);
        }
        throw new IllegalArgumentException("Please use the other shouldDelay methods for expandable list.");
    }

    /* renamed from: T */
    public AbstractC23529b m123594T(AbstractC24006q abstractC24006q) {
        InterfaceC3968a interfaceC3968a = this.f114323b;
        if (interfaceC3968a instanceof InterfaceC3968a) {
            abstractC24006q.m125878q2(interfaceC3968a);
            abstractC24006q.m125603Z0(this.f114324c);
            Activity activity = this.f114322a;
            if (activity != null) {
                abstractC24006q.m125621p(activity);
            } else {
                abstractC24006q.mo125623q(this.f114326e);
            }
        }
        return m123575R();
    }

    /* renamed from: U */
    public AbstractC23529b m123595U(C23994e c23994e) {
        m123598c(c23994e);
        c23994e.m125629t();
        return m123575R();
    }

    /* renamed from: a */
    public AbstractC23529b m123596a(String str, Class cls, long j11, C23994e c23994e) {
        ((C23994e) ((C23994e) ((C23994e) c23994e.m125628s1(cls)).m125635v1(str)).m125602Z(true)).m125599W(j11);
        return m123598c(c23994e);
    }

    /* renamed from: b */
    public AbstractC23529b m123597b(String str, Class cls, C23994e c23994e) {
        ((C23994e) c23994e.m125628s1(cls)).m125635v1(str);
        return m123598c(c23994e);
    }

    /* renamed from: c */
    public AbstractC23529b m123598c(C23994e c23994e) {
        return m123590N(c23994e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public AbstractC23529b m123599d() {
        InterfaceC3968a interfaceC3968a = this.f114323b;
        if (interfaceC3968a != 0) {
            if (interfaceC3968a instanceof InterfaceC3968a) {
                interfaceC3968a.setImageBitmap(null);
                interfaceC3968a.setTag(1090453505, null);
                interfaceC3968a.setTag(1090453509, null);
            } else if (interfaceC3968a instanceof WebView) {
                WebView webView = (WebView) interfaceC3968a;
                webView.stopLoading();
                webView.clearView();
                webView.setTag(1090453505, null);
            } else if (interfaceC3968a instanceof TextView) {
                ((TextView) interfaceC3968a).setText("");
            } else if (interfaceC3968a instanceof ImageView) {
                ImageView imageView = (ImageView) interfaceC3968a;
                imageView.setImageBitmap(null);
                imageView.setTag(1090453505, null);
                imageView.setTag(1090453509, null);
            }
        }
        return m123575R();
    }

    /* renamed from: e */
    public AbstractC23529b m123600e(String str, File file, C23994e c23994e) {
        ((C23994e) ((C23994e) c23994e.m125635v1(str)).m125628s1(File.class)).m125620o1(file);
        return m123598c(c23994e);
    }

    /* renamed from: f */
    public AbstractC23529b m123601f(String str, File file, C24002m c24002m) {
        InterfaceC3968a interfaceC3968a = this.f114323b;
        if (interfaceC3968a instanceof InterfaceC3968a) {
            c24002m.m125829J1(interfaceC3968a);
            c24002m.m125635v1(str);
            c24002m.m125620o1(file);
            Activity activity = this.f114322a;
            if (activity != null) {
                c24002m.m125621p(activity);
            } else {
                c24002m.mo125623q(this.f114326e);
            }
        }
        return m123575R();
    }

    /* renamed from: g */
    public AbstractC23529b m123602g(String str, C24002m c24002m) {
        InterfaceC3968a interfaceC3968a = this.f114323b;
        if (interfaceC3968a instanceof InterfaceC3968a) {
            c24002m.m125829J1(interfaceC3968a);
            c24002m.m125635v1(str);
            Activity activity = this.f114322a;
            if (activity != null) {
                c24002m.m125621p(activity);
            } else {
                c24002m.mo125623q(this.f114326e);
            }
        }
        return m123575R();
    }

    /* renamed from: i */
    public File m123603i(String str) {
        File m18747D = AbstractC3972e.m18747D(AbstractC3972e.m18807t(m123611q(), 1), str);
        if (m18747D == null) {
            return AbstractC3972e.m18747D(AbstractC3972e.m18807t(m123611q(), 0), str);
        }
        return m18747D;
    }

    /* renamed from: j */
    public File m123604j(String str) {
        File m18747D = AbstractC3972e.m18747D(AbstractC3972e.m18750G(m123611q(), 1), str);
        if (m18747D == null) {
            return AbstractC3972e.m18747D(AbstractC3972e.m18750G(this.f114326e, 0), str);
        }
        return m18747D;
    }

    /* renamed from: k */
    public C3979l m123605k(String str, int i11, EnumC25629a enumC25629a) {
        return m123606l(str, i11, false, enumC25629a);
    }

    /* renamed from: l */
    public C3979l m123606l(String str, int i11, boolean z11, EnumC25629a enumC25629a) {
        return m123607m(str, i11, false, z11, enumC25629a);
    }

    /* renamed from: m */
    public C3979l m123607m(String str, int i11, boolean z11, boolean z12, EnumC25629a enumC25629a) {
        return m123609o(str, C3979l.b.UNKNOWN, 0L, i11, z11, z12, enumC25629a);
    }

    /* renamed from: n */
    public C3979l m123608n(String str, C3979l.b bVar, int i11, EnumC25629a enumC25629a) {
        return m123609o(str, bVar, 0L, i11, false, false, enumC25629a);
    }

    /* renamed from: o */
    public C3979l m123609o(String str, C3979l.b bVar, long j11, int i11, boolean z11, boolean z12, EnumC25629a enumC25629a) {
        File m123603i;
        C3979l m125676A2 = C23999j.m125676A2(str, i11, enumC25629a);
        if (m125676A2 == null && (m123603i = m123603i(str)) != null) {
            return C23999j.m125679B2(str, bVar, j11, m123603i.getAbsolutePath(), null, i11, z11, true, 0, z12, false, null, null, enumC25629a);
        }
        return m125676A2;
    }

    /* renamed from: p */
    public C3979l m123610p(String str, EnumC25629a enumC25629a) {
        return m123605k(str, 0, enumC25629a);
    }

    /* renamed from: q */
    public Context m123611q() {
        Activity activity = this.f114322a;
        if (activity != null) {
            return activity;
        }
        View view = this.f114325d;
        if (view != null) {
            return view.getContext();
        }
        return this.f114326e;
    }

    /* renamed from: r */
    public AbstractC23529b m123612r(InterfaceC3968a interfaceC3968a) {
        this.f114323b = interfaceC3968a;
        m123574Q();
        return m123575R();
    }

    /* renamed from: s */
    public AbstractC23529b m123613s(int i11) {
        InterfaceC3968a interfaceC3968a = this.f114323b;
        if (interfaceC3968a instanceof InterfaceC3968a) {
            interfaceC3968a.setTag(1090453505, null);
            if (i11 == 0) {
                interfaceC3968a.setImageBitmap(null);
            } else {
                interfaceC3968a.setImageResource(i11);
            }
        }
        return m123575R();
    }

    /* renamed from: t */
    public AbstractC23529b m123614t(Bitmap bitmap) {
        Object obj = this.f114323b;
        if (obj instanceof ImageView) {
            ImageView imageView = (ImageView) obj;
            imageView.setTag(1090453505, null);
            imageView.setImageBitmap(bitmap);
        }
        return m123575R();
    }

    /* renamed from: u */
    public AbstractC23529b m123615u(Drawable drawable) {
        Object obj = this.f114323b;
        if (obj instanceof ImageView) {
            ImageView imageView = (ImageView) obj;
            imageView.setTag(1090453505, null);
            imageView.setImageDrawable(drawable);
        }
        return m123575R();
    }

    /* renamed from: v */
    public AbstractC23529b m123616v(String str) {
        return m123580D(str, true, true, 0, 0);
    }

    /* renamed from: w */
    public AbstractC23529b m123617w(String str, C3979l.b bVar, boolean z11, boolean z12, int i11, int i12, C23999j c23999j, boolean z13, EnumC25629a enumC25629a, boolean z14) {
        ((C23999j) ((C23999j) ((C23999j) c23999j.m125757D3(i11).m125777n2(i12).m125635v1(str)).m125761G2(bVar).m125596P0(z11)).m125602Z(z12)).m125776k3(z13).m125783y3(enumC25629a).m125782s3(z14);
        return m123587K(c23999j);
    }

    /* renamed from: x */
    public AbstractC23529b m123618x(String str, C24003n c24003n) {
        if (this.f114323b instanceof InterfaceC3968a) {
            C23999j.m125691J1(this.f114322a, m123611q(), this.f114323b, str, this.f114324c, c24003n);
            m123574Q();
        }
        return m123575R();
    }

    /* renamed from: y */
    public AbstractC23529b m123619y(String str, C24003n c24003n, int i11) {
        if (this.f114323b instanceof InterfaceC3968a) {
            C23999j.m125693K1(this.f114322a, m123611q(), this.f114323b, str, this.f114324c, c24003n, i11);
            m123574Q();
        }
        return m123575R();
    }

    /* renamed from: z */
    public AbstractC23529b m123620z(String str, C24003n c24003n, int i11, C3979l.b bVar, C23999j c23999j) {
        ((C23999j) ((C23999j) ((C23999j) ((C23999j) c23999j.m125757D3(c24003n.f116260a).m125777n2(c24003n.f116271l).m125635v1(str)).m125761G2(bVar).m125596P0(c24003n.f116275p)).m125602Z(c24003n.f116276q)).m125773e3(c24003n.f116263d).m125769Y2(c24003n.f116261b).m125601Y0(i11)).m125783y3(c24003n.f116266g).m125779o3(c24003n.f116269j);
        int i12 = c24003n.f116264e;
        if (i12 > 0) {
            c23999j.m125774f3(i12);
        }
        c23999j.m125775h2(c24003n.f116282w);
        int i13 = c24003n.f116262c;
        if (i13 >= 0) {
            c23999j.m125762H1(i13);
        }
        return m123587K(c23999j);
    }

    public AbstractC23529b(Context context) {
        this.f114326e = context;
    }
}
