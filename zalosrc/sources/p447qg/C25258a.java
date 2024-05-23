package p447qg;

import ac.C0708i;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.AbstractC1915h;
import androidx.recyclerview.widget.AbstractC1925r;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.CheckBox;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p447qg.C25258a;
import qm0.AbstractC25332a0;
import sg.C26244d;
import ui0.C27280g;

/* renamed from: qg.a */
/* loaded from: classes3.dex */
public final class C25258a extends AbstractC1925r {

    /* renamed from: t */
    private final HashMap f121141t;

    /* renamed from: u */
    private boolean f121142u;

    /* renamed from: v */
    private boolean f121143v;

    /* renamed from: w */
    private InterfaceC18494a f121144w;

    /* renamed from: x */
    private InterfaceC18505l f121145x;

    /* renamed from: y */
    private InterfaceC18505l f121146y;

    /* renamed from: z */
    private InterfaceC18505l f121147z;

    /* renamed from: qg.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC1915h.d {
        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo10506a(ContactProfile contactProfile, ContactProfile contactProfile2) {
            AbstractC19074t.m100208f(contactProfile, "oldItem");
            AbstractC19074t.m100208f(contactProfile2, "newItem");
            if (!AbstractC19074t.m100204b(contactProfile.f42434r, contactProfile2.f42434r) || !AbstractC19074t.m100204b(contactProfile.f42446v, contactProfile2.f42446v) || !AbstractC19074t.m100204b(contactProfile.f42437s, contactProfile2.f42437s) || !AbstractC19074t.m100204b(contactProfile.f42455y, contactProfile2.f42455y) || !AbstractC19074t.m100204b(contactProfile.m40383Q(true, false), contactProfile2.m40383Q(true, false))) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo10507b(ContactProfile contactProfile, ContactProfile contactProfile2) {
            AbstractC19074t.m100208f(contactProfile, "oldItem");
            AbstractC19074t.m100208f(contactProfile2, "newItem");
            return AbstractC19074t.m100204b(contactProfile.f42434r, contactProfile2.f42434r);
        }
    }

    /* renamed from: qg.a$b */
    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final ListItem f121148I;

        /* renamed from: J */
        private Button f121149J;

        /* renamed from: K */
        private Button f121150K;

        /* renamed from: L */
        private Avatar f121151L;

        /* renamed from: M */
        private LinearLayout f121152M;

