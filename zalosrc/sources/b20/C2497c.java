package b20;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import androidx.core.view.AbstractC1595r0;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.Messages;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Iterator;
import nn0.AbstractC23906o;
import p148f3.C18711c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import s20.AbstractC26105g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.C27417l;

/* renamed from: b20.c */
/* loaded from: classes5.dex */
public final class C2497c extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    private final Context f10180a;

    /* renamed from: b */
    private final InterfaceC18494a f10181b;

    /* renamed from: c */
    private final int f10182c;

    /* renamed from: d */
    private final int f10183d;

    /* renamed from: e */
    private final int f10184e;

    /* renamed from: f */
    private StaticLayout f10185f;

    /* renamed from: g */
    private final Paint f10186g;

    /* renamed from: h */
    private final InterfaceC24854k f10187h;

    /* renamed from: b20.c$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextPaint mo12V4() {
            TextPaint textPaint = new TextPaint();
            C2497c c2497c = C2497c.this;
            textPaint.setColor(AbstractC1388a.m6961c(c2497c.m12580m(), AbstractC27406a.zch_text_tertiary));
            textPaint.setTypeface(C13718q1.m76694c(c2497c.m12580m(), 5));
            textPaint.setTextSize(AbstractC26105g.m134346m(13.0f));
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setFlags(1);
            textPaint.setStyle(Paint.Style.FILL);
            return textPaint;
        }
    }

    public C2497c(Context context, InterfaceC18494a interfaceC18494a) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18494a, "shouldShowFooterMessage");
        this.f10180a = context;
        this.f10181b = interfaceC18494a;
        this.f10182c = context.getResources().getDimensionPixelSize(AbstractC27407b.zch_item_comment_padding_horizontal);
        this.f10183d = context.getResources().getDimensionPixelSize(AbstractC27407b.zch_item_comment_padding_vertical);
        this.f10184e = context.getResources().getDimensionPixelSize(AbstractC27407b.zch_divider_thin);
        Paint paint = new Paint();
        paint.setColor(AbstractC1388a.m6961c(context, AbstractC27406a.zch_divider_inverse));
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        this.f10186g = paint;
        m129210a = AbstractC24856m.m129210a(new a());
        this.f10187h = m129210a;
    }

    /* renamed from: l */
    private final StaticLayout m12577l(int i11) {
        Messages m51428e;
        String m51478a;
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        StaticLayout.Builder maxLines;
        StaticLayout build;
        ChannelConfig m140381e = C27417l.f129055a.m140381e();
        if (m140381e != null && (m51428e = m140381e.m51428e()) != null && (m51478a = m51428e.m51478a()) != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                obtain = StaticLayout.Builder.obtain(m51478a, 0, m51478a.length(), m12578n(), i11 - (this.f10182c * 2));
                alignment = obtain.setAlignment(Layout.Alignment.ALIGN_NORMAL);
                lineSpacing = alignment.setLineSpacing(AbstractC26105g.m134346m(2.0f), 1.0f);
                includePad = lineSpacing.setIncludePad(false);
                maxLines = includePad.setMaxLines(2);
                build = maxLines.build();
                return build;
            }
            return new StaticLayout(m51478a, m12578n(), i11 - (this.f10182c * 2), Layout.Alignment.ALIGN_NORMAL, 1.0f, AbstractC26105g.m134346m(2.0f), false);
        }
        return null;
    }

    /* renamed from: n */
    private final TextPaint m12578n() {
        return (TextPaint) this.f10187h.getValue();
    }

    /* renamed from: o */
    private final StaticLayout m12579o(int i11) {
        StaticLayout staticLayout = this.f10185f;
        if (staticLayout == null && (staticLayout = m12577l(i11)) == null) {
            return null;
        }
        if (this.f10185f == null) {
            this.f10185f = staticLayout;
        }
        return staticLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        int m9817A0;
        int i11;
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        RecyclerView.AbstractC1880g adapter = recyclerView.getAdapter();
        if (adapter == null || (m9817A0 = recyclerView.m9817A0(view)) == -1) {
            return;
        }
        if (adapter.mo10005m(m9817A0) == 6) {
            int i12 = this.f10183d;
            rect.bottom = this.f10184e + i12 + i12;
            return;
        }
        if (m9817A0 == adapter.mo10003k() - 1) {
            rect.bottom = this.f10183d;
            if (((Boolean) this.f10181b.mo12V4()).booleanValue()) {
                int i13 = rect.bottom;
                StaticLayout staticLayout = this.f10185f;
                if (staticLayout != null) {
                    i11 = staticLayout.getHeight();
                } else {
                    i11 = 0;
                }
                rect.bottom = i13 + i11 + this.f10183d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: i */
    public void mo10068i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        OverScrollableRecyclerView overScrollableRecyclerView;
        RecyclerView.AbstractC1880g adapter;
        View view;
        int m9817A0;
        AbstractC19074t.m100208f(canvas, C18711c.f94014e);
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        if (recyclerView instanceof OverScrollableRecyclerView) {
            overScrollableRecyclerView = (OverScrollableRecyclerView) recyclerView;
        } else {
            overScrollableRecyclerView = null;
        }
        if (overScrollableRecyclerView != null && (adapter = overScrollableRecyclerView.getAdapter()) != null) {
            Iterator it = AbstractC1595r0.m8168a(overScrollableRecyclerView).iterator();
            while (it.hasNext() && (m9817A0 = overScrollableRecyclerView.m9817A0((view = (View) it.next()))) != -1) {
                if (adapter.mo10005m(m9817A0) == 6) {
                    float translationY = view.getTranslationY() + overScrollableRecyclerView.getOffsetY();
                    int bottom = view.getBottom();
                    float f11 = bottom + r3 + translationY;
                    canvas.drawRect(this.f10182c, f11 - this.f10184e, overScrollableRecyclerView.getWidth() - this.f10182c, f11, this.f10186g);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: k */
    public void mo10070k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        OverScrollableRecyclerView overScrollableRecyclerView;
        RecyclerView.AbstractC1880g adapter;
        int i11;
        Object m125027p;
        Object m125027p2;
        AbstractC19074t.m100208f(canvas, C18711c.f94014e);
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        if (!((Boolean) this.f10181b.mo12V4()).booleanValue()) {
            return;
        }
        View view = null;
        if (recyclerView instanceof OverScrollableRecyclerView) {
            overScrollableRecyclerView = (OverScrollableRecyclerView) recyclerView;
        } else {
            overScrollableRecyclerView = null;
        }
        if (overScrollableRecyclerView == null) {
            return;
        }
        OverScrollableRecyclerView overScrollableRecyclerView2 = (OverScrollableRecyclerView) recyclerView;
        StaticLayout m12579o = m12579o(overScrollableRecyclerView2.getWidth());
        if (m12579o == null || (adapter = overScrollableRecyclerView2.getAdapter()) == null) {
            return;
        }
        if (overScrollableRecyclerView2.getChildCount() > 0) {
            m125027p = AbstractC23906o.m125027p(AbstractC1595r0.m8168a(recyclerView));
            if (recyclerView.m9817A0((View) m125027p) == adapter.mo10003k() - 1) {
                m125027p2 = AbstractC23906o.m125027p(AbstractC1595r0.m8168a(recyclerView));
                view = (View) m125027p2;
            }
        }
        if (view == null && adapter.mo10003k() > 0) {
            return;
        }
        if (view != null) {
            i11 = view.getBottom();
        } else {
            i11 = 0;
        }
        float max = Math.max(i11 + (this.f10183d * 2), (overScrollableRecyclerView2.getHeight() - (this.f10183d * 2)) - m12579o.getHeight()) + overScrollableRecyclerView.getOffsetY();
        canvas.save();
        canvas.translate(overScrollableRecyclerView2.getWidth() / 2.0f, max);
        m12579o.draw(canvas);
        canvas.restore();
    }

    /* renamed from: m */
    public final Context m12580m() {
        return this.f10180a;
    }
}
