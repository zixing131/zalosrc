package w60;

import am.AbstractC0924m0;
import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.C2343e;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7064f6;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.uicontrol.C16640q2;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23212s8;
import me0.C23278z2;
import p133ek.AbstractC18458a;
import p142ey.C18644n;
import p227i3.C20215s;
import p304ks.C21933s;
import p348mi.C23302b;
import p354n3.C23528a;
import p716zh.C31874cb;
import r30.AbstractC25636f;
import y60.C30802d;

/* renamed from: w60.i */
/* loaded from: classes5.dex */
public class C28786i {

    /* renamed from: A */
    View f133393A;

    /* renamed from: B */
    RobotoTextView f133394B;

    /* renamed from: C */
    C31874cb f133395C;

    /* renamed from: D */
    boolean f133396D = false;

    /* renamed from: E */
    int f133397E;

    /* renamed from: a */
    View f133398a;

    /* renamed from: b */
    View f133399b;

    /* renamed from: c */
    View f133400c;

    /* renamed from: d */
    View f133401d;

    /* renamed from: e */
    View f133402e;

    /* renamed from: f */
    View f133403f;

    /* renamed from: g */
    AvatarImageView[] f133404g;

    /* renamed from: h */
    AvatarImageView f133405h;

    /* renamed from: i */
    RobotoTextView f133406i;

    /* renamed from: j */
    RobotoTextView f133407j;

    /* renamed from: k */
    RobotoTextView f133408k;

    /* renamed from: l */
    RobotoTextView f133409l;

    /* renamed from: m */
    View f133410m;

    /* renamed from: n */
    View f133411n;

    /* renamed from: o */
    C23528a f133412o;

    /* renamed from: p */
    private a f133413p;

    /* renamed from: q */
    RobotoTextView f133414q;

    /* renamed from: r */
    View f133415r;

    /* renamed from: s */
    RobotoTextView f133416s;

    /* renamed from: t */
    View f133417t;

    /* renamed from: u */
    RobotoTextView f133418u;

    /* renamed from: v */
    RobotoTextView f133419v;

    /* renamed from: w */
    RobotoTextView f133420w;

    /* renamed from: x */
    View f133421x;

    /* renamed from: y */
    RecyclerView f133422y;

    /* renamed from: z */
    View f133423z;

    /* renamed from: w60.i$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo87066a(C31874cb c31874cb, boolean z11, boolean z12);

        /* renamed from: b */
        void mo87067b(C31874cb c31874cb, boolean z11, boolean z12);

        /* renamed from: c */
        void mo87068c();

        /* renamed from: d */
        void mo87069d(C31874cb c31874cb, boolean z11, boolean z12);

        /* renamed from: e */
        void mo87070e(C31874cb c31874cb, boolean z11, boolean z12);

        /* renamed from: f */
        void mo87071f();

