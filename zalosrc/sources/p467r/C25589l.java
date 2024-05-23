package p467r;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p512t.C26435a;
import p512t.C26437c;
import p512t.C26440f;
import p562v.AbstractC27392e;
import p592w.C28681a;
import p627x.AbstractC29273a;
import p627x.C29274b;
import p627x.C29275c;

/* renamed from: r.l */
/* loaded from: classes2.dex */
public class C25589l extends AbstractC25579b {

    /* renamed from: k */
    private static final Pattern f122318k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final C25581d f122319a;

    /* renamed from: b */
    private final C25580c f122320b;

    /* renamed from: d */
    private C28681a f122322d;

    /* renamed from: e */
    private AbstractC29273a f122323e;

    /* renamed from: i */
    private boolean f122327i;

    /* renamed from: j */
    private boolean f122328j;

    /* renamed from: c */
    private final List f122321c = new ArrayList();

    /* renamed from: f */
    private boolean f122324f = false;

    /* renamed from: g */
    private boolean f122325g = false;

    /* renamed from: h */
    private String f122326h = UUID.randomUUID().toString();

    public C25589l(C25580c c25580c, C25581d c25581d) {
        this.f122320b = c25580c;
        this.f122319a = c25581d;
        m132163l(null);
        this.f122323e = (c25581d.m132145c() == EnumC25582e.HTML || c25581d.m132145c() == EnumC25582e.JAVASCRIPT) ? new C29274b(c25581d.m132152j()) : new C29275c(c25581d.m132148f(), c25581d.m132149g());
        this.f122323e.mo146274a();
        C26435a.m136271a().m136272b(this);
        this.f122323e.m146282i(c25580c);
    }

    /* renamed from: g */
    private void m132160g(String str) {
        if (str != null) {
            if (str.length() > 50 || !f122318k.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
        }
    }

    /* renamed from: i */
    private C26437c m132161i(View view) {
        for (C26437c c26437c : this.f122321c) {
            if (c26437c.m136290a().get() == view) {
                return c26437c;
            }
        }
        return null;
    }

    /* renamed from: j */
    private void m132162j(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: l */
    private void m132163l(View view) {
        this.f122322d = new C28681a(view);
    }

    /* renamed from: n */
    private void m132164n(View view) {
        Collection<C25589l> m136273c = C26435a.m136271a().m136273c();
        if (m136273c == null || m136273c.size() <= 0) {
            return;
        }
        for (C25589l c25589l : m136273c) {
            if (c25589l != this && c25589l.m132171p() == view) {
                c25589l.f122322d.clear();
            }
        }
    }

    /* renamed from: x */
    private void m132165x() {
        if (this.f122327i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: y */
    private void m132166y() {
        if (this.f122328j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // p467r.AbstractC25579b
    /* renamed from: b */
    public void mo132134b() {
        if (this.f122325g) {
            return;
        }
        this.f122322d.clear();
        mo132137e();
        this.f122325g = true;
        m132176u().m146292s();
        C26435a.m136271a().m136276f(this);
        m132176u().mo146287n();
        this.f122323e = null;
    }

    @Override // p467r.AbstractC25579b
    /* renamed from: c */
    public void mo132135c(View view) {
        if (this.f122325g) {
            return;
        }
        AbstractC27392e.m140336b(view, "AdView is null");
        if (m132171p() == view) {
            return;
        }
        m132163l(view);
        m132176u().m146296w();
        m132164n(view);
    }

    @Override // p467r.AbstractC25579b
    /* renamed from: d */
    public void mo132136d(View view, EnumC25584g enumC25584g, String str) {
        if (this.f122325g) {
            return;
        }
        m132162j(view);
        m132160g(str);
        if (m132161i(view) == null) {
            this.f122321c.add(new C26437c(view, enumC25584g, str));
        }
    }

    @Override // p467r.AbstractC25579b
    /* renamed from: e */
    public void mo132137e() {
        if (this.f122325g) {
            return;
        }
        this.f122321c.clear();
    }

    @Override // p467r.AbstractC25579b
    /* renamed from: f */
    public void mo132138f() {
        if (this.f122324f) {
            return;
        }
        this.f122324f = true;
        C26435a.m136271a().m136274d(this);
        this.f122323e.m146275b(C26440f.m136313b().m136318g());
        this.f122323e.mo146283j(this, this.f122319a);
    }

    /* renamed from: h */
    public void m132167h(JSONObject jSONObject) {
        m132166y();
        m132176u().m146280g(jSONObject);
        this.f122328j = true;
    }

    /* renamed from: k */
    public List m132168k() {
        return this.f122321c;
    }

    /* renamed from: m */
    public void m132169m() {
        m132165x();
        m132176u().m146293t();
        this.f122327i = true;
    }

    /* renamed from: o */
    public void m132170o() {
        m132166y();
        m132176u().m146295v();
        this.f122328j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public View m132171p() {
        return (View) this.f122322d.get();
    }

    /* renamed from: q */
    public boolean m132172q() {
        return this.f122324f && !this.f122325g;
    }

    /* renamed from: r */
    public boolean m132173r() {
        return this.f122324f;
    }

    /* renamed from: s */
    public boolean m132174s() {
        return this.f122325g;
    }

    /* renamed from: t */
    public String m132175t() {
        return this.f122326h;
    }

    /* renamed from: u */
    public AbstractC29273a m132176u() {
        return this.f122323e;
    }

    /* renamed from: v */
    public boolean m132177v() {
        return this.f122320b.m132140b();
    }

    /* renamed from: w */
    public boolean m132178w() {
        return this.f122320b.m132141c();
    }
}
