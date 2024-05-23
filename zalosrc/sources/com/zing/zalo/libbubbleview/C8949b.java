package com.zing.zalo.libbubbleview;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.androidquery.util.AbstractC3972e;
import com.zing.zalo.libbubbleview.AbstractC8948a;
import com.zing.zalo.libbubbleview.C8949b;
import com.zing.zalo.libbubbleview.FloatingItemView;
import com.zing.zalo.libbubbleview.p066ui.RoundedImageView;
import fn0.AbstractC19074t;
import java.util.List;
import le0.AbstractC22459a;
import p310l0.C21983d;
import p354n3.C23528a;
import p379o3.C24003n;
import p471r3.EnumC25629a;
import yt.AbstractC31072b;
import yt.AbstractC31078h;
import yt.C31071a;
import yt.C31081k;

/* renamed from: com.zing.zalo.libbubbleview.b */
/* loaded from: classes4.dex */
public class C8949b {

    /* renamed from: a */
    private final Context f47813a;

    /* renamed from: b */
    private final C31081k f47814b;

    /* renamed from: c */
    private final FloatingItemView.InterfaceC8946b f47815c;

    /* renamed from: d */
    private final C31071a f47816d;

    /* renamed from: e */
    private RoundedImageView f47817e;

    /* renamed from: f */
    private FloatingCloseButton f47818f;

