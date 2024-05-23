package com.zing.zalo.uicontrol;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import fn0.AbstractC19074t;
import p354n3.C23528a;
import p588vw.C28652r;
import qi0.AbstractC25298g;
import qi0.C25292a;
import qi0.C25297f;
import qi0.InterfaceC25296e;
import vg.C28212v6;

/* renamed from: com.zing.zalo.uicontrol.s2 */
/* loaded from: classes4.dex */
public final class C16651s2 extends AbstractC25298g {

    /* renamed from: a */
    private Context f83940a;

    /* renamed from: b */
    private ZSimpleGIFView f83941b;

    /* renamed from: c */
    private C23528a f83942c;

    /* renamed from: d */
    private C13306b f83943d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16651s2(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f83940a = context;
        this.f83942c = new C23528a(context);
    }

    /* renamed from: i */
    private final void m88427i(C25297f c25297f, C28212v6 c28212v6) {
        C25292a.a aVar;
        C25292a.a aVar2;
        C25292a.a aVar3;
        C25292a.a aVar4;
        C25292a.a aVar5;
        C25292a.a aVar6;
        String str;
        String str2;
        int i11;
        int i12;
        String str3;
        int i13;
        if (c25297f.m130940k() == null) {
            c25297f.m130914T(C25292a.f121281a);
        }
        C25292a m130940k = c25297f.m130940k();
        if (m130940k != null) {
            String str4 = c28212v6.f131577c;
            AbstractC19074t.m100207e(str4, "tipCat");
            m130940k.m130873f(str4);
        }
        C25292a m130940k2 = c25297f.m130940k();
        if (m130940k2 != null) {
            m130940k2.m130874g(c28212v6.f131592r);
        }
        C25292a m130940k3 = c25297f.m130940k();
        if (m130940k3 != null) {
            m130940k3.m130872e(c28212v6.f131593s);
        }
        C25292a m130940k4 = c25297f.m130940k();
        C25292a.a aVar7 = null;
        if (m130940k4 != null) {
            aVar = m130940k4.m130871d();
        } else {
            aVar = null;
        }
        int i14 = 0;
        if (aVar != null) {
            C28212v6.a aVar8 = c28212v6.f131584j;
            if (aVar8 != null) {
                i13 = aVar8.f131596a;
            } else {
                i13 = 0;
            }
            aVar.m130888m(i13);
        }
        C25292a m130940k5 = c25297f.m130940k();
        if (m130940k5 != null) {
            aVar2 = m130940k5.m130871d();
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            C28212v6.a aVar9 = c28212v6.f131584j;
            if (aVar9 != null) {
                str3 = aVar9.f131597b;
            } else {
                str3 = null;
            }
            aVar2.m130889n(str3);
        }
        C25292a m130940k6 = c25297f.m130940k();
        if (m130940k6 != null) {
            aVar3 = m130940k6.m130871d();
        } else {
            aVar3 = null;
        }
        if (aVar3 != null) {
            C28212v6.a aVar10 = c28212v6.f131584j;
            if (aVar10 != null) {
                i12 = aVar10.f131598c;
            } else {
                i12 = 0;
            }
            aVar3.m130890o(i12);
        }
        C25292a m130940k7 = c25297f.m130940k();
        if (m130940k7 != null) {
            aVar4 = m130940k7.m130871d();
        } else {
            aVar4 = null;
        }
        if (aVar4 != null) {
            C28212v6.a aVar11 = c28212v6.f131584j;
            if (aVar11 != null) {
                i11 = aVar11.f131599d;
            } else {
                i11 = 0;
            }
            aVar4.m130885j(i11);
        }
        C25292a m130940k8 = c25297f.m130940k();
        if (m130940k8 != null) {
            aVar5 = m130940k8.m130871d();
        } else {
            aVar5 = null;
        }
        String str5 = "";
        if (aVar5 != null) {
            C28212v6.a aVar12 = c28212v6.f131584j;
            if (aVar12 != null) {
                str2 = aVar12.f131600e;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            aVar5.m130884i(str2);
        }
        C25292a m130940k9 = c25297f.m130940k();
        if (m130940k9 != null) {
            aVar6 = m130940k9.m130871d();
        } else {
            aVar6 = null;
        }
        if (aVar6 != null) {
            C28212v6.a aVar13 = c28212v6.f131584j;
            if (aVar13 != null) {
                str = aVar13.f131601f;
            } else {
                str = null;
            }
            if (str != null) {
                str5 = str;
            }
            aVar6.m130886k(str5);
        }
        C25292a m130940k10 = c25297f.m130940k();
        if (m130940k10 != null) {
            aVar7 = m130940k10.m130871d();
        }
        if (aVar7 != null) {
            C28212v6.a aVar14 = c28212v6.f131584j;
            if (aVar14 != null) {
                i14 = aVar14.f131602g;
            }
            aVar7.m130887l(i14);
        }
    }

    @Override // qi0.AbstractC25298g
    /* renamed from: a */
    public View mo88428a() {
        return this.f83941b;
    }

    @Override // qi0.AbstractC25298g
    /* renamed from: b */
    public void mo88429b(String str, String str2, int i11, int i12) {
        if (this.f83941b == null) {
            this.f83941b = new ZSimpleGIFView(this.f83940a);
        }
        ZSimpleGIFView zSimpleGIFView = this.f83941b;
        AbstractC19074t.m100205c(zSimpleGIFView);
        zSimpleGIFView.m88227l(new ZSimpleGIFView.C16554f(str, str2, i11, i12, "ShowcaseView"), 0, null);
        ZSimpleGIFView zSimpleGIFView2 = this.f83941b;
        AbstractC19074t.m100205c(zSimpleGIFView2);
        zSimpleGIFView2.m88224g(100L);
    }

    @Override // qi0.AbstractC25298g
    /* renamed from: c */
    public void mo88430c(RecyclingImageView recyclingImageView, String str) {
        AbstractC19074t.m100208f(recyclingImageView, "imageView");
        ((C23528a) this.f83942c.m123612r(recyclingImageView)).m123616v(str);
    }

    @Override // qi0.AbstractC25298g
    /* renamed from: d */
    public void mo88431d() {
        C13306b c13306b = this.f83943d;
        if (c13306b != null) {
            AbstractC19074t.m100205c(c13306b);
            c13306b.m74708t();
        }
    }

    @Override // qi0.AbstractC25298g
    /* renamed from: e */
    public void mo88432e(InterfaceC25296e interfaceC25296e) {
        AbstractC19074t.m100208f(interfaceC25296e, "tooltip");
        C13306b c13306b = this.f83943d;
        if (c13306b != null) {
            AbstractC19074t.m100205c(c13306b);
            c13306b.m74693I(interfaceC25296e);
        }
    }

    @Override // qi0.AbstractC25298g
    /* renamed from: f */
    public void mo88433f(RobotoTextView robotoTextView, String str) {
        AbstractC19074t.m100208f(robotoTextView, "textView");
        AbstractC19074t.m100208f(str, "text");
        robotoTextView.setText(C28652r.m143349v().m143357H(str));
    }

    @Override // qi0.AbstractC25298g
    /* renamed from: g */
    public void mo88434g(C25297f c25297f, Object obj) {
        AbstractC19074t.m100208f(c25297f, "configs");
        if (obj != null && (obj instanceof C28212v6)) {
            C28212v6 c28212v6 = (C28212v6) obj;
            String str = c28212v6.f131581g;
            AbstractC19074t.m100207e(str, "tip");
            c25297f.m130933g0(str);
            CharSequence charSequence = c28212v6.f131582h;
            AbstractC19074t.m100207e(charSequence, "subTip");
            c25297f.m130927d0(charSequence);
            if (TextUtils.isEmpty(c25297f.m130896B()) && !TextUtils.isEmpty(c28212v6.f131583i)) {
                try {
                    int identifier = this.f83940a.getResources().getIdentifier(((C28212v6) obj).f131583i, "string", this.f83940a.getPackageName());
                    if (identifier != 0) {
                        String string = this.f83940a.getResources().getString(identifier);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        c25297f.m130927d0(string);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            m88427i(c25297f, c28212v6);
            c25297f.m130943l0(c28212v6.f131590p);
            String str2 = c28212v6.f131577c;
            AbstractC19074t.m100207e(str2, "tipCat");
            c25297f.m130915U(str2);
        }
    }

    @Override // qi0.AbstractC25298g
    /* renamed from: h */
    public void mo88435h(Object obj) {
        AbstractC19074t.m100208f(obj, "manager");
        if (obj instanceof C13306b) {
            this.f83943d = (C13306b) obj;
        }
    }
}
