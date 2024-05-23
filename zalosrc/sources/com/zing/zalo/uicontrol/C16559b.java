package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.TextUtils;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.zdesign.component.avatar.AbstractC16946b;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import kd0.C21693c;
import me0.AbstractC23268y2;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;

/* renamed from: com.zing.zalo.uicontrol.b */
/* loaded from: classes4.dex */
public final class C16559b extends AbstractC16946b {

    /* renamed from: e */
    private C3977j f83637e;

    /* renamed from: com.zing.zalo.uicontrol.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f83638l1;

        /* renamed from: m1 */
        final /* synthetic */ C16559b f83639m1;

        /* renamed from: n1 */
        final /* synthetic */ C24003n f83640n1;

        /* renamed from: o1 */
        final /* synthetic */ Drawable f83641o1;

        a(String str, C16559b c16559b, C24003n c24003n, Drawable drawable) {
            this.f83638l1 = str;
            this.f83639m1 = c16559b;
            this.f83640n1 = c24003n;
            this.f83641o1 = drawable;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "imageview");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                if (TextUtils.equals(str, this.f83638l1)) {
                    if (c3979l == null || c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        this.f83639m1.m90772i(this.f83641o1);
                        this.f83639m1.m90771d().mo90484a(this.f83639m1);
                    }
                    if (this.f83639m1.m88238j() != null) {
                        C3977j m88238j = this.f83639m1.m88238j();
                        AbstractC19074t.m100205c(m88238j);
                        m88238j.setImageInfo(c3979l, false);
                    }
                    if (c23995f.m125666q() == 4) {
                        this.f83639m1.m90772i(new BitmapDrawable(this.f83639m1.m90769b().getResources(), c3979l.m18839c()));
                    } else {
                        this.f83639m1.m90772i(new TransitionDrawable(new Drawable[]{this.f83640n1.f116261b, new BitmapDrawable(this.f83639m1.m90769b().getResources(), c3979l.m18839c())}));
                        Drawable m90768a = this.f83639m1.m90768a();
                        if (m90768a != null) {
                            m90768a.setCallback(this.f83639m1.m90770c());
                        }
                        Drawable m90768a2 = this.f83639m1.m90768a();
                        AbstractC19074t.m100206d(m90768a2, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
                        ((TransitionDrawable) m90768a2).setCrossFadeEnabled(true);
                        Drawable m90768a3 = this.f83639m1.m90768a();
                        AbstractC19074t.m100206d(m90768a3, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
                        ((TransitionDrawable) m90768a3).startTransition(1000);
                    }
                    this.f83639m1.m90771d().mo90484a(this.f83639m1);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16559b(Context context, AbstractC16946b.a aVar, Drawable.Callback callback) {
        super(context, aVar, callback);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "listener");
        AbstractC19074t.m100208f(callback, "drawableCallback");
    }

    @Override // com.zing.zalo.zdesign.component.avatar.AbstractC16946b
    /* renamed from: e */
    public boolean mo88234e(String str) {
        return false;
    }

    @Override // com.zing.zalo.zdesign.component.avatar.AbstractC16946b
    /* renamed from: f */
    public void mo88235f(String str, boolean z11, boolean z12) {
        C24003n m120143n;
        if (this.f83637e == null) {
            this.f83637e = new C3977j(m90769b());
        }
        C23528a c23528a = new C23528a(m90769b());
        if (z11) {
            m120143n = C23278z2.m120141m0();
        } else {
            m120143n = C23278z2.m120143n();
        }
        Drawable drawable = m120143n.f116261b;
        if (!z12 || C23999j.m125696L2(str, m120143n)) {
            ((C23528a) c23528a.m123612r(this.f83637e)).m123579C(str, m120143n, new a(str, this, m120143n, drawable));
        }
    }

    @Override // com.zing.zalo.zdesign.component.avatar.AbstractC16946b
    /* renamed from: g */
    public void mo88236g(C21693c c21693c, String str, boolean z11, boolean z12) {
        C24003n m120143n;
        C23528a c23528a = new C23528a(m90769b());
        if (this.f83637e == null) {
            this.f83637e = new C3977j(m90769b());
        }
        if (z11) {
            m120143n = C23278z2.m120141m0();
        } else {
            m120143n = C23278z2.m120143n();
        }
        AbstractC23268y2.m120033g(c23528a, this.f83637e, c21693c, str, m120143n, z12);
    }

    @Override // com.zing.zalo.zdesign.component.avatar.AbstractC16946b
    /* renamed from: h */
    public void mo88237h() {
        AbstractC3972e.m18783g0(this.f83637e);
    }

    /* renamed from: j */
    public final C3977j m88238j() {
        return this.f83637e;
    }
}
