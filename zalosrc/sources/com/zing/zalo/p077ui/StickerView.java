package com.zing.zalo.p077ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import bd0.C2770a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.C13700o2;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import p471r3.C25630b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes5.dex */
public class StickerView extends RecyclingImageView implements C2770a.a {

    /* renamed from: p */
    private String f55429p;

    /* renamed from: q */
    private int f55430q;

    /* renamed from: r */
    private int f55431r;

    /* renamed from: s */
    private final InterfaceC24854k f55432s;

    /* renamed from: t */
    private InterfaceC10959a f55433t;

    /* renamed from: com.zing.zalo.ui.StickerView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10959a {
        /* renamed from: a */
        boolean mo35967a();
    }

    /* renamed from: com.zing.zalo.ui.StickerView$b */
    /* loaded from: classes5.dex */
    static final class C10960b extends AbstractC19075u implements InterfaceC18494a {
        C10960b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13700o2 mo12V4() {
            return new C13700o2(new C2770a(StickerView.this, C13700o2.d.f70834p, -1, new Rect(StickerView.this.getPaddingLeft(), StickerView.this.getPaddingTop(), StickerView.this.getPaddingRight(), StickerView.this.getPaddingBottom()), true, true, false, C13700o2.Companion.m76549c(), false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerView(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f55429p = "";
        this.f55430q = -1;
        this.f55431r = -1;
        m129210a = AbstractC24856m.m129210a(new C10960b());
        this.f55432s = m129210a;
    }

    private final C13700o2 getStickerDrawer() {
        return (C13700o2) this.f55432s.getValue();
    }

    /* renamed from: k */
    public static /* synthetic */ void m56977k(StickerView stickerView, C25630b c25630b, String str, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z15 = false;
            } else {
                z15 = z11;
            }
            if ((i11 & 8) != 0) {
                z16 = false;
            } else {
                z16 = z12;
            }
            if ((i11 & 16) != 0) {
                z17 = false;
            } else {
                z17 = z13;
            }
            if ((i11 & 32) != 0) {
                z18 = false;
            } else {
                z18 = z14;
            }
            stickerView.m56979j(c25630b, str, z15, z16, z17, z18);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playSticker");
    }

    @Override // bd0.C2770a.a
    /* renamed from: a */
    public boolean mo13318a() {
        InterfaceC10959a interfaceC10959a = this.f55433t;
        if (interfaceC10959a != null) {
            return interfaceC10959a.mo35967a();
        }
        return false;
    }

    @Override // bd0.C2770a.a
    /* renamed from: b */
    public boolean mo13319b() {
        return C2770a.a.C32648a.m13320a(this);
    }

    public final InterfaceC10959a getDelegate() {
        return this.f55433t;
    }

    public final String getEmoticon() {
        return this.f55429p;
    }

    public final int getIndicatorIndex() {
        return this.f55431r;
    }

    public final int getRowIndex() {
        return this.f55430q;
    }

    /* renamed from: i */
    public final void m56978i(C25630b c25630b) {
        C13700o2.m76511p(getStickerDrawer(), c25630b, false, 2, null);
    }

    /* renamed from: j */
    public final void m56979j(C25630b c25630b, String str, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC19074t.m100208f(str, "animationId");
        getStickerDrawer().m76529O(c25630b, str, z11, z12, z13, z14);
    }

    /* renamed from: l */
    public final void m56980l() {
        C13700o2.m76495S(getStickerDrawer(), false, 1, null);
    }

    /* renamed from: m */
    public final void m56981m(int i11, int i12, int i13, int i14) {
        getStickerDrawer().m76536Y(i11, i12, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        getStickerDrawer().m76545v(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int m116584g;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i11 > 0 && i12 > 0) {
            C13700o2 stickerDrawer = getStickerDrawer();
            C13700o2.d dVar = C13700o2.d.f70835q;
            m116584g = AbstractC22543l.m116584g(size, size2);
            stickerDrawer.m76539b0(dVar, m116584g, null);
        } else {
            size = getStickerDrawer().m76524H();
            size2 = getStickerDrawer().m76522E();
        }
        setMeasuredDimension(size, size2);
    }

    public final void setDelegate(InterfaceC10959a interfaceC10959a) {
        this.f55433t = interfaceC10959a;
    }

    public final void setEmoticon(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f55429p = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        getStickerDrawer().m76541e0(bitmap);
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        getStickerDrawer().m76542f0(drawable);
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        getStickerDrawer().m76542f0(AbstractC23136l9.m118663M(i11));
    }

    public final void setIndicatorIndex(int i11) {
        this.f55431r = i11;
    }

    public final void setRowIndex(int i11) {
        this.f55430q = i11;
    }

    public final void setStickerInfo(C25630b c25630b) {
        getStickerDrawer().m76540d0(c25630b);
    }

    public final void setThumbUrl(String str) {
        AbstractC19074t.m100208f(str, "thumbUrl");
        getStickerDrawer().m76543g0(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f55429p = "";
        this.f55430q = -1;
        this.f55431r = -1;
        m129210a = AbstractC24856m.m129210a(new C10960b());
        this.f55432s = m129210a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f55429p = "";
        this.f55430q = -1;
        this.f55431r = -1;
        m129210a = AbstractC24856m.m129210a(new C10960b());
        this.f55432s = m129210a;
    }
}
