package w10;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.core.content.AbstractC1388a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import com.zing.zalo.shortvideo.p072ui.widget.SwitchView;
import fn0.AbstractC19074t;
import p354n3.AbstractC23529b;
import p354n3.C23528a;
import p379o3.C24003n;
import q10.C25042p0;
import s20.AbstractC26101c;
import s20.AbstractC26103e;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;

/* renamed from: w10.g */
/* loaded from: classes5.dex */
public final class C28692g implements InterfaceC28689d {

    /* renamed from: a */
    private final View.OnClickListener f133171a;

    public C28692g(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "onClick");
        this.f133171a = onClickListener;
    }

    /* renamed from: d */
    private final void m143740d(C25042p0 c25042p0, BottomSheetItem bottomSheetItem) {
        boolean z11;
        RecyclingImageView recyclingImageView = c25042p0.f120175q;
        AbstractC19074t.m100207e(recyclingImageView, "ivIconStart");
        m143744h(recyclingImageView, AbstractC26101c.m134306g(bottomSheetItem), AbstractC27406a.zch_icon_tertiary, bottomSheetItem.m51411a());
        RobotoTextView robotoTextView = c25042p0.f120176r;
        String m51412b = bottomSheetItem.m51412b();
        if (m51412b == null) {
            m51412b = null;
            Integer m134308i = AbstractC26101c.m134308i(bottomSheetItem, false, 1, null);
            if (m134308i != null) {
                m51412b = c25042p0.f120176r.getContext().getString(m134308i.intValue());
            }
        }
        robotoTextView.setText(m51412b);
        c25042p0.f120177s.setSwitchable(false);
        String m51414d = bottomSheetItem.m51414d();
        if (m51414d != null && Boolean.parseBoolean(m51414d)) {
            z11 = true;
        } else {
            z11 = false;
        }
        SwitchView switchView = c25042p0.f120177s;
        AbstractC19074t.m100207e(switchView, "swvScroll");
        SwitchView.m55812g(switchView, z11, false, false, 6, null);
        c25042p0.f120176r.setTag(bottomSheetItem);
        c25042p0.f120176r.setOnClickListener(new View.OnClickListener() { // from class: w10.e

            /* renamed from: q */
            public final /* synthetic */ C28692g f133168q;

            public /* synthetic */ ViewOnClickListenerC28690e(C28692g this) {
                r2 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C28692g.m143741e(C25042p0.this, r2, view);
            }
        });
    }

    /* renamed from: e */
    public static final void m143741e(C25042p0 c25042p0, C28692g c28692g, View view) {
        BottomSheetItem bottomSheetItem;
        String m51414d;
        AbstractC19074t.m100208f(c25042p0, "$this_bind");
        AbstractC19074t.m100208f(c28692g, "this$0");
        Object tag = view.getTag();
        if (tag instanceof BottomSheetItem) {
            bottomSheetItem = (BottomSheetItem) tag;
        } else {
            bottomSheetItem = null;
        }
        boolean z11 = false;
        if (bottomSheetItem != null && (m51414d = bottomSheetItem.m51414d()) != null && Boolean.parseBoolean(m51414d)) {
            z11 = true;
        }
        SwitchView switchView = c25042p0.f120177s;
        AbstractC19074t.m100207e(switchView, "swvScroll");
        SwitchView.m55812g(switchView, !z11, true, false, 4, null);
        view.postDelayed(new Runnable() { // from class: w10.f

            /* renamed from: q */
            public final /* synthetic */ View f133170q;

            public /* synthetic */ RunnableC28691f(View view2) {
                r2 = view2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28692g.m143742f(C28692g.this, r2);
            }
        }, ViewConfiguration.getDoubleTapTimeout());
    }

    /* renamed from: f */
    public static final void m143742f(C28692g c28692g, View view) {
        AbstractC19074t.m100208f(c28692g, "this$0");
        c28692g.f133171a.onClick(view);
    }

    /* renamed from: g */
    private final C24003n m143743g(Context context, Integer num, int i11) {
        if (num != null) {
            return new C24003n(AbstractC26103e.m134328b(context, AbstractC27407b.zch_bts_size_icon), C27280g.m139659b(context, num.intValue(), i11), 0, false, 0, false, null, 124, null);
        }
        return null;
    }

    /* renamed from: h */
    private final void m143744h(RecyclingImageView recyclingImageView, Integer num, int i11, String str) {
        AbstractC23529b m123618x;
        Context context = recyclingImageView.getContext();
        if (context == null) {
            return;
        }
        if (str != null) {
            C24003n m143743g = m143743g(context, num, i11);
            C23528a c23528a = (C23528a) new C23528a(context).m123612r(recyclingImageView);
            c23528a.m123599d();
            if (m143743g == null) {
                m123618x = c23528a.m123616v(str);
            } else {
                m123618x = c23528a.m123618x(str, m143743g);
            }
            return;
        }
        if (num != null) {
            Drawable m139658a = C27280g.m139658a(context, num.intValue());
            if (m139658a != null) {
                recyclingImageView.setImageDrawable(m139658a);
            }
            AbstractC26112n.m134429v0(recyclingImageView, AbstractC1388a.m6961c(context, i11));
        }
    }

    @Override // w10.InterfaceC28689d
    /* renamed from: a */
    public void mo143737a(ViewGroup viewGroup, BottomSheetItem bottomSheetItem, boolean z11) {
        AbstractC19074t.m100208f(viewGroup, "parentView");
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        C25042p0 m129914c = C25042p0.m129914c(LayoutInflater.from(viewGroup.getContext()), viewGroup, true);
        AbstractC19074t.m100207e(m129914c, "inflate(...)");
        m143740d(m129914c, bottomSheetItem);
    }
}
