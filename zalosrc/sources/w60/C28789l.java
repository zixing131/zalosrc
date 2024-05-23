package w60;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import au.C2343e;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.uicontrol.C16640q2;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;
import p716zh.C31874cb;

/* renamed from: w60.l */
/* loaded from: classes5.dex */
public class C28789l {

    /* renamed from: a */
    View f133426a;

    /* renamed from: b */
    View f133427b;

    /* renamed from: c */
    View f133428c;

    /* renamed from: d */
    View f133429d;

    /* renamed from: e */
    AvatarImageView[] f133430e = new AvatarImageView[4];

    /* renamed from: f */
    RobotoTextView f133431f;

    /* renamed from: g */
    RobotoTextView f133432g;

    /* renamed from: h */
    RobotoTextView f133433h;

    /* renamed from: i */
    RobotoTextView f133434i;

    /* renamed from: j */
    View f133435j;

    /* renamed from: k */
    C23528a f133436k;

    /* renamed from: l */
    private a f133437l;

    /* renamed from: w60.l$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: Gw */
        void mo87016Gw(int i11);
    }

    public C28789l(ViewGroup viewGroup, C23528a c23528a) {
        this.f133426a = viewGroup;
        this.f133436k = c23528a;
        if (ZaloListView.m86975fN()) {
            LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.row_suggest_friends_view, viewGroup, true);
        } else {
            LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.header_suggest_friends_view, viewGroup, true);
        }
        m144025c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m144023f(View view) {
        a aVar = this.f133437l;
        if (aVar != null) {
            aVar.mo87016Gw(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m144024g(View view) {
        a aVar = this.f133437l;
        if (aVar != null) {
            aVar.mo87016Gw(2);
        }
    }

    /* renamed from: c */
    protected void m144025c() {
        int i11 = 0;
        if (ZaloListView.m86975fN()) {
            AvatarImageView[] avatarImageViewArr = new AvatarImageView[3];
            this.f133430e = avatarImageViewArr;
            avatarImageViewArr[0] = (AvatarImageView) this.f133426a.findViewById(AbstractC6918a0.img_avt_1);
            this.f133430e[1] = (AvatarImageView) this.f133426a.findViewById(AbstractC6918a0.img_avt_2);
            this.f133430e[2] = (AvatarImageView) this.f133426a.findViewById(AbstractC6918a0.img_avt_3);
            this.f133434i = (RobotoTextView) this.f133426a.findViewById(AbstractC6918a0.tv_count_see_more);
            View findViewById = this.f133426a.findViewById(AbstractC6918a0.layout_mini_avatar);
            this.f133429d = findViewById;
            findViewById.setVisibility(8);
            while (true) {
                AvatarImageView[] avatarImageViewArr2 = this.f133430e;
                if (i11 < avatarImageViewArr2.length) {
                    avatarImageViewArr2[i11].setDrawStroke(true);
                    this.f133430e[i11].setStrokeWidth(AbstractC23136l9.m118742r(2.0f));
                    this.f133430e[i11].setStrokeCircle(true);
                    this.f133430e[i11].setStrokeColor(C23212s8.m119607o(this.f133426a.getContext(), AbstractC16781w.PrimaryBackgroundColor));
                    i11++;
                } else {
                    this.f133426a.setOnClickListener(new View.OnClickListener() { // from class: w60.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C28789l.this.m144023f(view);
                        }
                    });
                    return;
                }
            }
        } else {
            this.f133427b = this.f133426a.findViewById(AbstractC6918a0.layoutFriendSuggest);
            this.f133428c = this.f133426a.findViewById(AbstractC6918a0.fLayoutfriendsuggest);
            this.f133431f = (RobotoTextView) this.f133426a.findViewById(AbstractC6918a0.tvLayoutfriendsuggestTitleCenter);
            this.f133432g = (RobotoTextView) this.f133426a.findViewById(AbstractC6918a0.tvLayoutfriendsuggestMsgCenter);
            this.f133433h = (RobotoTextView) this.f133426a.findViewById(AbstractC6918a0.numnotification_layoutfriendsuggest);
            this.f133435j = this.f133426a.findViewById(AbstractC6918a0.icon_next);
            this.f133430e[0] = (AvatarImageView) this.f133426a.findViewById(AbstractC6918a0.img_avt_suggest1);
            this.f133430e[1] = (AvatarImageView) this.f133426a.findViewById(AbstractC6918a0.img_avt_suggest2);
            this.f133430e[2] = (AvatarImageView) this.f133426a.findViewById(AbstractC6918a0.img_avt_suggest3);
            this.f133430e[3] = (AvatarImageView) this.f133426a.findViewById(AbstractC6918a0.img_avt_suggest4);
            this.f133428c.setOnClickListener(new View.OnClickListener() { // from class: w60.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C28789l.this.m144024g(view);
                }
            });
        }
    }

    /* renamed from: d */
    public RobotoTextView m144026d() {
        return this.f133433h;
    }

    /* renamed from: e */
    public View m144027e() {
        return this.f133426a;
    }

    /* renamed from: h */
    protected void m144028h(C31874cb c31874cb, AvatarImageView avatarImageView) {
        if (c31874cb == null) {
            return;
        }
        if (!TextUtils.isEmpty(c31874cb.f146393i) && !C23302b.f113247a.m120523d(c31874cb.f146393i)) {
            ((C23528a) this.f133436k.m123612r(avatarImageView)).m123618x(c31874cb.f146393i, C23278z2.m120143n());
        } else {
            int m12307a = C2343e.m12307a(c31874cb.f146385a, false);
            ((C23528a) this.f133436k.m123612r(avatarImageView)).m123615u(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(c31874cb.m153180d(true, false)), m12307a));
        }
        avatarImageView.setVisibility(0);
    }

    /* renamed from: i */
    public void m144029i(a aVar) {
        this.f133437l = aVar;
    }

    /* renamed from: j */
    public void m144030j(boolean z11) {
        int i11;
        View view = this.f133426a;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    /* renamed from: k */
    protected void m144031k() {
        if (ZaloListView.m86975fN()) {
            View view = this.f133429d;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        this.f133427b.setVisibility(8);
        this.f133430e[0].setVisibility(0);
        int i11 = 1;
        while (true) {
            AvatarImageView[] avatarImageViewArr = this.f133430e;
            if (i11 < avatarImageViewArr.length) {
                avatarImageViewArr[i11].setVisibility(8);
                i11++;
            } else {
                this.f133431f.setVisibility(0);
                this.f133432g.setVisibility(8);
                this.f133433h.setVisibility(8);
                ((C23528a) this.f133436k.m123612r(this.f133430e[0])).m123613s(AbstractC16803z.icn_friend_from_contacts);
                this.f133431f.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_native_list_entry_view_title));
                this.f133432g.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_des_contact_native_tab_contact));
                this.f133432g.setVisibility(0);
                return;
            }
        }
    }

    /* renamed from: l */
    protected void m144032l(List list) {
        int size = list.size();
        int min = Math.min(size, this.f133430e.length);
        int i11 = min - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            m144028h((C31874cb) list.get(i12), this.f133430e[i11 - i12]);
        }
        if (min < this.f133430e.length) {
            while (true) {
                AvatarImageView[] avatarImageViewArr = this.f133430e;
                if (min >= avatarImageViewArr.length) {
                    break;
                }
                avatarImageViewArr[min].setVisibility(8);
                min++;
            }
        }
        if (size > 5) {
            this.f133433h.setText("5+");
        } else {
            this.f133433h.setText(String.valueOf(size));
        }
        this.f133433h.setVisibility(0);
        this.f133427b.setVisibility(0);
        this.f133431f.setVisibility(8);
        this.f133432g.setVisibility(8);
    }

    /* renamed from: m */
    protected void m144033m(List list) {
        int size = list.size();
        int min = Math.min(size, this.f133430e.length);
        for (int i11 = 0; i11 < min; i11++) {
            m144028h((C31874cb) list.get((size - i11) - 1), this.f133430e[i11]);
        }
        if (min < this.f133430e.length) {
            while (true) {
                AvatarImageView[] avatarImageViewArr = this.f133430e;
                if (min >= avatarImageViewArr.length) {
                    break;
                }
                avatarImageViewArr[min].setVisibility(8);
                min++;
            }
        }
        RobotoTextView robotoTextView = this.f133434i;
        if (robotoTextView != null) {
            if (size > 3) {
                robotoTextView.setVisibility(0);
                this.f133434i.setText(String.format("+%d", Integer.valueOf(size - 3)));
            } else {
                robotoTextView.setVisibility(8);
            }
        }
        View view = this.f133429d;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: n */
    protected void m144034n(C31874cb c31874cb) {
        int i11 = 1;
        while (true) {
            AvatarImageView[] avatarImageViewArr = this.f133430e;
            if (i11 < avatarImageViewArr.length) {
                avatarImageViewArr[i11].setVisibility(8);
                i11++;
            } else {
                this.f133431f.setText(c31874cb.m153180d(true, false));
                this.f133431f.setVisibility(0);
                this.f133433h.setText("1");
                this.f133433h.setVisibility(0);
                this.f133427b.setVisibility(0);
                this.f133432g.setVisibility(8);
                m144028h(c31874cb, this.f133430e[0]);
                return;
            }
        }
    }

    /* renamed from: o */
    public void m144035o(List list) {
        if (list != null && !list.isEmpty()) {
            if (ZaloListView.m86975fN()) {
                m144033m(list);
                return;
            }
            if (list.size() == 1) {
                C31874cb c31874cb = (C31874cb) list.get(0);
                if (c31874cb != null) {
                    m144034n(c31874cb);
                    return;
                } else {
                    m144031k();
                    return;
                }
            }
            m144032l(list);
            return;
        }
        m144031k();
    }
}
