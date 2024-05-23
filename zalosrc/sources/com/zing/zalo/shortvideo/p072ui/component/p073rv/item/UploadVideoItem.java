package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import mj0.AbstractC23322a;
import p354n3.C23528a;
import pm0.C24848g0;
import q10.C25069y0;
import s20.AbstractC26112n;
import u20.C26993n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27413h;
import z10.C31164g;

/* loaded from: classes5.dex */
public final class UploadVideoItem extends FrameLayout {
    public static final C9671b Companion = new C9671b(null);

    /* renamed from: p */
    private InterfaceC9670a f50996p;

    /* renamed from: q */
    private final int f50997q;

    /* renamed from: r */
    private final int f50998r;

    /* renamed from: s */
    private C25069y0 f50999s;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.UploadVideoItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9670a {
        /* renamed from: d */
        void mo52391d();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.UploadVideoItem$b */
    /* loaded from: classes5.dex */
    public static final class C9671b {
        private C9671b() {
        }

        public /* synthetic */ C9671b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.UploadVideoItem$c */
    /* loaded from: classes5.dex */
    static final class C9672c extends AbstractC19075u implements InterfaceC18505l {
        C9672c() {
            super(1);
        }

        /* renamed from: a */
        public final void m52392a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC9670a callback = UploadVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52391d();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52392a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadVideoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50997q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_upload_padding);
        this.f50998r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_upload_icon_to_text);
    }

    /* renamed from: a */
    public final void m52388a(C31164g.e eVar) {
        AbstractC19074t.m100208f(eVar, "video");
        C25069y0 c25069y0 = this.f50999s;
        if (c25069y0 == null) {
            AbstractC19074t.m100223u("binding");
            c25069y0 = null;
        }
        C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(c25069y0.f120429r);
        c23528a.m123599d();
        m52390c(eVar);
    }

    /* renamed from: b */
    public final void m52389b(C31164g.e eVar, List list) {
        AbstractC19074t.m100208f(eVar, "video");
        AbstractC19074t.m100208f(list, "payloads");
        if (AbstractC19074t.m100204b(list.get(0), "PROGRESS")) {
            m52390c(eVar);
        }
    }

    /* renamed from: c */
    public final void m52390c(C31164g.e eVar) {
        AbstractC19074t.m100208f(eVar, "video");
        C25069y0 c25069y0 = this.f50999s;
        if (c25069y0 == null) {
            AbstractC19074t.m100223u("binding");
            c25069y0 = null;
        }
        if (eVar.m151614a() >= 0) {
            ImageView imageView = c25069y0.f120428q;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C26993n c26993n = new C26993n(context);
            c26993n.m139105a(eVar.m151614a());
            imageView.setImageDrawable(c26993n);
            c25069y0.f120430s.setText(AbstractC27413h.zch_item_video_upload_processing);
            SimpleShadowTextView simpleShadowTextView = c25069y0.f120430s;
            AbstractC19074t.m100207e(simpleShadowTextView, "txtStatus");
            AbstractC26112n.m134425t0(simpleShadowTextView, AbstractC27406a.zch_text_primary_a60);
            AbstractC26112n.m134398g(this);
            return;
        }
        ImageView imageView2 = c25069y0.f120428q;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        imageView2.setImageDrawable(C27280g.m139659b(context2, AbstractC23322a.zds_ic_info_circle_line_24, AbstractC27406a.zch_icon_accent_red));
        c25069y0.f120430s.setText(AbstractC27413h.zch_item_video_upload_error);
        SimpleShadowTextView simpleShadowTextView2 = c25069y0.f120430s;
        AbstractC19074t.m100207e(simpleShadowTextView2, "txtStatus");
        AbstractC26112n.m134425t0(simpleShadowTextView2, AbstractC27406a.zch_text_accent_red);
        AbstractC26112n.m134416p(this);
    }

    public final InterfaceC9670a getCallback() {
        return this.f50996p;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25069y0 m129978a = C25069y0.m129978a(this);
        AbstractC19074t.m100207e(m129978a, "bind(...)");
        UploadVideoItem root = m129978a.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        AbstractC26112n.m134407k0(root, new C9672c());
        this.f50999s = m129978a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C25069y0 c25069y0 = this.f50999s;
        if (c25069y0 == null) {
            AbstractC19074t.m100223u("binding");
            c25069y0 = null;
        }
        RecyclingImageView recyclingImageView = c25069y0.f120429r;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        AbstractC26112n.m134383X(recyclingImageView, 0, 0);
        View view = c25069y0.f120431t;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134383X(view, 0, 0);
        int measuredWidth = (getMeasuredWidth() - c25069y0.f120428q.getMeasuredWidth()) / 2;
        int measuredHeight = (((getMeasuredHeight() - c25069y0.f120428q.getMeasuredHeight()) - c25069y0.f120430s.getMeasuredHeight()) - this.f50998r) / 2;
        ImageView imageView = c25069y0.f120428q;
        AbstractC19074t.m100207e(imageView, "icoStatus");
        AbstractC26112n.m134383X(imageView, measuredHeight, measuredWidth);
        int measuredWidth2 = (getMeasuredWidth() - c25069y0.f120430s.getMeasuredWidth()) / 2;
        int measuredHeight2 = measuredHeight + this.f50998r + c25069y0.f120428q.getMeasuredHeight();
        SimpleShadowTextView simpleShadowTextView = c25069y0.f120430s;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtStatus");
        AbstractC26112n.m134383X(simpleShadowTextView, measuredHeight2, measuredWidth2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int i13 = (size * 3) / 2;
        C25069y0 c25069y0 = this.f50999s;
        if (c25069y0 == null) {
            AbstractC19074t.m100223u("binding");
            c25069y0 = null;
        }
        RecyclingImageView recyclingImageView = c25069y0.f120429r;
        AbstractC19074t.m100207e(recyclingImageView, "rivThumbnail");
        AbstractC26112n.m134387a0(recyclingImageView, size, 1073741824, i13, 1073741824);
        View view = c25069y0.f120431t;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134387a0(view, size, 1073741824, i13, 1073741824);
        int i14 = size - (this.f50997q * 2);
        SimpleShadowTextView simpleShadowTextView = c25069y0.f120430s;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtStatus");
        AbstractC26112n.m134387a0(simpleShadowTextView, i14, Integer.MIN_VALUE, 0, 0);
        if (c25069y0.f120428q.getDrawable() instanceof C26993n) {
            int i15 = size / 3;
            ImageView imageView = c25069y0.f120428q;
            AbstractC19074t.m100207e(imageView, "icoStatus");
            AbstractC26112n.m134387a0(imageView, i15, 1073741824, i15, 1073741824);
        } else {
            ImageView imageView2 = c25069y0.f120428q;
            AbstractC19074t.m100207e(imageView2, "icoStatus");
            AbstractC26112n.m134387a0(imageView2, 0, 0, 0, 0);
        }
        setMeasuredDimension(size, i13);
    }

    public final void setCallback(InterfaceC9670a interfaceC9670a) {
        this.f50996p = interfaceC9670a;
    }
}
