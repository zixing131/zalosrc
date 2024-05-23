package com.zing.zalo.shortvideo.p072ui.state.floating;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.res.AbstractC1401h;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import p227i3.C20218v;
import s20.AbstractC26105g;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27408c;

/* renamed from: com.zing.zalo.shortvideo.ui.state.floating.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10105a {
    public static final a Companion = new a(null);

    /* renamed from: f */
    private static final Drawable f52508f;

    /* renamed from: g */
    private static final Drawable f52509g;

    /* renamed from: h */
    private static final int f52510h;

    /* renamed from: i */
    private static WeakReference f52511i;

    /* renamed from: j */
    private static WeakReference f52512j;

    /* renamed from: a */
    private final Object f52513a;

    /* renamed from: b */
    private WeakReference f52514b;

    /* renamed from: c */
    private WeakReference f52515c;

    /* renamed from: d */
    private Rect f52516d = new Rect();

    /* renamed from: e */
    private Bundle f52517e = new Bundle();

    /* renamed from: com.zing.zalo.shortvideo.ui.state.floating.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bitmap m53893a() {
            Bitmap bitmap;
            WeakReference weakReference = AbstractC10105a.f52512j;
            if (weakReference != null) {
                bitmap = (Bitmap) weakReference.get();
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                return bitmap;
            }
            Rect rect = new Rect(0, 0, AbstractC26105g.m134347n(70), AbstractC26105g.m134347n(105));
            Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.RGB_565);
            AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(AbstractC10105a.f52510h);
            Drawable drawable = AbstractC10105a.f52509g;
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            Drawable drawable2 = AbstractC10105a.f52509g;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            AbstractC10105a.f52512j = new WeakReference(createBitmap);
            return createBitmap;
        }

        /* renamed from: b */
        public final Bitmap m53894b() {
            Bitmap bitmap;
            WeakReference weakReference = AbstractC10105a.f52511i;
            if (weakReference != null) {
                bitmap = (Bitmap) weakReference.get();
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                return bitmap;
            }
            Rect rect = new Rect(0, 0, AbstractC26105g.m134347n(70), AbstractC26105g.m134347n(105));
            Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.RGB_565);
            AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(AbstractC10105a.f52510h);
            Drawable drawable = AbstractC10105a.f52508f;
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            Drawable drawable2 = AbstractC10105a.f52508f;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            AbstractC10105a.f52511i = new WeakReference(createBitmap);
            return createBitmap;
        }
    }

    static {
        Context appContext = CoreUtility.getAppContext();
        AbstractC19074t.m100207e(appContext, "getAppContext(...)");
        f52508f = C27280g.m139658a(appContext, AbstractC27408c.zch_overlay_floating_item);
        Context appContext2 = CoreUtility.getAppContext();
        AbstractC19074t.m100207e(appContext2, "getAppContext(...)");
        f52509g = C27280g.m139658a(appContext2, AbstractC27408c.zch_overlay_floating_live_item);
        f52510h = AbstractC1401h.m7080d(CoreUtility.getAppContext().getResources(), AbstractC27406a.zch_layer_background_disable, null);
    }

    public AbstractC10105a(Object obj) {
        this.f52513a = obj;
    }

    /* renamed from: h */
    public final Bundle m53882h() {
        return this.f52517e;
    }

    /* renamed from: i */
    public abstract String mo53883i();

    /* renamed from: j */
    public final Bitmap m53884j() {
        WeakReference weakReference = this.f52515c;
        if (weakReference != null) {
            return (Bitmap) weakReference.get();
        }
        return null;
    }

    /* renamed from: k */
    public final Rect m53885k() {
        return this.f52516d;
    }

    /* renamed from: l */
    public final Bitmap m53886l() {
        Rect rect;
        Bitmap m53884j = m53884j();
        if (m53884j == null) {
            return null;
        }
        if (m53884j.getWidth() < m53884j.getHeight()) {
            rect = new Rect(0, (m53884j.getHeight() / 2) - ((m53884j.getWidth() * 3) / 4), m53884j.getWidth(), (m53884j.getHeight() / 2) + ((m53884j.getWidth() * 3) / 4));
        } else {
            rect = new Rect((m53884j.getWidth() / 2) - (m53884j.getHeight() / 3), 0, (m53884j.getWidth() / 2) + (m53884j.getHeight() / 3), m53884j.getHeight());
        }
        Rect rect2 = new Rect(0, 0, AbstractC26105g.m134347n(70), AbstractC26105g.m134347n(105));
        Bitmap createBitmap = Bitmap.createBitmap(rect2.width(), rect2.height(), Bitmap.Config.RGB_565);
        AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(m53884j, rect, rect2, (Paint) null);
        Drawable drawable = f52508f;
        if (drawable != null) {
            drawable.setBounds(rect2);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.f52514b = new WeakReference(createBitmap);
        return createBitmap;
    }

    /* renamed from: m */
    public final Bitmap m53887m() {
        Rect rect;
        Bitmap m53884j = m53884j();
        if (m53884j == null) {
            return null;
        }
        if (m53884j.getWidth() < m53884j.getHeight()) {
            rect = new Rect(0, (m53884j.getHeight() / 2) - ((m53884j.getWidth() * 3) / 4), m53884j.getWidth(), (m53884j.getHeight() / 2) + ((m53884j.getWidth() * 3) / 4));
        } else {
            rect = new Rect((m53884j.getWidth() / 2) - (m53884j.getHeight() / 3), 0, (m53884j.getWidth() / 2) + (m53884j.getHeight() / 3), m53884j.getHeight());
        }
        Rect rect2 = new Rect(0, 0, AbstractC26105g.m134347n(70), AbstractC26105g.m134347n(105));
        Bitmap createBitmap = Bitmap.createBitmap(rect2.width(), rect2.height(), Bitmap.Config.RGB_565);
        AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(m53884j, rect, rect2, (Paint) null);
        Drawable drawable = f52509g;
        if (drawable != null) {
            drawable.setBounds(rect2);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.f52514b = new WeakReference(createBitmap);
        return createBitmap;
    }

    /* renamed from: n */
    public final Object m53888n() {
        return this.f52513a;
    }

    /* renamed from: o */
    public final void m53889o(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        this.f52516d.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: p */
    public void m53890p() {
        Bitmap bitmap;
        Bitmap bitmap2;
        WeakReference weakReference = this.f52515c;
        if (weakReference != null && (bitmap2 = (Bitmap) weakReference.get()) != null) {
            bitmap2.recycle();
        }
        WeakReference weakReference2 = this.f52515c;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f52515c = null;
        WeakReference weakReference3 = this.f52514b;
        if (weakReference3 != null && (bitmap = (Bitmap) weakReference3.get()) != null) {
            bitmap.recycle();
        }
        WeakReference weakReference4 = this.f52514b;
        if (weakReference4 != null) {
            weakReference4.clear();
        }
        this.f52514b = null;
    }

    /* renamed from: q */
    public final void m53891q(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "consumer");
        interfaceC18505l.mo205i9(this.f52517e);
    }

    /* renamed from: r */
    public final void m53892r(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        m53890p();
        this.f52515c = new WeakReference(bitmap);
    }
}
