package com.zing.zalo.adapters;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7015b3;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import java.util.List;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p304ks.C21927m;
import p348mi.C23302b;
import p489rn.C25927x0;
import p716zh.C31874cb;
import qm0.AbstractC25332a0;
import t00.C26446c;

/* renamed from: com.zing.zalo.adapters.b3 */
/* loaded from: classes3.dex */
public final class C7015b3 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private C25927x0.a f38344r;

    /* renamed from: s */
    private final boolean f38345s;

    /* renamed from: t */
    private List f38346t;

    /* renamed from: u */
    private boolean f38347u;

    /* renamed from: com.zing.zalo.adapters.b3$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private GroupAvatarView f38348I;

        /* renamed from: J */
        private RobotoTextView f38349J;

        /* renamed from: K */
        private RobotoTextView f38350K;

        /* renamed from: L */
        private RobotoTextView f38351L;

        /* renamed from: M */
        private RobotoTextView f38352M;

        /* renamed from: N */
        private ImageButton f38353N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f38348I = (GroupAvatarView) view.findViewById(AbstractC6918a0.buddy_dp);
            this.f38349J = (RobotoTextView) view.findViewById(AbstractC6918a0.name);
            this.f38350K = (RobotoTextView) view.findViewById(AbstractC6918a0.tvInvitation);
            this.f38351L = (RobotoTextView) view.findViewById(AbstractC6918a0.tvInvitationDetail);
            this.f38352M = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_func);
            this.f38353N = (ImageButton) view.findViewById(AbstractC6918a0.btn_delete);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m0 */
        public static final void m35859m0(C25927x0.a aVar, C31874cb c31874cb, int i11, int i12, View view) {
            AbstractC19074t.m100208f(c31874cb, "$contact");
            if (aVar != null) {
                aVar.mo36956x2(c31874cb, i11, i12);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n0 */
        public static final void m35860n0(C25927x0.a aVar, C31874cb c31874cb, int i11, View view) {
            AbstractC19074t.m100208f(c31874cb, "$contact");
            if (aVar != null) {
                aVar.mo36956x2(c31874cb, 2, i11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o0 */
        public static final void m35861o0(C25927x0.a aVar, C31874cb c31874cb, int i11, View view) {
            AbstractC19074t.m100208f(c31874cb, "$contact");
            if (aVar != null) {
                aVar.mo36956x2(c31874cb, 3, i11);
            }
        }

        /* renamed from: l0 */
        public final void m35862l0(final int i11, final C31874cb c31874cb, boolean z11, final C25927x0.a aVar, boolean z12) {
            String obj;
            AbstractC19074t.m100208f(c31874cb, "contact");
            try {
                final int i12 = 6;
                int i13 = 4;
                if (c31874cb.f146400p == 3) {
                    RobotoTextView robotoTextView = this.f38351L;
                    AbstractC19074t.m100205c(robotoTextView);
                    if (!z12) {
                        i13 = 8;
                    }
                    robotoTextView.setVisibility(i13);
                    RobotoTextView robotoTextView2 = this.f38352M;
                    AbstractC19074t.m100205c(robotoTextView2);
                    robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg));
                    if (c31874cb.f146390f <= 0) {
                        if (c31874cb.f146399o == 2) {
                            RobotoTextView robotoTextView3 = this.f38350K;
                            AbstractC19074t.m100205c(robotoTextView3);
                            robotoTextView3.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_done_action_friend_request_new));
                        } else {
                            RobotoTextView robotoTextView4 = this.f38350K;
                            AbstractC19074t.m100205c(robotoTextView4);
                            robotoTextView4.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_done_action_friend_suggest_new));
                        }
                        RobotoTextView robotoTextView5 = this.f38350K;
                        AbstractC19074t.m100205c(robotoTextView5);
                        robotoTextView5.setVisibility(0);
                    } else {
                        String m118743r0 = !TextUtils.isEmpty(c31874cb.f146386b) ? c31874cb.f146386b : AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_followed);
                        if (!TextUtils.isEmpty(m118743r0)) {
                            RobotoTextView robotoTextView6 = this.f38350K;
                            AbstractC19074t.m100205c(robotoTextView6);
                            robotoTextView6.setText(m118743r0);
                            RobotoTextView robotoTextView7 = this.f38350K;
                            AbstractC19074t.m100205c(robotoTextView7);
                            robotoTextView7.setVisibility(0);
                        } else {
                            RobotoTextView robotoTextView8 = this.f38350K;
                            AbstractC19074t.m100205c(robotoTextView8);
                            robotoTextView8.setVisibility(8);
                        }
                    }
                    ImageButton imageButton = this.f38353N;
                    AbstractC19074t.m100205c(imageButton);
                    imageButton.setVisibility(c31874cb.f146407w == 1 ? 0 : 8);
                    RobotoTextView robotoTextView9 = this.f38352M;
                    AbstractC19074t.m100205c(robotoTextView9);
                    robotoTextView9.setVisibility(c31874cb.f146406v == 1 ? 0 : 8);
                } else if (c31874cb.f146390f > 0) {
                    RobotoTextView robotoTextView10 = this.f38352M;
                    AbstractC19074t.m100205c(robotoTextView10);
                    robotoTextView10.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_follow_page));
                    ImageButton imageButton2 = this.f38353N;
                    AbstractC19074t.m100205c(imageButton2);
                    imageButton2.setVisibility(c31874cb.f146407w == 1 ? 0 : 8);
                    if (C21927m.m114302u().m114357s().m153137g(c31874cb.f146385a)) {
                        RobotoTextView robotoTextView11 = this.f38352M;
                        AbstractC19074t.m100205c(robotoTextView11);
                        robotoTextView11.setVisibility(c31874cb.f146406v == 1 ? 0 : 8);
                        RobotoTextView robotoTextView12 = this.f38352M;
                        AbstractC19074t.m100205c(robotoTextView12);
                        robotoTextView12.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg));
                    } else {
                        RobotoTextView robotoTextView13 = this.f38352M;
                        AbstractC19074t.m100205c(robotoTextView13);
                        robotoTextView13.setVisibility(c31874cb.f146406v == 1 ? 0 : 8);
                        RobotoTextView robotoTextView14 = this.f38352M;
                        AbstractC19074t.m100205c(robotoTextView14);
                        robotoTextView14.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_follow_page));
                        i12 = 4;
                    }
                    String m118743r02 = !TextUtils.isEmpty(c31874cb.f146386b) ? c31874cb.f146386b : AbstractC23136l9.m118743r0(AbstractC8020f0.str_maybe_you_care);
                    if (!TextUtils.isEmpty(m118743r02)) {
                        RobotoTextView robotoTextView15 = this.f38350K;
                        AbstractC19074t.m100205c(robotoTextView15);
                        robotoTextView15.setText(m118743r02);
                        RobotoTextView robotoTextView16 = this.f38350K;
                        AbstractC19074t.m100205c(robotoTextView16);
                        robotoTextView16.setVisibility(0);
                    } else {
                        RobotoTextView robotoTextView17 = this.f38350K;
                        AbstractC19074t.m100205c(robotoTextView17);
                        robotoTextView17.setVisibility(8);
                    }
                    RobotoTextView robotoTextView18 = this.f38351L;
                    AbstractC19074t.m100205c(robotoTextView18);
                    if (!z12) {
                        i13 = 8;
                    }
                    robotoTextView18.setVisibility(i13);
                } else {
                    int i14 = c31874cb.f146399o;
                    if (i14 == 1) {
                        RobotoTextView robotoTextView19 = this.f38352M;
                        AbstractC19074t.m100205c(robotoTextView19);
                        robotoTextView19.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_add_friend_new));
                        RobotoTextView robotoTextView20 = this.f38352M;
                        AbstractC19074t.m100205c(robotoTextView20);
                        robotoTextView20.setVisibility(c31874cb.f146406v == 1 ? 0 : 8);
                        ImageButton imageButton3 = this.f38353N;
                        AbstractC19074t.m100205c(imageButton3);
                        imageButton3.setVisibility(c31874cb.f146407w == 1 ? 0 : 8);
                        if (!TextUtils.isEmpty(c31874cb.f146397m)) {
                            RobotoTextView robotoTextView21 = this.f38350K;
                            AbstractC19074t.m100205c(robotoTextView21);
                            robotoTextView21.setText(c31874cb.f146397m);
                            RobotoTextView robotoTextView22 = this.f38350K;
                            AbstractC19074t.m100205c(robotoTextView22);
                            robotoTextView22.setVisibility(0);
                        } else {
                            String m118339r = AbstractC23059e9.m118339r(c31874cb.f146399o, c31874cb.f146389e, c31874cb.f146394j);
                            if (!TextUtils.isEmpty(m118339r)) {
                                RobotoTextView robotoTextView23 = this.f38350K;
                                AbstractC19074t.m100205c(robotoTextView23);
                                robotoTextView23.setText(m118339r);
                                RobotoTextView robotoTextView24 = this.f38350K;
                                AbstractC19074t.m100205c(robotoTextView24);
                                robotoTextView24.setVisibility(0);
                            } else {
                                RobotoTextView robotoTextView25 = this.f38350K;
                                AbstractC19074t.m100205c(robotoTextView25);
                                robotoTextView25.setVisibility(8);
                            }
                        }
                        String str = c31874cb.f146396l;
                        if (TextUtils.isEmpty(str)) {
                            RobotoTextView robotoTextView26 = this.f38351L;
                            AbstractC19074t.m100205c(robotoTextView26);
                            robotoTextView26.setVisibility(z12 ? 4 : 8);
                        } else {
                            RobotoTextView robotoTextView27 = this.f38351L;
                            AbstractC19074t.m100205c(robotoTextView27);
                            robotoTextView27.setText(str);
                            RobotoTextView robotoTextView28 = this.f38351L;
                            AbstractC19074t.m100205c(robotoTextView28);
                            robotoTextView28.setVisibility(0);
                        }
                    } else if (i14 == 2) {
                        RobotoTextView robotoTextView29 = this.f38352M;
                        AbstractC19074t.m100205c(robotoTextView29);
                        robotoTextView29.setText(C26446c.m136326b().m136327a());
                        RobotoTextView robotoTextView30 = this.f38352M;
                        AbstractC19074t.m100205c(robotoTextView30);
                        robotoTextView30.setVisibility(c31874cb.f146406v == 1 ? 0 : 8);
                        ImageButton imageButton4 = this.f38353N;
                        AbstractC19074t.m100205c(imageButton4);
                        imageButton4.setVisibility(c31874cb.f146407w == 1 ? 0 : 8);
                        String str2 = c31874cb.f146396l;
                        if (!TextUtils.isEmpty(c31874cb.f146397m)) {
                            obj = c31874cb.f146397m;
                        } else {
                            int i15 = c31874cb.f146389e;
                            if (i15 != -1 && i15 != 30 && i15 != 10) {
                                obj = AbstractC23059e9.m118339r(c31874cb.f146399o, i15, c31874cb.f146394j);
                            }
                            String m118339r2 = AbstractC23059e9.m118339r(c31874cb.f146399o, i15, c31874cb.f146394j);
                            AbstractC19074t.m100207e(m118339r2, "getTypeRequestFromSourceInfo(...)");
                            int length = m118339r2.length() - 1;
                            int i16 = 0;
                            boolean z13 = false;
                            while (i16 <= length) {
                                boolean z14 = AbstractC19074t.m100209g(m118339r2.charAt(!z13 ? i16 : length), 32) <= 0;
                                if (z13) {
                                    if (!z14) {
                                        break;
                                    } else {
                                        length--;
                                    }
                                } else if (z14) {
                                    i16++;
                                } else {
                                    z13 = true;
                                }
                            }
                            obj = m118339r2.subSequence(i16, length + 1).toString();
                        }
                        if (TextUtils.isEmpty(obj)) {
                            RobotoTextView robotoTextView31 = this.f38350K;
                            AbstractC19074t.m100205c(robotoTextView31);
                            robotoTextView31.setVisibility(8);
                        } else {
                            RobotoTextView robotoTextView32 = this.f38350K;
                            AbstractC19074t.m100205c(robotoTextView32);
                            robotoTextView32.setText(obj);
                            RobotoTextView robotoTextView33 = this.f38350K;
                            AbstractC19074t.m100205c(robotoTextView33);
                            robotoTextView33.setVisibility(0);
                        }
                        if (TextUtils.isEmpty(str2)) {
                            RobotoTextView robotoTextView34 = this.f38351L;
                            AbstractC19074t.m100205c(robotoTextView34);
                            if (!z12) {
                                i13 = 8;
                            }
                            robotoTextView34.setVisibility(i13);
                        } else {
                            RobotoTextView robotoTextView35 = this.f38351L;
                            AbstractC19074t.m100205c(robotoTextView35);
                            robotoTextView35.setText(str2);
                            RobotoTextView robotoTextView36 = this.f38351L;
                            AbstractC19074t.m100205c(robotoTextView36);
                            robotoTextView36.setVisibility(0);
                        }
                        i12 = 5;
                    } else {
                        RobotoTextView robotoTextView37 = this.f38352M;
                        AbstractC19074t.m100205c(robotoTextView37);
                        robotoTextView37.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_add_friend_new));
                        RobotoTextView robotoTextView38 = this.f38352M;
                        AbstractC19074t.m100205c(robotoTextView38);
                        robotoTextView38.setVisibility(c31874cb.f146406v == 1 ? 0 : 8);
                        ImageButton imageButton5 = this.f38353N;
                        AbstractC19074t.m100205c(imageButton5);
                        imageButton5.setVisibility(c31874cb.f146407w == 1 ? 0 : 8);
                        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_you_may_know);
                        AbstractC19074t.m100207e(m118743r03, "getString(...)");
                        RobotoTextView robotoTextView39 = this.f38350K;
                        AbstractC19074t.m100205c(robotoTextView39);
                        robotoTextView39.setText(m118743r03);
                        RobotoTextView robotoTextView40 = this.f38350K;
                        AbstractC19074t.m100205c(robotoTextView40);
                        robotoTextView40.setVisibility(0);
                        RobotoTextView robotoTextView41 = this.f38351L;
                        AbstractC19074t.m100205c(robotoTextView41);
                        robotoTextView41.setVisibility(z12 ? 4 : 8);
                    }
                    i12 = 4;
                }
                RobotoTextView robotoTextView42 = this.f38352M;
                AbstractC19074t.m100205c(robotoTextView42);
                robotoTextView42.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.y2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C7015b3.a.m35859m0(C25927x0.a.this, c31874cb, i12, i11, view);
                    }
                });
                ImageButton imageButton6 = this.f38353N;
                AbstractC19074t.m100205c(imageButton6);
                imageButton6.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.z2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C7015b3.a.m35860n0(C25927x0.a.this, c31874cb, i11, view);
                    }
                });
                this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.a3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C7015b3.a.m35861o0(C25927x0.a.this, c31874cb, i11, view);
                    }
                });
                RobotoTextView robotoTextView43 = this.f38349J;
                AbstractC19074t.m100205c(robotoTextView43);
                robotoTextView43.setText(c31874cb.m153180d(true, false));
                if (C23302b.f113247a.m120523d(c31874cb.f146393i) && !TextUtils.isEmpty(c31874cb.f146401q)) {
                    GroupAvatarView groupAvatarView = this.f38348I;
                    AbstractC19074t.m100205c(groupAvatarView);
                    groupAvatarView.setShortDpnAvt(c31874cb.f146401q);
                    GroupAvatarView groupAvatarView2 = this.f38348I;
                    AbstractC19074t.m100205c(groupAvatarView2);
                    groupAvatarView2.setUidForGenColor(c31874cb.f146385a);
                }
                GroupAvatarView groupAvatarView3 = this.f38348I;
                AbstractC19074t.m100205c(groupAvatarView3);
                groupAvatarView3.setImageOption(C23278z2.m120143n());
                if (TextUtils.isEmpty(c31874cb.f146393i)) {
                    return;
                }
                GroupAvatarView groupAvatarView4 = this.f38348I;
                AbstractC19074t.m100205c(groupAvatarView4);
                groupAvatarView4.setScrollingMode(z11);
                GroupAvatarView groupAvatarView5 = this.f38348I;
                AbstractC19074t.m100205c(groupAvatarView5);
                groupAvatarView5.m75732d(c31874cb.f146393i);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: L */
    public final C31874cb m35851L(int i11) {
        List list = this.f38346t;
        if (list != null && i11 >= 0) {
            AbstractC19074t.m100205c(list);
            if (i11 < list.size()) {
                List list2 = this.f38346t;
                AbstractC19074t.m100205c(list2);
                return (C31874cb) list2.get(i11);
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        C31874cb m35851L = m35851L(i11);
        if (m35851L != null) {
            aVar.m35862l0(i11, m35851L, this.f38345s, this.f38344r, this.f38347u);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.item_horizontal_suggest_friend, viewGroup, false);
        AbstractC19074t.m100207e(inflate, "inflate(...)");
        return new a(inflate);
    }

    /* renamed from: O */
    public final void m35854O(List list) {
        List list2;
        if (list != null) {
            list2 = AbstractC25332a0.m131187O0(list);
        } else {
            list2 = null;
        }
        this.f38346t = list2;
    }

    /* renamed from: P */
    public final void m35855P(C25927x0.a aVar) {
        AbstractC19074t.m100208f(aVar, "feedCallback");
        this.f38344r = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f38346t;
        if (list != null) {
            AbstractC19074t.m100205c(list);
            return list.size();
        }
        return 0;
    }
}
