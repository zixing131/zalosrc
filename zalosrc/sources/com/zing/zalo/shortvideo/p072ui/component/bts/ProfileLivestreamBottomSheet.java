package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.shortvideo.data.remote.ws.call.LiveChanelStats;
import com.zing.zalo.shortvideo.p072ui.component.bts.ProfileLivestreamBottomSheet;
import com.zing.zalo.shortvideo.p072ui.widget.LivestreamChannelInfoLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import mj0.AbstractC23322a;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C24995d;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import u20.C26980a;
import v00.AbstractC27406a;
import v00.AbstractC27408c;
import v00.AbstractC27411f;
import v00.AbstractC27413h;

/* loaded from: classes5.dex */
public final class ProfileLivestreamBottomSheet extends BaseBottomSheetView {
    public static final C9510b Companion = new C9510b(null);

    /* renamed from: O0 */
    private static final String f50443O0 = "AVATAR_URL";

    /* renamed from: P0 */
    private static final String f50444P0 = "IS_FOLLOWER";

    /* renamed from: Q0 */
    private static final String f50445Q0 = "CHANNEL_NAME";

    /* renamed from: R0 */
    private static final String f50446R0 = "STATS";

    /* renamed from: S0 */
    private static final String f50447S0 = "IS_LANDSCAPE";

    /* renamed from: M0 */
    private C24995d f50448M0;

