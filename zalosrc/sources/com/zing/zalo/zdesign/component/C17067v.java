package com.zing.zalo.zdesign.component;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import bi0.AbstractC2816j;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import ki0.C21734b;
import ki0.C21737e;
import ki0.C21740h;
import ti0.C26705d;
import ti0.C26707f;

/* renamed from: com.zing.zalo.zdesign.component.v */
/* loaded from: classes7.dex */
public final class C17067v extends C21737e {

    /* renamed from: M0 */
    private C21734b f87344M0;

    /* renamed from: N0 */
    private C21740h f87345N0;

    /* renamed from: O0 */
    private int f87346O0;

    /* renamed from: com.zing.zalo.zdesign.component.v$a */
    /* loaded from: classes7.dex */
    public static final class a implements b {
        a() {
        }

        @Override // com.zing.zalo.zdesign.component.C17067v.b
        /* renamed from: a */
        public void mo91353a(boolean z11) {
            int i11;
            C21740h m91348p1 = C17067v.this.m91348p1();
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            m91348p1.mo44614b1(i11);
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.v$b */
    /* loaded from: classes7.dex */
    public interface b {
        /* renamed from: a */
        void mo91353a(boolean z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17067v(Context context, EnumC17071x enumC17071x) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(enumC17071x, "size");
        m89007n1(false);
        this.f87344M0 = new C21734b(context, enumC17071x);
        this.f87345N0 = new C21740h(context);
        this.f87344M0.m89106L().m89027K(true);
        this.f87345N0.m89106L().m89028L(-2, -2).m89025I(true);
        this.f87345N0.mo44614b1(0);
        m91347o1(enumC17071x);
        m89001g1(this.f87344M0);
        m89001g1(this.f87345N0);
        this.f87344M0.m112171m1(new a());
    }

    /* renamed from: o1 */
    private final void m91347o1(EnumC17071x enumC17071x) {
        if (enumC17071x == EnumC17071x.SMALL) {
            C26707f c26707f = new C26707f(this.f87345N0);
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            c26707f.m137318a(C26705d.m137293a(context, AbstractC2814h.checkcircle_text_small));
        } else {
            C26707f c26707f2 = new C26707f(this.f87345N0);
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            c26707f2.m137318a(C26705d.m137293a(context2, AbstractC2814h.checkcircle_text_normal));
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        this.f87346O0 = aVar.m13592a(context3, AbstractC2807a.checkcircle_checkmark);
        m91352t1("");
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: L0 */
    public void mo89107L0(C16719g.b bVar) {
        this.f87344M0.mo89107L0(bVar);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: M0 */
    public void mo89109M0(C16719g.c cVar) {
        this.f87344M0.mo89109M0(cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        int i11;
        C21740h c21740h = this.f87345N0;
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        ColorStateList m13593b = aVar.m13593b(context, AbstractC2807a.checkcircle_checkmark);
        if (m13593b != null) {
            i11 = m13593b.getColorForState(this.f84794x, this.f87346O0);
        } else {
            i11 = 0;
        }
        c21740h.m111962J1(i11);
        super.mo44775o0(canvas);
        if (m89119T() != null) {
            m89119T().setClipChildren(false);
        }
    }

    /* renamed from: p1 */
    public final C21740h m91348p1() {
        return this.f87345N0;
    }

    /* renamed from: q1 */
    public final void m91349q1(EnumC17065u enumC17065u) {
        AbstractC19074t.m100208f(enumC17065u, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f87344M0.m112169k1(enumC17065u);
    }

    /* renamed from: r1 */
    public final void m91350r1(boolean z11, boolean z12) {
        this.f87344M0.m112170l1(z11, z12);
    }

    /* renamed from: s1 */
    public final void m91351s1(EnumC17069w enumC17069w) {
        AbstractC19074t.m100208f(enumC17069w, "placement");
        this.f87344M0.m112172n1(enumC17069w);
    }

    /* renamed from: t1 */
    public final void m91352t1(String str) {
        AbstractC19074t.m100208f(str, "text");
        this.f87345N0.m111959G1(str);
        if (str.length() == 0) {
            this.f87345N0.mo44614b1(8);
        } else {
            this.f87345N0.mo44614b1(0);
        }
    }
}
