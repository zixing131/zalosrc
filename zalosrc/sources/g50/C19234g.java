package g50;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1915h;
import androidx.recyclerview.widget.AbstractC1925r;
import androidx.recyclerview.widget.RecyclerView;
import au.C2343e;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17927b;
import fn0.AbstractC19074t;
import g50.C19234g;
import ho0.AbstractC20110a;
import java.util.List;
import me0.AbstractC23028c0;
import me0.C23212s8;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;
import p649xl.C30116x6;
import qm0.AbstractC25332a0;

/* renamed from: g50.g */
/* loaded from: classes5.dex */
public final class C19234g extends AbstractC1925r {

    /* renamed from: t */
    private final C23528a f95720t;

    /* renamed from: u */
    private b f95721u;

    /* renamed from: g50.g$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC1915h.d {
        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo10506a(ContactProfile contactProfile, ContactProfile contactProfile2) {
            AbstractC19074t.m100208f(contactProfile, "oldItem");
            AbstractC19074t.m100208f(contactProfile2, "newItem");
            if (AbstractC19074t.m100204b(contactProfile.f42434r, contactProfile2.f42434r) && AbstractC19074t.m100204b(contactProfile.f42446v, contactProfile2.f42446v) && AbstractC19074t.m100204b(contactProfile.f42437s, contactProfile2.f42437s)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo10507b(ContactProfile contactProfile, ContactProfile contactProfile2) {
            AbstractC19074t.m100208f(contactProfile, "oldItem");
            AbstractC19074t.m100208f(contactProfile2, "newItem");
            return AbstractC19074t.m100204b(contactProfile.f42434r, contactProfile2.f42434r);
        }
    }

    /* renamed from: g50.g$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo84172a(ContactProfile contactProfile);
    }

    /* renamed from: g50.g$c */
    /* loaded from: classes5.dex */
    public static final class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final C23528a f95722I;

        /* renamed from: J */
        private final C30116x6 f95723J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view, C23528a c23528a) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(c23528a, "mAQuery");
            this.f95722I = c23528a;
            C30116x6 m148687a = C30116x6.m148687a(view);
            AbstractC19074t.m100207e(m148687a, "bind(...)");
            this.f95723J = m148687a;
        }

        /* renamed from: j0 */
        private final void m100915j0(ContactProfile contactProfile) {
            AvatarImageView avatarImageView = this.f95723J.f139904r;
            avatarImageView.setImageDrawable(C23212s8.m119609q(avatarImageView.getContext(), AbstractC16781w.default_avatar));
            try {
                if (!TextUtils.isEmpty(contactProfile.f42446v)) {
                    if (C23302b.f113247a.m120523d(contactProfile.f42446v) && !AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
                        int m12307a = C2343e.m12307a(contactProfile.f42434r, false);
                        String m118087g = AbstractC23028c0.m118087g(contactProfile.m40383Q(true, false));
                        AbstractC19074t.m100207e(m118087g, "getInitialShortNameByName(...)");
                        this.f95723J.f139904r.setImageDrawable(C16640q2.m88404a().mo88412f(m118087g, m12307a));
                    } else {
                        ((C23528a) this.f95722I.m123612r(this.f95723J.f139904r)).m123618x(contactProfile.f42446v, C23278z2.m120143n());
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                e11.printStackTrace();
            }
        }

        /* renamed from: i0 */
        public final void m100916i0(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "info");
            this.f95723J.f139905s.setText(contactProfile.m40383Q(true, false));
            m100915j0(contactProfile);
        }

        /* renamed from: k0 */
        public final C30116x6 m100917k0() {
            return this.f95723J;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19234g(C23528a c23528a, b bVar) {
        super(new a());
        AbstractC19074t.m100208f(c23528a, "aQuery");
        this.f95720t = c23528a;
        this.f95721u = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m100908T(final c cVar, final C19234g c19234g, View view) {
        AbstractC19074t.m100208f(cVar, "$holder");
        AbstractC19074t.m100208f(c19234g, "this$0");
        AbstractC17927b.Companion.m94536b().mo94530d("DEBOUNCE_REMOVE_MUTED_CALLER", new Runnable() { // from class: g50.f
            @Override // java.lang.Runnable
            public final void run() {
                C19234g.m100909U(C19234g.c.this, c19234g);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static final void m100909U(c cVar, C19234g c19234g) {
        b bVar;
        AbstractC19074t.m100208f(cVar, "$holder");
        AbstractC19074t.m100208f(c19234g, "this$0");
        if (cVar.m9929A() >= 0 && (bVar = c19234g.f95721u) != null) {
            Object m10633M = c19234g.m10633M(cVar.m9929A());
            AbstractC19074t.m100207e(m10633M, "getItem(...)");
            bVar.mo84172a((ContactProfile) m10633M);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo9990A(final c cVar, int i11) {
        AbstractC19074t.m100208f(cVar, "holder");
        Object m10633M = m10633M(i11);
        AbstractC19074t.m100207e(m10633M, "getItem(...)");
        cVar.m100916i0((ContactProfile) m10633M);
        cVar.m100917k0().f139903q.setOnClickListener(new View.OnClickListener() { // from class: g50.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19234g.m100908T(C19234g.c.this, this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.layout_row_muted_callers, viewGroup, false);
        AbstractC19074t.m100207e(inflate, "inflate(...)");
        return new c(inflate, this.f95720t);
    }

    /* renamed from: W */
    public final void m100912W(List list) {
        List m131185M0;
        AbstractC19074t.m100208f(list, "mutedCallers");
        m131185M0 = AbstractC25332a0.m131185M0(list);
        m10635O(m131185M0);
    }
}