        /* renamed from: g */
        void mo87072g(C31874cb c31874cb, boolean z11, boolean z12);
    }

    public C28786i(ViewGroup viewGroup, C23528a c23528a) {
        this.f133398a = viewGroup;
        this.f133412o = c23528a;
        if (viewGroup != null) {
            try {
                if (ZaloListView.m86975fN()) {
                    LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.request_friend_tab_contact_view, viewGroup, true);
                } else {
                    LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.header_suggest_friends_request_new_view, viewGroup, true);
                }
                m144011i();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m144002k(View view) {
        a aVar = this.f133413p;
        if (aVar != null) {
            aVar.mo87071f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m144003l(View view) {
        if (this.f133413p != null) {
            if (ZaloListView.m86975fN()) {
                this.f133413p.mo87068c();
            } else {
                this.f133413p.mo87071f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m144004m(View view) {
        C31874cb c31874cb;
        a aVar = this.f133413p;
        if (aVar != null && (c31874cb = this.f133395C) != null) {
            aVar.mo87072g(c31874cb, true, C21933s.m114404I().m114486q0(this.f133395C.f146385a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m144005n(View view) {
        this.f133396D = true;
        C31874cb c31874cb = this.f133395C;
        if (c31874cb != null) {
            m144019y(c31874cb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m144006o(View view) {
        a aVar = this.f133413p;
        if (aVar != null) {
            aVar.mo87071f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m144007p(View view) {
        C31874cb c31874cb;
        a aVar = this.f133413p;
        if (aVar != null && (c31874cb = this.f133395C) != null) {
            aVar.mo87070e(c31874cb, true, C21933s.m114404I().m114486q0(this.f133395C.f146385a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m144008q(View view) {
        C31874cb c31874cb;
        a aVar = this.f133413p;
        if (aVar != null && (c31874cb = this.f133395C) != null) {
            aVar.mo87066a(c31874cb, true, C21933s.m114404I().m114486q0(this.f133395C.f146385a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m144009r(View view) {
        C31874cb c31874cb;
        a aVar = this.f133413p;
        if (aVar != null && (c31874cb = this.f133395C) != null) {
            aVar.mo87069d(c31874cb, true, C21933s.m114404I().m114486q0(this.f133395C.f146385a));
        }
    }

    /* renamed from: A */
    public void m144010A() {
        this.f133419v.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_section_friend_request_title));
    }

    /* renamed from: i */
    protected void m144011i() {
        float f11;
        Context context = this.f133398a.getContext();
        this.f133399b = this.f133398a.findViewById(AbstractC6918a0.layout_header_request_friend);
        this.f133400c = this.f133398a.findViewById(AbstractC6918a0.ll_friend_request_single);
        this.f133401d = this.f133398a.findViewById(AbstractC6918a0.ll_friend_request_single_item);
        this.f133419v = (RobotoTextView) this.f133398a.findViewById(AbstractC6918a0.tvFriendRequest);
        this.f133406i = (RobotoTextView) this.f133398a.findViewById(AbstractC6918a0.tvLayoutfriendsuggestTitleCenter);
        this.f133407j = (RobotoTextView) this.f133398a.findViewById(AbstractC6918a0.tvLayoutfriendsuggestMsgCenter);
        this.f133408k = (RobotoTextView) this.f133398a.findViewById(AbstractC6918a0.numnotification_layoutfriendsuggest);
        this.f133405h = (AvatarImageView) this.f133398a.findViewById(AbstractC6918a0.img_avt_suggest1);
        this.f133414q = (RobotoTextView) this.f133398a.findViewById(AbstractC6918a0.tvMessage);
        this.f133415r = this.f133398a.findViewById(AbstractC6918a0.invitation_container);
        this.f133416s = (RobotoTextView) this.f133398a.findViewById(AbstractC6918a0.hint_title);
        this.f133417t = this.f133398a.findViewById(AbstractC6918a0.view_see_more);
        this.f133418u = (RobotoTextView) this.f133398a.findViewById(AbstractC6918a0.seemore);
        this.f133420w = (RobotoTextView) this.f133398a.findViewById(AbstractC6918a0.btn_accept_friend_request);
        this.f133421x = this.f133398a.findViewById(AbstractC6918a0.btn_delete_suggest);
        this.f133410m = this.f133398a.findViewById(AbstractC6918a0.bottom_line_request_friend);
        this.f133422y = (RecyclerView) this.f133398a.findViewById(AbstractC6918a0.recycle_view_multi);
        C30802d c30802d = new C30802d(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(0.5f), C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        c30802d.m149869b(C23212s8.m119607o(context, AbstractC16781w.PopupBackgroundColor));
        c30802d.m149868a(true);
        AbstractC23136l9.m118696b1(this.f133415r, c30802d);
        int m118722k0 = AbstractC23136l9.m118722k0();
        if (ZaloListView.m86975fN()) {
            f11 = 44.0f;
        } else {
            f11 = 28.0f;
        }
        this.f133397E = m118722k0 - (AbstractC23136l9.m118742r(f11) * 2);
        if (ZaloListView.m86975fN()) {
            this.f133394B = (RobotoTextView) this.f133398a.findViewById(AbstractC6918a0.tvBALabel);
            this.f133402e = this.f133398a.findViewById(AbstractC6918a0.ll_layout_see_all);
            this.f133403f = this.f133398a.findViewById(AbstractC6918a0.layout_mini_avatar);
            this.f133409l = (RobotoTextView) this.f133398a.findViewById(AbstractC6918a0.tv_count_see_more);
            this.f133423z = this.f133398a.findViewById(AbstractC6918a0.tvDecline);
            this.f133393A = this.f133398a.findViewById(AbstractC6918a0.layout_button);
            AvatarImageView[] avatarImageViewArr = new AvatarImageView[3];
            this.f133404g = avatarImageViewArr;
            int i11 = 0;
            avatarImageViewArr[0] = (AvatarImageView) this.f133398a.findViewById(AbstractC6918a0.img_avt_1);
            this.f133404g[1] = (AvatarImageView) this.f133398a.findViewById(AbstractC6918a0.img_avt_2);
            this.f133404g[2] = (AvatarImageView) this.f133398a.findViewById(AbstractC6918a0.img_avt_3);
            while (true) {
                AvatarImageView[] avatarImageViewArr2 = this.f133404g;
                if (i11 >= avatarImageViewArr2.length) {
                    break;
                }
                avatarImageViewArr2[i11].setDrawStroke(true);
                this.f133404g[i11].setStrokeWidth(AbstractC23136l9.m118742r(2.0f));
                this.f133404g[i11].setStrokeCircle(true);
                this.f133404g[i11].setStrokeColor(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
                i11++;
            }
            this.f133403f.setVisibility(8);
            this.f133402e.setOnClickListener(new View.OnClickListener() { // from class: w60.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C28786i.this.m144002k(view);
                }
            });
        }
        this.f133418u.setOnClickListener(new View.OnClickListener() { // from class: w60.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C28786i.this.m144003l(view);
            }
        });
        this.f133421x.setOnClickListener(new View.OnClickListener() { // from class: w60.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C28786i.this.m144004m(view);
            }
        });
        this.f133417t.setOnClickListener(new View.OnClickListener() { // from class: w60.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C28786i.this.m144005n(view);
            }
        });
        m144010A();
    }

    /* renamed from: j */
    public View m144012j() {
        return this.f133398a;
    }

    /* renamed from: s */
    protected void m144013s(C31874cb c31874cb, AvatarImageView avatarImageView) {
        if (c31874cb == null) {
            return;
        }
        if (!TextUtils.isEmpty(c31874cb.f146393i) && !C23302b.f113247a.m120523d(c31874cb.f146393i)) {
            ((C23528a) this.f133412o.m123612r(avatarImageView)).m123618x(c31874cb.f146393i, C23278z2.m120143n());
        } else {
            int m12307a = C2343e.m12307a(c31874cb.f146385a, false);
            ((C23528a) this.f133412o.m123612r(avatarImageView)).m123615u(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(c31874cb.m153180d(true, false)), m12307a));
        }
        avatarImageView.setVisibility(0);
    }

    /* renamed from: t */
    public void m144014t(a aVar) {
        this.f133413p = aVar;
    }

    /* renamed from: u */
    public void m144015u(boolean z11) {
        int i11;
        View view = this.f133398a;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    /* renamed from: v */
    public void m144016v(boolean z11) {
        int i11;
        View view = this.f133411n;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    /* renamed from: w */
    protected void m144017w() {
        if (ZaloListView.m86975fN()) {
            this.f133399b.setVisibility(8);
            this.f133400c.setVisibility(8);
            this.f133422y.setVisibility(8);
            View view = this.f133423z;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f133402e;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f133403f;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            RobotoTextView robotoTextView = this.f133409l;
            if (robotoTextView != null) {
                robotoTextView.setVisibility(8);
            }
            this.f133410m.setVisibility(8);
            return;
        }
        this.f133400c.setOnClickListener(new View.OnClickListener() { // from class: w60.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                C28786i.this.m144006o(view4);
            }
        });
        View view4 = this.f133402e;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        this.f133422y.setVisibility(8);
        this.f133400c.setVisibility(0);
        this.f133410m.setVisibility(8);
        this.f133399b.setVisibility(8);
        this.f133405h.setVisibility(0);
        this.f133406i.setVisibility(0);
        this.f133407j.setVisibility(8);
        this.f133408k.setVisibility(8);
        this.f133420w.setVisibility(8);
        this.f133421x.setVisibility(8);
        this.f133415r.setVisibility(8);
        this.f133406i.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_section_friend_request_title));
        ((C23528a) this.f133412o.m123612r(this.f133405h)).m123613s(AbstractC16803z.icn_contact_friend_request_2);
    }

    /* renamed from: x */
    protected void m144018x(List list) {
        int i11;
        int i12;
        if (ZaloListView.m86975fN() && !AbstractC0924m0.m3046F9()) {
            this.f133400c.setVisibility(8);
            this.f133422y.setVisibility(8);
            View view = this.f133410m;
            if (ZaloListView.m86975fN()) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            view.setVisibility(i12);
            View view2 = this.f133402e;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f133403f;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            this.f133399b.setVisibility(8);
            int size = list.size();
            int min = Math.min(size, this.f133404g.length);
            for (int i13 = 0; i13 < min; i13++) {
                this.f133404g[i13].setVisibility(0);
                m144013s((C31874cb) list.get(i13), this.f133404g[i13]);
            }
            if (min < this.f133404g.length) {
                while (true) {
                    AvatarImageView[] avatarImageViewArr = this.f133404g;
                    if (min >= avatarImageViewArr.length) {
                        break;
                    }
                    avatarImageViewArr[min].setVisibility(8);
                    min++;
                }
            }
            RobotoTextView robotoTextView = this.f133409l;
            if (robotoTextView != null) {
                if (size > 3) {
                    robotoTextView.setVisibility(0);
                    this.f133409l.setText(String.format("+%d", Integer.valueOf(size - 3)));
                    return;
                } else {
                    robotoTextView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        this.f133400c.setVisibility(8);
        this.f133422y.setVisibility(0);
        View view4 = this.f133410m;
        if (ZaloListView.m86975fN()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        view4.setVisibility(i11);
        this.f133399b.setVisibility(0);
        if (this.f133402e != null && ZaloListView.m86975fN()) {
            this.f133402e.setVisibility(0);
        }
        View view5 = this.f133403f;
        if (view5 != null) {
            view5.setVisibility(8);
        }
        if (ZaloListView.m86975fN()) {
            this.f133418u.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_all));
        }
        if (ZaloListView.m86975fN()) {
            if (!"vi".equals(AbstractC18458a.f93019a) && list.size() > 1) {
                this.f133416s.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_count_friend_request_tab_contact) + C20215s.f99966b, Integer.valueOf(list.size())));
            } else {
                this.f133416s.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_count_friend_request_tab_contact, Integer.valueOf(list.size())));
            }
        } else {
            this.f133416s.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_section_friend_request_title));
        }
        if (this.f133422y.getAdapter() == null) {
            RecyclerView recyclerView = this.f133422y;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            C7064f6 c7064f6 = new C7064f6(new C23528a(this.f133422y.getContext()), this.f133413p);
            c7064f6.m36071O(list);
            this.f133422y.setAdapter(c7064f6);
            return;
        }
        C7064f6 c7064f62 = (C7064f6) this.f133422y.getAdapter();
        c7064f62.m36071O(list);
        c7064f62.m10008p();
    }

    /* renamed from: y */
    protected void m144019y(C31874cb c31874cb) {
        int i11;
        int i12;
        String m118339r;
        String format;
        this.f133395C = c31874cb;
        this.f133400c.setOnClickListener(new View.OnClickListener() { // from class: w60.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C28786i.this.m144007p(view);
            }
        });
        this.f133422y.setVisibility(8);
        this.f133400c.setVisibility(0);
        View view = this.f133410m;
        if (ZaloListView.m86975fN()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
        View view2 = this.f133402e;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.f133403f;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        if (ZaloListView.m86975fN()) {
            this.f133418u.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide));
        }
        if (this.f133394B != null) {
            ContactProfile m118353e = AbstractC23063f2.m118353e(c31874cb.f146385a);
            if (m118353e != null) {
                c31874cb.f146402r = m118353e.f42361N0;
                c31874cb.f146403s = m118353e.f42364O0;
            }
            String m153181e = c31874cb.m153181e();
            if (TextUtils.isEmpty(m153181e)) {
                this.f133394B.setVisibility(8);
            } else {
                this.f133394B.setText(m153181e);
                this.f133394B.setVisibility(0);
            }
        }
        this.f133406i.setText(c31874cb.m153180d(true, false));
        this.f133406i.setVisibility(0);
        RobotoTextView robotoTextView = this.f133408k;
        if (!ZaloListView.m86975fN() && C21933s.m114404I().m114486q0(c31874cb.f146385a)) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        robotoTextView.setVisibility(i12);
        this.f133420w.setVisibility(0);
        this.f133421x.setVisibility(0);
        this.f133399b.setVisibility(0);
        m144013s(c31874cb, this.f133405h);
        if (ZaloListView.m86975fN()) {
            this.f133416s.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_count_friend_request_tab_contact, 1));
        } else {
            this.f133416s.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_section_friend_request_title));
        }
        if (!TextUtils.isEmpty(c31874cb.f146397m)) {
            m118339r = c31874cb.f146397m;
        } else {
            m118339r = AbstractC23059e9.m118339r(c31874cb.f146399o, c31874cb.f146389e, c31874cb.f146394j);
        }
        String str = "";
        if (ZaloListView.m86975fN()) {
            long j11 = c31874cb.f146398n;
            if (j11 > 0) {
                if (j11 < 100000000000L) {
                    j11 *= 1000;
                }
                str = AbstractC23160o0.m119270m0(j11);
            }
            if (!TextUtils.isEmpty(m118339r) && !TextUtils.isEmpty(str)) {
                m118339r = String.format("%s • %s", str, m118339r);
            } else if (TextUtils.isEmpty(m118339r)) {
                m118339r = str;
            }
        }
        if (AbstractC25636f.m132484n(c31874cb.f146385a)) {
            this.f133415r.setVisibility(8);
            if (C18644n.m98531l().m98558u(c31874cb.f146385a)) {
                this.f133420w.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg));
                this.f133421x.setVisibility(8);
                View view4 = this.f133423z;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
                this.f133420w.setVisibility(0);
                View view5 = this.f133393A;
                if (view5 != null) {
                    view5.setVisibility(0);
                }
                if (TextUtils.isEmpty(str)) {
                    format = AbstractC23136l9.m118743r0(AbstractC8020f0.str_accept_friend_done);
                } else {
                    format = String.format("%s • %s", str, AbstractC23136l9.m118743r0(AbstractC8020f0.str_accept_friend_done));
                }
                m118339r = format;
                this.f133420w.setOnClickListener(new View.OnClickListener() { // from class: w60.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        C28786i.this.m144008q(view6);
                    }
                });
            } else {
                View view6 = this.f133393A;
                if (view6 != null) {
                    view6.setVisibility(8);
                }
                View view7 = this.f133423z;
                if (view7 != null) {
                    view7.setVisibility(0);
                }
            }
        } else {
            View view8 = this.f133393A;
            if (view8 != null) {
                view8.setVisibility(0);
            }
            this.f133420w.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_accept_friend_request));
            this.f133420w.setVisibility(0);
            this.f133421x.setVisibility(0);
            View view9 = this.f133423z;
            if (view9 != null) {
                view9.setVisibility(8);
            }
            this.f133420w.setOnClickListener(new View.OnClickListener() { // from class: w60.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view10) {
                    C28786i.this.m144009r(view10);
                }
            });
            if (TextUtils.isEmpty(c31874cb.f146396l)) {
                this.f133415r.setVisibility(8);
            } else {
                this.f133414q.setText(c31874cb.f146396l);
                this.f133415r.setVisibility(0);
                if (this.f133396D) {
                    this.f133417t.setVisibility(8);
                    this.f133414q.setMaxLines(4);
                } else {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more);
                    StaticLayout staticLayout = new StaticLayout(c31874cb.f146396l, this.f133414q.getPaint(), this.f133397E, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    int i13 = 0;
                    while (staticLayout.getLineCount() > 2) {
                        if (i13 > 0) {
                            i13--;
                        } else {
                            i13 = staticLayout.getLineEnd(1) - m118743r0.length();
                        }
                        staticLayout = new StaticLayout(String.format("%s... %s", c31874cb.f146396l.substring(0, i13), m118743r0), this.f133414q.getPaint(), this.f133397E, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    if (i13 > 0) {
                        this.f133414q.setText(c31874cb.f146396l.substring(0, i13) + "...");
                        this.f133417t.setVisibility(0);
                    } else {
                        this.f133417t.setVisibility(8);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(m118339r)) {
            this.f133407j.setText(m118339r);
            this.f133407j.setVisibility(0);
        } else {
            this.f133407j.setVisibility(8);
        }
    }

    /* renamed from: z */
    public void m144020z(List list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1 && (!ZaloListView.m86975fN() || AbstractC0924m0.m3046F9())) {
                C31874cb c31874cb = (C31874cb) list.get(0);
                if (c31874cb != null) {
                    m144019y(c31874cb);
                    return;
                } else {
                    m144017w();
                    return;
                }
            }
            m144018x(list);
            return;
        }
        m144017w();
    }
}
