package w10;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.AbstractC1388a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import fn0.AbstractC19074t;
import p354n3.C23528a;
import p379o3.C24003n;
import q10.C25045q0;
import s20.AbstractC26101c;
import s20.AbstractC26103e;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;

/* renamed from: w10.h */
/* loaded from: classes5.dex */
public final class C28693h implements InterfaceC28689d {

    /* renamed from: a */
    private final View.OnClickListener f133172a;

    public C28693h(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "onClick");
        this.f133172a = onClickListener;
    }

    /* renamed from: b */
    private final void m143745b(C25045q0 c25045q0, BottomSheetItem bottomSheetItem, View.OnClickListener onClickListener, boolean z11) {
        String str;
        RecyclingImageView recyclingImageView = c25045q0.f120191q;
        AbstractC19074t.m100207e(recyclingImageView, "ivIconStart");
        m143747d(recyclingImageView, AbstractC26101c.m134306g(bottomSheetItem), AbstractC27406a.zch_icon_tertiary, bottomSheetItem.m51411a());
        RobotoTextView robotoTextView = c25045q0.f120192r;
        String m51412b = bottomSheetItem.m51412b();
        if (m51412b == null) {
            Integer m134307h = AbstractC26101c.m134307h(bottomSheetItem, z11);
            if (m134307h != null) {
                str = c25045q0.f120192r.getContext().getString(m134307h.intValue());
            } else {
                str = null;
            }
            m51412b = str;
        }
        robotoTextView.setText(m51412b);
        c25045q0.f120192r.setTag(bottomSheetItem);
        c25045q0.f120192r.setOnClickListener(onClickListener);
    }

    /* renamed from: c */
    private final C24003n m143746c(Context context, Integer num, int i11) {
        if (num != null) {
            return new C24003n(AbstractC26103e.m134328b(context, AbstractC27407b.zch_bts_size_icon), C27280g.m139659b(context, num.intValue(), i11), 0, false, 0, false, null, 124, null);
        }
        return null;
    }

    /* renamed from: d */
    private final void m143747d(RecyclingImageView recyclingImageView, Integer num, int i11, String str) {
        Context context = recyclingImageView.getContext();
        if (context == null) {
            return;
        }
        if (str != null) {
            C24003n m143746c = m143746c(context, num, i11);
            C23528a c23528a = (C23528a) new C23528a(context).m123612r(recyclingImageView);
            c23528a.m123599d();
            if (m143746c == null) {
                return;
            } else {
                return;
            }
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
        C25045q0 m129920c = C25045q0.m129920c(LayoutInflater.from(viewGroup.getContext()), viewGroup, true);
        AbstractC19074t.m100207e(m129920c, "inflate(...)");
        m143745b(m129920c, bottomSheetItem, this.f133172a, z11);
    }
}