        /* renamed from: N */
        final /* synthetic */ C25258a f121153N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25258a c25258a, ListItem listItem) {
            super(listItem);
            AbstractC19074t.m100208f(listItem, "itemView");
            this.f121153N = c25258a;
            this.f121148I = listItem;
            listItem.setIdTracking("suggest_cleanup_relation_profile");
            listItem.getCheckbox().setClickable(true);
            EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
            listItem.setLeadingGravity(enumC16952b0);
            Context context = listItem.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            Avatar avatar = new Avatar(context);
            Context context2 = listItem.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            avatar.m90481x(context2, EnumC16949e.SIZE_48);
            avatar.setIdTracking("suggest_cleanup_relation_profile");
            this.f121151L = avatar;
            listItem.m90587c(avatar);
            listItem.setTitleColor(C23212s8.m119606n(AbstractC2807a.TextColor1));
            listItem.setSubtitleColor(C23212s8.m119606n(AbstractC2807a.TextColor2));
            listItem.m90591l(AbstractC23136l9.m118712h(listItem.getContext(), 80.0f), 0, 0, 0);
            Context context3 = listItem.getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            Button button = new Button(context3);
            button.setIdTracking("suggest_cleanup_relation_chat");
            button.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            button.m90539c(AbstractC2814h.ButtonMedium_SecondaryNeutral);
            Context context4 = listItem.getContext();
            AbstractC19074t.m100207e(context4, "getContext(...)");
            button.setSupportiveIcon(C27280g.m139658a(context4, AbstractC2810d.zds_ic_chat_line_24));
            this.f121149J = button;
            Context context5 = listItem.getContext();
            AbstractC19074t.m100207e(context5, "getContext(...)");
            Button button2 = new Button(context5);
            button2.setIdTracking("suggest_cleanup_relation_unfriend");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(AbstractC23136l9.m118712h(button2.getContext(), 16.0f), 0, 0, 0);
            button2.setLayoutParams(layoutParams);
            button2.m90539c(AbstractC2814h.ButtonMedium_SecondaryDanger);
            Context context6 = listItem.getContext();
            AbstractC19074t.m100207e(context6, "getContext(...)");
            button2.setSupportiveIcon(C27280g.m139658a(context6, AbstractC2810d.zds_ic_delete_line_24));
            this.f121150K = button2;
            LinearLayout linearLayout = new LinearLayout(listItem.getContext());
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            this.f121152M = linearLayout;
            linearLayout.addView(this.f121149J);
            this.f121152M.addView(this.f121150K);
            listItem.m90589e(this.f121152M);
            listItem.setTrailingGravity(enumC16952b0);
        }

        /* renamed from: q0 */
        private final void m130721q0(ListItem listItem, ContactProfile contactProfile) {
            String str;
            Avatar avatar = this.f121151L;
            String str2 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str2, "uid");
            avatar.m90479n(str2);
            String m40383Q = contactProfile.m40383Q(true, false);
            AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
            listItem.setTitle(m40383Q);
            String str3 = contactProfile.f42437s;
            AbstractC19074t.m100207e(str3, "dpn");
            if (str3.length() > 0) {
                String str4 = contactProfile.f42455y;
                AbstractC19074t.m100207e(str4, "phone");
                if (str4.length() > 0) {
                    listItem.setSubtitleMaxLine(2);
                    String str5 = contactProfile.f42455y;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_name_title);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    String format = String.format(m118743r0, Arrays.copyOf(new Object[]{contactProfile.f42437s}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    str = str5 + "\n" + format;
                    listItem.setSubtitle(str);
                }
            }
            listItem.setSubtitleMaxLine(1);
            String str6 = contactProfile.f42455y;
            if (str6.length() == 0) {
                C19067n0 c19067n02 = C19067n0.f94947a;
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_name_title);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                str = String.format(m118743r02, Arrays.copyOf(new Object[]{contactProfile.f42437s}, 1));
                AbstractC19074t.m100207e(str, "format(...)");
            } else {
                str = str6;
            }
            AbstractC19074t.m100205c(str);
            listItem.setSubtitle(str);
        }

        /* renamed from: r0 */
        private final void m130722r0(final ListItem listItem, final ContactProfile contactProfile, int i11, Object obj) {
            int i12;
            C0708i c0708i = new C0708i();
            c0708i.m1072c("sort", i11);
            listItem.setTrackingExtraData(c0708i);
            if (!this.f121153N.f121142u) {
                Button button = this.f121149J;
                final C25258a c25258a = this.f121153N;
                button.setTrackingExtraData(c0708i);
                button.setOnClickListener(new View.OnClickListener() { // from class: qg.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C25258a.b.m130729y0(C25258a.this, contactProfile, view);
                    }
                });
                Button button2 = this.f121150K;
                final C25258a c25258a2 = this.f121153N;
                button2.setTrackingExtraData(c0708i);
                button2.setOnClickListener(new View.OnClickListener() { // from class: qg.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C25258a.b.m130730z0(C25258a.this, contactProfile, view);
                    }
                });
                final C25258a c25258a3 = this.f121153N;
                listItem.setOnClickListener(new View.OnClickListener() { // from class: qg.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C25258a.b.m130724t0(C25258a.this, contactProfile, view);
                    }
                });
                Avatar avatar = this.f121151L;
                final C25258a c25258a4 = this.f121153N;
                avatar.setTrackingExtraData(c0708i);
                avatar.setOnClickListener(new View.OnClickListener() { // from class: qg.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C25258a.b.m130725u0(C25258a.this, contactProfile, view);
                    }
                });
            } else {
                if (listItem.getCheckbox().isChecked() != this.f121153N.f121141t.containsKey(contactProfile.f42434r)) {
                    listItem.getCheckbox().setChecked(this.f121153N.f121141t.containsKey(contactProfile.f42434r));
                }
                CheckBox checkbox = listItem.getCheckbox();
                final C25258a c25258a5 = this.f121153N;
                checkbox.setOnClickListener(new View.OnClickListener() { // from class: qg.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C25258a.b.m130726v0(ListItem.this, c25258a5, contactProfile, view);
                    }
                });
                listItem.setOnClickListener(new View.OnClickListener() { // from class: qg.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C25258a.b.m130727w0(ListItem.this, view);
                    }
                });
                Avatar avatar2 = this.f121151L;
                avatar2.setTrackingExtraData(c0708i);
                avatar2.setOnClickListener(new View.OnClickListener() { // from class: qg.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C25258a.b.m130728x0(ListItem.this, view);
                    }
                });
            }
            if (AbstractC19074t.m100204b("ChangeEditMode", obj) || obj == null) {
                CheckBox checkbox2 = listItem.getCheckbox();
                if (this.f121153N.f121142u) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                checkbox2.setVisibility(i12);
                if (!this.f121153N.f121142u) {
                    listItem.setTrailingItemVisibility(0);
                } else {
                    listItem.setTrailingItemVisibility(8);
                }
            }
            if (AbstractC19074t.m100204b("ChangeEditModeRunAnimation", obj)) {
                C26244d.f124646a.m134938g(listItem, this.f121153N.f121142u);
            }
        }

        /* renamed from: s0 */
        static /* synthetic */ void m130723s0(b bVar, ListItem listItem, ContactProfile contactProfile, int i11, Object obj, int i12, Object obj2) {
            if ((i12 & 4) != 0) {
                obj = null;
            }
            bVar.m130722r0(listItem, contactProfile, i11, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t0 */
        public static final void m130724t0(C25258a c25258a, ContactProfile contactProfile, View view) {
            AbstractC19074t.m100208f(c25258a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$item");
            InterfaceC18505l m130698W = c25258a.m130698W();
            if (m130698W != null) {
                m130698W.mo205i9(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u0 */
        public static final void m130725u0(C25258a c25258a, ContactProfile contactProfile, View view) {
            AbstractC19074t.m100208f(c25258a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$item");
            InterfaceC18505l m130698W = c25258a.m130698W();
            if (m130698W != null) {
                m130698W.mo205i9(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v0 */
        public static final void m130726v0(ListItem listItem, C25258a c25258a, ContactProfile contactProfile, View view) {
            AbstractC19074t.m100208f(listItem, "$this_toggleMultiSelect");
            AbstractC19074t.m100208f(c25258a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$item");
            if (listItem.getCheckbox().isChecked()) {
                HashMap hashMap = c25258a.f121141t;
                String str = contactProfile.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                hashMap.put(str, contactProfile);
            } else {
                c25258a.f121141t.remove(contactProfile.f42434r);
            }
            InterfaceC18494a m130697V = c25258a.m130697V();
            if (m130697V != null) {
                m130697V.mo12V4();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w0 */
        public static final void m130727w0(ListItem listItem, View view) {
            AbstractC19074t.m100208f(listItem, "$this_toggleMultiSelect");
            listItem.getCheckbox().performClick();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x0 */
        public static final void m130728x0(ListItem listItem, View view) {
            AbstractC19074t.m100208f(listItem, "$this_toggleMultiSelect");
            listItem.getCheckbox().performClick();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y0 */
        public static final void m130729y0(C25258a c25258a, ContactProfile contactProfile, View view) {
            AbstractC19074t.m100208f(c25258a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$item");
            InterfaceC18505l m130700Y = c25258a.m130700Y();
            if (m130700Y != null) {
                m130700Y.mo205i9(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z0 */
        public static final void m130730z0(C25258a c25258a, ContactProfile contactProfile, View view) {
            AbstractC19074t.m100208f(c25258a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$item");
            InterfaceC18505l m130699X = c25258a.m130699X();
            if (m130699X != null) {
                m130699X.mo205i9(contactProfile);
            }
        }

        /* renamed from: p0 */
        public final void m130731p0(ContactProfile contactProfile, int i11, Object obj) {
            AbstractC19074t.m100208f(contactProfile, "item");
            ListItem listItem = this.f121148I;
            if (obj == null) {
                m130723s0(this, listItem, contactProfile, i11, null, 4, null);
                m130721q0(listItem, contactProfile);
            }
            if (AbstractC19074t.m100204b(obj, "ChangeEditModeRunAnimation") || AbstractC19074t.m100204b(obj, "ChangeEditMode")) {
                m130722r0(listItem, contactProfile, i11, obj);
            }
        }
    }

    public C25258a() {
        super(new a());
        this.f121141t = new HashMap();
    }

    /* renamed from: S */
    public final void m130694S() {
        this.f121141t.clear();
    }

    /* renamed from: T */
    public final void m130695T(boolean z11) {
        this.f121142u = z11;
        m130706e0(false, false);
        m10014v(0, mo10003k(), "ChangeEditModeRunAnimation");
    }

    /* renamed from: U */
    public final List m130696U() {
        List m131185M0;
        List m10632L = m10632L();
        AbstractC19074t.m100207e(m10632L, "getCurrentList(...)");
        m131185M0 = AbstractC25332a0.m131185M0(m10632L);
        return m131185M0;
    }

    /* renamed from: V */
    public final InterfaceC18494a m130697V() {
        return this.f121144w;
    }

    /* renamed from: W */
    public final InterfaceC18505l m130698W() {
        return this.f121147z;
    }

    /* renamed from: X */
    public final InterfaceC18505l m130699X() {
        return this.f121146y;
    }

    /* renamed from: Y */
    public final InterfaceC18505l m130700Y() {
        return this.f121145x;
    }

    /* renamed from: Z */
    public final List m130701Z() {
        List m131185M0;
        Collection values = this.f121141t.values();
        AbstractC19074t.m100207e(values, "<get-values>(...)");
        m131185M0 = AbstractC25332a0.m131185M0(values);
        return m131185M0;
    }

    /* renamed from: a0 */
    public final boolean m130702a0() {
        if (this.f121141t.size() == m10632L().size()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        Object m10633M = m10633M(i11);
        AbstractC19074t.m100207e(m10633M, "getItem(...)");
        bVar.m130731p0((ContactProfile) m10633M, i11, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo9991B(b bVar, int i11, List list) {
        AbstractC19074t.m100208f(bVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (!list.isEmpty()) {
            for (Object obj : list) {
                Object m10633M = m10633M(i11);
                AbstractC19074t.m100207e(m10633M, "getItem(...)");
                bVar.m130731p0((ContactProfile) m10633M, i11, obj);
            }
            return;
        }
        super.mo9991B(bVar, i11, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        return new b(this, new ListItem(context));
    }

    /* renamed from: e0 */
    public final void m130706e0(boolean z11, boolean z12) {
        this.f121143v = z11;
        this.f121141t.clear();
        if (this.f121143v) {
            List<ContactProfile> m10632L = m10632L();
            AbstractC19074t.m100207e(m10632L, "getCurrentList(...)");
            for (ContactProfile contactProfile : m10632L) {
                HashMap hashMap = this.f121141t;
                String str = contactProfile.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                AbstractC19074t.m100205c(contactProfile);
                hashMap.put(str, contactProfile);
            }
        }
        if (z12) {
            m10014v(0, mo10003k(), "ChangeEditMode");
        }
    }

    /* renamed from: f0 */
    public final void m130707f0(List list) {
        List m131185M0;
        AbstractC19074t.m100208f(list, "lst");
        m131185M0 = AbstractC25332a0.m131185M0(list);
        m10635O(m131185M0);
    }

    /* renamed from: g0 */
    public final void m130708g0(InterfaceC18494a interfaceC18494a) {
        this.f121144w = interfaceC18494a;
    }

    /* renamed from: h0 */
    public final void m130709h0(InterfaceC18505l interfaceC18505l) {
        this.f121147z = interfaceC18505l;
    }

    /* renamed from: i0 */
    public final void m130710i0(InterfaceC18505l interfaceC18505l) {
        this.f121146y = interfaceC18505l;
    }

    /* renamed from: j0 */
    public final void m130711j0(InterfaceC18505l interfaceC18505l) {
        this.f121145x = interfaceC18505l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }
}