    public C8949b(Context context, C31081k c31081k, FloatingItemView.InterfaceC8946b interfaceC8946b, C31071a c31071a) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c31081k, "windowManagerContainer");
        AbstractC19074t.m100208f(interfaceC8946b, "mAButtonListener");
        AbstractC19074t.m100208f(c31071a, "floatingConfig");
        this.f47813a = context;
        this.f47814b = c31081k;
        this.f47815c = interfaceC8946b;
        this.f47816d = c31071a;
        m47756l(context);
    }

    /* renamed from: l */
    private final void m47756l(Context context) {
        this.f47814b.m151011o(this);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        this.f47818f = new FloatingCloseButton(context, this);
        C31081k c31081k = this.f47814b;
        AbstractC8948a.a aVar = AbstractC8948a.Companion;
        ViewGroup.LayoutParams m151001i = C31081k.m151001i(c31081k, aVar.m47751c(context, this.f47816d.m150978e()), aVar.m47751c(context, this.f47816d.m150978e()), 8388659, 0, 0, 0, 48, null);
        C31081k c31081k2 = this.f47814b;
        FloatingCloseButton floatingCloseButton = this.f47818f;
        FloatingCloseButton floatingCloseButton2 = null;
        if (floatingCloseButton == null) {
            AbstractC19074t.m100223u("closeButton");
            floatingCloseButton = null;
        }
        c31081k2.m151005f(floatingCloseButton, m151001i);
        FloatingCloseButton floatingCloseButton3 = this.f47818f;
        if (floatingCloseButton3 == null) {
            AbstractC19074t.m100223u("closeButton");
        } else {
            floatingCloseButton2 = floatingCloseButton3;
        }
        floatingCloseButton2.setVisibility(0);
    }

    /* renamed from: o */
    public static final void m47757o(C8949b c8949b, FloatingItemView floatingItemView) {
        AbstractC19074t.m100208f(c8949b, "this$0");
        AbstractC19074t.m100208f(floatingItemView, "$floatingItemView");
        floatingItemView.m47733h(c8949b.f47815c.mo47740g(), c8949b.f47815c.mo47738e());
        floatingItemView.setVisibility(0);
        RoundedImageView roundedImageView = c8949b.f47817e;
        if (roundedImageView != null) {
            roundedImageView.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final C31081k m47758b() {
        return this.f47814b;
    }

    /* renamed from: c */
    public final int[] m47759c(View view) {
        int[] iArr = new int[2];
        FloatingCloseButton floatingCloseButton = this.f47818f;
        FloatingCloseButton floatingCloseButton2 = null;
        if (floatingCloseButton == null) {
            AbstractC19074t.m100223u("closeButton");
            floatingCloseButton = null;
        }
        int left = floatingCloseButton.getLeft();
        FloatingCloseButton floatingCloseButton3 = this.f47818f;
        if (floatingCloseButton3 == null) {
            AbstractC19074t.m100223u("closeButton");
            floatingCloseButton3 = null;
        }
        int endValueX = left + floatingCloseButton3.getEndValueX();
        FloatingCloseButton floatingCloseButton4 = this.f47818f;
        if (floatingCloseButton4 == null) {
            AbstractC19074t.m100223u("closeButton");
            floatingCloseButton4 = null;
        }
        int measuredWidth = endValueX + (floatingCloseButton4.getMeasuredWidth() / 2);
        AbstractC19074t.m100205c(view);
        iArr[0] = measuredWidth - (view.getMeasuredWidth() / 2);
        FloatingCloseButton floatingCloseButton5 = this.f47818f;
        if (floatingCloseButton5 == null) {
            AbstractC19074t.m100223u("closeButton");
            floatingCloseButton5 = null;
        }
        int top = floatingCloseButton5.getTop();
        FloatingCloseButton floatingCloseButton6 = this.f47818f;
        if (floatingCloseButton6 == null) {
            AbstractC19074t.m100223u("closeButton");
            floatingCloseButton6 = null;
        }
        int endValueY = top + floatingCloseButton6.getEndValueY();
        FloatingCloseButton floatingCloseButton7 = this.f47818f;
        if (floatingCloseButton7 == null) {
            AbstractC19074t.m100223u("closeButton");
        } else {
            floatingCloseButton2 = floatingCloseButton7;
        }
        iArr[1] = (endValueY + (floatingCloseButton2.getMeasuredHeight() / 2)) - (view.getMeasuredHeight() / 2);
        return iArr;
    }

    /* renamed from: d */
    public final FloatingCloseButton m47760d() {
        FloatingCloseButton floatingCloseButton = this.f47818f;
        if (floatingCloseButton == null) {
            AbstractC19074t.m100223u("closeButton");
            return null;
        }
        return floatingCloseButton;
    }

    /* renamed from: e */
    public final Context m47761e() {
        return this.f47813a;
    }

    /* renamed from: f */
    public final double m47762f(float f11, float f12) {
        double d11 = f11;
        FloatingCloseButton floatingCloseButton = this.f47818f;
        FloatingCloseButton floatingCloseButton2 = null;
        if (floatingCloseButton == null) {
            AbstractC19074t.m100223u("closeButton");
            floatingCloseButton = null;
        }
        double centerX = d11 - floatingCloseButton.getCenterX();
        double d12 = f12;
        FloatingCloseButton floatingCloseButton3 = this.f47818f;
        if (floatingCloseButton3 == null) {
            AbstractC19074t.m100223u("closeButton");
        } else {
            floatingCloseButton2 = floatingCloseButton3;
        }
        return Math.hypot(centerX, d12 - floatingCloseButton2.getCenterY());
    }

    /* renamed from: g */
    public final C31071a m47763g() {
        return this.f47816d;
    }

    /* renamed from: h */
    public final RoundedImageView m47764h() {
        return this.f47817e;
    }

    /* renamed from: i */
    public final FloatingItemView.InterfaceC8946b m47765i() {
        return this.f47815c;
    }

    /* renamed from: j */
    public final View m47766j() {
        return this.f47814b.m151010n();
    }

    /* renamed from: k */
    public final C31081k m47767k() {
        return this.f47814b;
    }

    /* renamed from: m */
    public final void m47768m(int i11, int i12) {
        int i13 = (int) (i12 * 0.5f);
        AbstractC8948a.a aVar = AbstractC8948a.Companion;
        int m47750b = ((i11 - aVar.m47750b(this.f47813a, AbstractC31078h.height_tab_main)) - aVar.m47751c(this.f47813a, this.f47816d.m150982i())) - (aVar.m47751c(this.f47813a, this.f47816d.m150978e()) / 2);
        FloatingCloseButton floatingCloseButton = this.f47818f;
        if (floatingCloseButton == null) {
            AbstractC19074t.m100223u("closeButton");
            floatingCloseButton = null;
        }
        floatingCloseButton.m47724k(i13, m47750b);
    }

    /* renamed from: n */
    public final FloatingItemView m47769n(List list) {
        String mo102611e;
        EnumC25629a enumC25629a;
        AbstractC19074t.m100208f(list, "itemList");
        int size = list.size();
        if (size <= 0) {
            return null;
        }
        this.f47814b.m151012p();
        AbstractC31072b abstractC31072b = (AbstractC31072b) list.get(size - 1);
        FloatingItemView floatingItemView = new FloatingItemView(this, this.f47813a, abstractC31072b, this.f47815c, this.f47816d);
        ViewGroup.LayoutParams m151001i = C31081k.m151001i(this.f47814b, -2, -2, 8388659, 0, 0, 0, 48, null);
        floatingItemView.setVisibility(8);
        this.f47814b.m151003d(floatingItemView, m151001i);
        if (this.f47816d.m150988o() && (mo102611e = abstractC31072b.mo102611e()) != null) {
            RoundedImageView roundedImageView = new RoundedImageView(new C21983d(this.f47813a, AbstractC2814h.shadow_level_03));
            this.f47817e = roundedImageView;
            roundedImageView.setBorderColor(AbstractC22459a.m116119a(this.f47813a, AbstractC2807a.divider_02));
            RoundedImageView roundedImageView2 = this.f47817e;
            if (roundedImageView2 != null) {
                roundedImageView2.setBorderWidthDP(this.f47816d.m150975b());
            }
            int m47751c = AbstractC8948a.Companion.m47751c(this.f47813a, this.f47816d.m150991r());
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(m47751c, m47751c);
            float m150990q = this.f47816d.m150990q();
            RoundedImageView roundedImageView3 = this.f47817e;
            if (roundedImageView3 != null) {
                roundedImageView3.m47825j(m150990q, m150990q, m150990q, m150990q);
            }
            C23528a c23528a = (C23528a) new C23528a(this.f47813a).m123612r(this.f47817e);
            if (AbstractC3972e.m18765V()) {
                enumC25629a = EnumC25629a.IN_BITMAP;
            } else {
                enumC25629a = EnumC25629a.DEFAULT;
            }
            c23528a.m123618x(mo102611e, new C24003n(0, null, 0, false, 0, false, enumC25629a, 63, null));
            RoundedImageView roundedImageView4 = this.f47817e;
            if (roundedImageView4 != null) {
                roundedImageView4.setVisibility(8);
            }
            C31081k c31081k = this.f47814b;
            RoundedImageView roundedImageView5 = this.f47817e;
            AbstractC19074t.m100205c(roundedImageView5);
            c31081k.m151004e(roundedImageView5, layoutParams);
        }
        floatingItemView.post(new Runnable() { // from class: yt.f

            /* renamed from: q */
            public final /* synthetic */ FloatingItemView f143271q;

            public /* synthetic */ RunnableC31076f(FloatingItemView floatingItemView2) {
                r2 = floatingItemView2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C8949b.m47757o(C8949b.this, r2);
            }
        });
        return floatingItemView2;
    }
}