    /* renamed from: N0 */
    private InterfaceC9509a f50449N0;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ProfileLivestreamBottomSheet$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9509a {
        /* renamed from: a */
        void mo51894a(boolean z11);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ProfileLivestreamBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C9510b {
        private C9510b() {
        }

        public /* synthetic */ C9510b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ProfileLivestreamBottomSheet m51895a(String str, boolean z11, String str2, LiveChanelStats liveChanelStats, boolean z12) {
            ProfileLivestreamBottomSheet profileLivestreamBottomSheet = new ProfileLivestreamBottomSheet();
            profileLivestreamBottomSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a(ProfileLivestreamBottomSheet.f50443O0, str), AbstractC24866w.m129235a(ProfileLivestreamBottomSheet.f50444P0, Boolean.valueOf(z11)), AbstractC24866w.m129235a(ProfileLivestreamBottomSheet.f50445Q0, str2), AbstractC24866w.m129235a(ProfileLivestreamBottomSheet.f50446R0, liveChanelStats), AbstractC24866w.m129235a(ProfileLivestreamBottomSheet.f50447S0, Boolean.valueOf(z12))));
            return profileLivestreamBottomSheet;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ProfileLivestreamBottomSheet$c */
    /* loaded from: classes5.dex */
    static final class C9511c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9511c f50450q = new C9511c();

        C9511c() {
            super(1);
        }

        /* renamed from: a */
        public final void m51896a(ViewGroup.LayoutParams layoutParams) {
            FrameLayout.LayoutParams layoutParams2;
            AbstractC19074t.m100208f(layoutParams, "it");
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.gravity = 1;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51896a((ViewGroup.LayoutParams) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: pL */
    public static /* synthetic */ void m51890pL(ProfileLivestreamBottomSheet profileLivestreamBottomSheet, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        profileLivestreamBottomSheet.m51892oL(z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qL */
    public static final void m51891qL(ProfileLivestreamBottomSheet profileLivestreamBottomSheet, View view) {
        Boolean bool;
        boolean z11;
        AbstractC19074t.m100208f(profileLivestreamBottomSheet, "this$0");
        Object tag = view.getTag();
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            z11 = bool.booleanValue();
        } else {
            z11 = false;
        }
        InterfaceC9509a interfaceC9509a = profileLivestreamBottomSheet.f50449N0;
        if (interfaceC9509a != null) {
            interfaceC9509a.mo51894a(!z11);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m51753XK(true);
        boolean z11 = false;
        m51756aL(false);
        m51758cL(true);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean(f50447S0, false);
        }
        m51759dL(z11);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView
    /* renamed from: WK */
    public View mo51752WK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C24995d m129782c = C24995d.m129782c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m129782c, "inflate(...)");
        this.f50448M0 = m129782c;
        LivestreamChannelInfoLayout root = m129782c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        AbstractC26112n.m134394e(root, C9511c.f50450q);
        LivestreamChannelInfoLayout root2 = m129782c.getRoot();
        AbstractC19074t.m100207e(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String string;
        boolean z11;
        String str;
        LiveChanelStats liveChanelStats;
        long j11;
        String str2;
        int i11;
        long j12;
        String str3;
        int i12;
        long j13;
        int i13;
        Long m51601c;
        Long m51600b;
        Long m51603e;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (string = m92642L3.getString(f50445Q0)) != null) {
            Bundle m92642L32 = m92642L3();
            if (m92642L32 != null) {
                z11 = m92642L32.getBoolean(f50444P0);
            } else {
                z11 = false;
            }
            Bundle m92642L33 = m92642L3();
            if (m92642L33 != null) {
                str = m92642L33.getString(f50443O0);
            } else {
                str = null;
            }
            Bundle m92642L34 = m92642L3();
            if (m92642L34 != null) {
                liveChanelStats = (LiveChanelStats) m92642L34.getParcelable(f50446R0);
            } else {
                liveChanelStats = null;
            }
            C24995d c24995d = this.f50448M0;
            if (c24995d != null) {
                AvatarImageView avatarImageView = c24995d.f119831r;
                AbstractC19074t.m100207e(avatarImageView, "ivAvatar");
                AvatarImageView.m55927l(avatarImageView, null, string, str, AbstractC27408c.zch_placeholder_avatar_channel, false, 16, null);
                c24995d.f119839z.setText(string);
                if (liveChanelStats != null && (m51603e = liveChanelStats.m51603e()) != null) {
                    j11 = m51603e.longValue();
                } else {
                    j11 = -1;
                }
                SimpleShadowTextView simpleShadowTextView = c24995d.f119838y;
                String str4 = "-";
                if (j11 < 0) {
                    str2 = "-";
                } else {
                    str2 = String.valueOf(j11);
                }
                simpleShadowTextView.setText(str2);
                SimpleShadowTextView simpleShadowTextView2 = c24995d.f119828C;
                Resources m92651WI = m92651WI();
                int i14 = AbstractC27411f.zch_layout_channel_info_stats_videos;
                if (j11 <= 1) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                simpleShadowTextView2.setText(m92651WI.getQuantityString(i14, i11));
                if (liveChanelStats != null && (m51600b = liveChanelStats.m51600b()) != null) {
                    j12 = m51600b.longValue();
                } else {
                    j12 = -1;
                }
                c24995d.f119836w.setTag(Long.valueOf(j12));
                SimpleShadowTextView simpleShadowTextView3 = c24995d.f119836w;
                if (j12 < 0) {
                    str3 = "-";
                } else {
                    str3 = AbstractC26105g.m134334a(j12);
                }
                simpleShadowTextView3.setText(str3);
                SimpleShadowTextView simpleShadowTextView4 = c24995d.f119826A;
                Resources m92651WI2 = m92651WI();
                int i15 = AbstractC27411f.zch_layout_channel_info_stats_followers;
                if (j12 <= 1) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                simpleShadowTextView4.setText(m92651WI2.getQuantityString(i15, i12));
                if (liveChanelStats != null && (m51601c = liveChanelStats.m51601c()) != null) {
                    j13 = m51601c.longValue();
                } else {
                    j13 = -1;
                }
                SimpleShadowTextView simpleShadowTextView5 = c24995d.f119837x;
                if (j13 >= 0) {
                    str4 = AbstractC26105g.m134334a(j13);
                }
                simpleShadowTextView5.setText(str4);
                SimpleShadowTextView simpleShadowTextView6 = c24995d.f119827B;
                Resources m92651WI3 = m92651WI();
                int i16 = AbstractC27411f.zch_layout_channel_info_stats_likes;
                if (j13 <= 1) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                simpleShadowTextView6.setText(m92651WI3.getQuantityString(i16, i13));
                c24995d.f119830q.setOnClickListener(new View.OnClickListener() { // from class: v10.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ProfileLivestreamBottomSheet.m51891qL(ProfileLivestreamBottomSheet.this, view2);
                    }
                });
                m51890pL(this, z11, false, 2, null);
            }
        }
    }

    /* renamed from: oL */
    public final void m51892oL(boolean z11, boolean z12) {
        Long l11;
        long j11;
        C24995d c24995d = this.f50448M0;
        if (c24995d != null) {
            c24995d.f119830q.setTag(Boolean.valueOf(z11));
            int i11 = 1;
            if (z11) {
                SimpleShadowTextView simpleShadowTextView = c24995d.f119830q;
                simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive);
                SimpleShadowTextView simpleShadowTextView2 = c24995d.f119830q;
                AbstractC19074t.m100207e(simpleShadowTextView2, "btnFollowSuggest");
                AbstractC26112n.m134425t0(simpleShadowTextView2, AbstractC27406a.zch_text_tertiary);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString("   ");
                Context context = simpleShadowTextView.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                spannableString.setSpan(new C26980a(context, AbstractC23322a.zch_ic_check_solid_16, 0, 4, null), 0, 1, 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) m92652XI(AbstractC27413h.zch_page_channel_following));
                simpleShadowTextView.setText(spannableStringBuilder);
            } else {
                c24995d.f119830q.setBackgroundResource(AbstractC27408c.zch_bg_button_active_blue);
                SimpleShadowTextView simpleShadowTextView3 = c24995d.f119830q;
                AbstractC19074t.m100207e(simpleShadowTextView3, "btnFollowSuggest");
                AbstractC26112n.m134425t0(simpleShadowTextView3, AbstractC27406a.zch_text_primary);
                c24995d.f119830q.setText(m92652XI(AbstractC27413h.zch_page_channel_follow));
            }
            if (z12) {
                Object tag = c24995d.f119836w.getTag();
                if (tag instanceof Long) {
                    l11 = (Long) tag;
                } else {
                    l11 = null;
                }
                if (l11 != null) {
                    j11 = l11.longValue();
                } else {
                    j11 = -3;
                }
                if (!z11) {
                    i11 = -1;
                }
                long j12 = j11 + i11;
                if (j12 >= 0) {
                    c24995d.f119836w.setText(AbstractC26105g.m134334a(j12));
                    c24995d.f119836w.setTag(Long.valueOf(j12));
                }
            }
        }
    }

    /* renamed from: rL */
    public final void m51893rL(InterfaceC9509a interfaceC9509a) {
        this.f50449N0 = interfaceC9509a;
    }
}
