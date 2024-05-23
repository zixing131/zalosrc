package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import bo.C2971f1;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.social.controls.C10872k;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalo.stickers.FeedStickerView;
import is.C20820s0;
import me0.AbstractC23136l9;
import p471r3.C25630b;
import p489rn.C25849b;
import p588vw.C28644j;

/* loaded from: classes4.dex */
public class CommentItemSticker extends CommentItemBase {

    /* renamed from: O */
    private FeedStickerView f44177O;

    /* renamed from: P */
    private final int f44178P;

    /* renamed from: Q */
    private C10873l f44179Q;

    /* renamed from: R */
    private ImageView f44180R;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.CommentItemSticker$a */
    /* loaded from: classes4.dex */
    public static class ViewOnClickListenerC8076a implements View.OnClickListener {

        /* renamed from: p */
        private final C10873l f44181p;

        /* renamed from: q */
        private final C25849b.a f44182q;

        /* renamed from: r */
        private final int f44183r;

        /* renamed from: s */
        private final int f44184s;

        public ViewOnClickListenerC8076a(C10873l c10873l, C25849b.a aVar, int i11, int i12) {
            this.f44181p = c10873l;
            this.f44182q = aVar;
            this.f44183r = i11;
            this.f44184s = i12;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f44182q != null) {
                this.f44182q.mo46575f1(this.f44183r, 11, new TrackingSource.C7894b().m40694f(11).m40691c(this.f44181p.m56487r()).m40693e(0).m40692d(this.f44181p.m56489s()).m40690b(this.f44181p.m56493u()).m40689a(), this.f44184s);
            }
        }
    }

    public CommentItemSticker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44178P = AbstractC23136l9.m118742r(120.0f);
    }

    /* renamed from: U */
    private void m43578U(C10873l c10873l, boolean z11) {
        try {
            C10872k c10872k = c10873l.f54891G;
            if (c10872k == null) {
                return;
            }
            int i11 = 8;
            ViewOnClickListenerC8076a viewOnClickListenerC8076a = new ViewOnClickListenerC8076a(c10873l, this.f44150H, c10872k.f54882n, 8);
            this.f44177O.setOnClickListener(viewOnClickListenerC8076a);
            C10873l c10873l2 = this.f44179Q;
            if (c10873l2 != null) {
                if (!c10873l2.m56493u().equals(c10873l.m56493u())) {
                }
                this.f44179Q = c10873l;
                C25630b c25630b = new C25630b();
                c25630b.m132405O(c10872k.f54881m);
                c25630b.m132414X(c10872k.f54882n);
                c25630b.m132410T(c10872k.f54884p);
                C25630b m143282P0 = C28644j.m143233Y().m143282P0(c25630b);
                C2971f1 c2971f1 = new C2971f1();
                c2971f1.m14059f(m143282P0);
                c2971f1.m14061h(this.f44179Q.m56493u());
                c2971f1.m14060g("COMMENT_STICKER_");
                C20820s0.m108740n(this.f44177O, c2971f1, this.f44147E);
                ImageView imageView = this.f44180R;
                if (c10872k.f54881m != 0 && !C28644j.m143233Y().m143312x0(c10872k.f54882n)) {
                    i11 = 0;
                }
                imageView.setVisibility(i11);
                this.f44180R.setOnClickListener(viewOnClickListenerC8076a);
            }
            this.f44177O.m56563l();
            this.f44177O.invalidate();
            this.f44179Q = c10873l;
            C25630b c25630b2 = new C25630b();
            c25630b2.m132405O(c10872k.f54881m);
            c25630b2.m132414X(c10872k.f54882n);
            c25630b2.m132410T(c10872k.f54884p);
            C25630b m143282P02 = C28644j.m143233Y().m143282P0(c25630b2);
            C2971f1 c2971f12 = new C2971f1();
            c2971f12.m14059f(m143282P02);
            c2971f12.m14061h(this.f44179Q.m56493u());
            c2971f12.m14060g("COMMENT_STICKER_");
            C20820s0.m108740n(this.f44177O, c2971f12, this.f44147E);
            ImageView imageView2 = this.f44180R;
            if (c10872k.f54881m != 0) {
                i11 = 0;
            }
            imageView2.setVisibility(i11);
            this.f44180R.setOnClickListener(viewOnClickListenerC8076a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ boolean m43579V(int i11, View view) {
        try {
            C25849b.a aVar = this.f44150H;
            if (aVar != null) {
                aVar.mo46582l(i11);
                return true;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* renamed from: W */
    public void m43580W(C10873l c10873l, boolean z11, int i11, int i12, int i13) {
        if (c10873l == null) {
            return;
        }
        try {
            m43557Q(c10873l, z11, i11, i12);
            m43578U(c10873l, z11);
            m43556P(c10873l);
            mo43562x(c10873l, i13);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.feed.components.CommentItemBase, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        FeedStickerView feedStickerView = this.f44177O;
        if (feedStickerView != null) {
            feedStickerView.m56561i();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.zing.zalo.feed.components.CommentItemBase
    /* renamed from: x */
    public void mo43562x(C10873l c10873l, final int i11) {
        super.mo43562x(c10873l, i11);
        FeedStickerView feedStickerView = this.f44177O;
        if (feedStickerView != null) {
            feedStickerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.feed.components.g0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m43579V;
                    m43579V = CommentItemSticker.this.m43579V(i11, view);
                    return m43579V;
                }
            });
        }
    }

    @Override // com.zing.zalo.feed.components.CommentItemBase
    /* renamed from: y */
    public void mo43563y(Context context) {
        try {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.comment_item_sticker_content, this);
            this.f44177O = (FeedStickerView) findViewById(AbstractC6918a0.feed_sticker);
            this.f44180R = (ImageView) findViewById(AbstractC6918a0.icon_download);
            FeedStickerView feedStickerView = this.f44177O;
            int i11 = this.f44178P;
            feedStickerView.m56564m(i11, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43563y(context);
    }
}
