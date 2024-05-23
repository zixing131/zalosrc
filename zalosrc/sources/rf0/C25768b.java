package rf0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.MiniAppBottomMenu;
import com.zing.zalo.zdesign.component.TrackingLinearLayout;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23268y2;
import rf0.C25768b;

/* renamed from: rf0.b */
/* loaded from: classes5.dex */
public final class C25768b extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final Context f122937r;

    /* renamed from: s */
    private final b f122938s;

    /* renamed from: t */
    private List f122939t = new ArrayList();

    /* renamed from: rf0.b$a */
    /* loaded from: classes5.dex */
    public final class a extends c {

        /* renamed from: J */
        private GroupAvatarView f122940J;

        /* renamed from: K */
        private RobotoTextView f122941K;

        /* renamed from: L */
        private TrackingLinearLayout f122942L;

        /* renamed from: M */
        final /* synthetic */ C25768b f122943M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C25768b c25768b, View view) {
            super(c25768b, view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f122943M = c25768b;
            View findViewById = view.findViewById(AbstractC6918a0.ma_contact_icon);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f122940J = (GroupAvatarView) findViewById;
            View findViewById2 = view.findViewById(AbstractC6918a0.ma_contact_name);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            this.f122941K = (RobotoTextView) findViewById2;
            View findViewById3 = view.findViewById(AbstractC6918a0.ma_item_share_view);
            AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
            TrackingLinearLayout trackingLinearLayout = (TrackingLinearLayout) findViewById3;
            this.f122942L = trackingLinearLayout;
            trackingLinearLayout.setIdTracking("ma_menu_quick_share_profile");
            view.getLayoutParams().width = MiniAppBottomMenu.Companion.m81686a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m132897k0(C25768b c25768b, ContactProfile contactProfile, View view) {
            AbstractC19074t.m100208f(c25768b, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$profile");
            b m132894L = c25768b.m132894L();
            if (m132894L != null) {
                m132894L.mo81399c(contactProfile);
            }
        }

        @Override // rf0.C25768b.c
        /* renamed from: i0 */
        public void mo132898i0(final ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "profile");
            AbstractC23268y2.m120027a(this.f122940J, contactProfile, false);
            this.f122941K.setText(contactProfile.f42437s);
            TrackingLinearLayout trackingLinearLayout = this.f122942L;
            final C25768b c25768b = this.f122943M;
            trackingLinearLayout.setOnClickListener(new View.OnClickListener() { // from class: rf0.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C25768b.a.m132897k0(C25768b.this, contactProfile, view);
                }
            });
        }
    }

    /* renamed from: rf0.b$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo81397a();

        /* renamed from: b */
        void mo81398b();

        /* renamed from: c */
        void mo81399c(ContactProfile contactProfile);

        /* renamed from: d */
        void mo81400d();

        /* renamed from: e */
        float mo81401e();

        /* renamed from: f */
        boolean mo81402f();

        /* renamed from: g */
        void mo81403g();

        /* renamed from: g0 */
        void mo81404g0(String str);

        /* renamed from: h */
        void mo81405h();

        /* renamed from: i */
        void mo81406i();

        /* renamed from: j */
        void mo81407j();

        /* renamed from: k */
        void mo81408k(String str);

        void onDismiss();

        /* renamed from: r3 */
        void mo81409r3(String str);
    }

    /* renamed from: rf0.b$c */
    /* loaded from: classes5.dex */
    public class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        final /* synthetic */ C25768b f122944I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C25768b c25768b, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f122944I = c25768b;
        }

        /* renamed from: i0 */
        public abstract void mo132898i0(ContactProfile contactProfile);
    }

    /* renamed from: rf0.b$d */
    /* loaded from: classes5.dex */
    public final class d extends c {

        /* renamed from: J */
        private ZAppCompatImageView f122945J;

        /* renamed from: K */
        private RobotoTextView f122946K;

        /* renamed from: L */
        private TrackingLinearLayout f122947L;

        /* renamed from: M */
        final /* synthetic */ C25768b f122948M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C25768b c25768b, View view) {
            super(c25768b, view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f122948M = c25768b;
            View findViewById = view.findViewById(AbstractC6918a0.ma_contact_icon);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f122945J = (ZAppCompatImageView) findViewById;
            View findViewById2 = view.findViewById(AbstractC6918a0.ma_contact_name);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            this.f122946K = (RobotoTextView) findViewById2;
            View findViewById3 = view.findViewById(AbstractC6918a0.ma_item_share_view);
            AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
            TrackingLinearLayout trackingLinearLayout = (TrackingLinearLayout) findViewById3;
            this.f122947L = trackingLinearLayout;
            trackingLinearLayout.setIdTracking("ma_menu_quick_share_see_more");
            view.getLayoutParams().width = MiniAppBottomMenu.Companion.m81686a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m132900k0(C25768b c25768b, View view) {
            AbstractC19074t.m100208f(c25768b, "this$0");
            b m132894L = c25768b.m132894L();
            if (m132894L != null) {
                m132894L.mo81406i();
            }
        }

        @Override // rf0.C25768b.c
        /* renamed from: i0 */
        public void mo132898i0(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "profile");
            TrackingLinearLayout trackingLinearLayout = this.f122947L;
            final C25768b c25768b = this.f122948M;
            trackingLinearLayout.setOnClickListener(new View.OnClickListener() { // from class: rf0.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C25768b.d.m132900k0(C25768b.this, view);
                }
            });
        }
    }

    public C25768b(Context context, b bVar) {
        this.f122937r = context;
        this.f122938s = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        ContactProfile contactProfile = (ContactProfile) this.f122939t.get(i11);
        if (abstractC1876c0 instanceof c) {
            ((c) abstractC1876c0).mo132898i0(contactProfile);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 == 4) {
            View inflate = LayoutInflater.from(this.f122937r).inflate(AbstractC7409c0.mini_app_share_more_item, viewGroup, false);
            AbstractC19074t.m100207e(inflate, "inflate(...)");
            return new d(this, inflate);
        }
        View inflate2 = LayoutInflater.from(this.f122937r).inflate(AbstractC7409c0.mini_app_share_contact_item, viewGroup, false);
        AbstractC19074t.m100207e(inflate2, "inflate(...)");
        return new a(this, inflate2);
    }

    /* renamed from: L */
    public final b m132894L() {
        return this.f122938s;
    }

    /* renamed from: M */
    public final void m132895M(List list) {
        AbstractC19074t.m100208f(list, "newList");
        this.f122939t = list;
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f122939t.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((ContactProfile) this.f122939t.get(i11)).m40426r0();
    }
}
