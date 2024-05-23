package com.zing.zalo.adapters;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7153n7;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23210s6;
import me0.AbstractC23268y2;
import me0.C23278z2;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p354n3.C23528a;
import p461qu.AbstractC25495a;
import vg.C28203u6;

/* renamed from: com.zing.zalo.adapters.n7 */
/* loaded from: classes3.dex */
public class C7153n7 extends RecyclerView.AbstractC1880g {

    /* renamed from: A */
    C23528a f39119A;

    /* renamed from: r */
    List f39120r;

    /* renamed from: t */
    a f39122t;

    /* renamed from: x */
    View f39126x;

    /* renamed from: y */
    View f39127y;

    /* renamed from: s */
    boolean f39121s = false;

    /* renamed from: u */
    public boolean f39123u = false;

    /* renamed from: v */
    public boolean f39124v = false;

    /* renamed from: w */
    public String f39125w = "";

    /* renamed from: z */
    Map f39128z = new HashMap();

    /* renamed from: com.zing.zalo.adapters.n7$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: P */
        void mo36377P(ContactProfile contactProfile);

        /* renamed from: T1 */
        boolean mo36378T1(String str);

        /* renamed from: Z1 */
        void mo36379Z1(ContactProfile contactProfile);

        /* renamed from: w */
        void mo36380w(ContactProfile contactProfile);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.n7$b */
    /* loaded from: classes3.dex */
    public class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public GroupAvatarView f39129I;

        /* renamed from: J */
        public RecyclingImageView f39130J;

        /* renamed from: K */
        public TextView f39131K;

        /* renamed from: L */
        public TextView f39132L;

        /* renamed from: M */
        public TextView f39133M;

        /* renamed from: N */
        public TextView f39134N;

        /* renamed from: O */
        public View f39135O;

        /* renamed from: P */
        public CheckBox f39136P;

        /* renamed from: Q */
        public TextView f39137Q;

        /* renamed from: R */
        public View f39138R;

        /* renamed from: S */
        public TextView f39139S;

        /* renamed from: T */
        public RecyclingImageView f39140T;

        public b(View view, int i11) {
            super(view);
            if (i11 == 1) {
                this.f39129I = (GroupAvatarView) view.findViewById(AbstractC6918a0.img_avt);
                this.f39130J = (RecyclingImageView) view.findViewById(AbstractC6918a0.status_icon);
                this.f39131K = (TextView) view.findViewById(AbstractC6918a0.name);
                this.f39132L = (TextView) view.findViewById(AbstractC6918a0.description);
                this.f39133M = (TextView) view.findViewById(AbstractC6918a0.btn_send);
                this.f39136P = (CheckBox) view.findViewById(AbstractC6918a0.pick_friend_checkbox);
                return;
            }
            if (i11 == 2) {
                this.f39134N = (TextView) view.findViewById(AbstractC6918a0.title_row);
                this.f39135O = view.findViewById(AbstractC6918a0.separate_line);
                return;
            }
            if (i11 == 3) {
                this.f39137Q = (TextView) view.findViewById(AbstractC6918a0.tvCount);
                this.f39138R = view.findViewById(AbstractC6918a0.separate_line1);
                this.f39139S = (TextView) view.findViewById(AbstractC6918a0.tvTitleSeeMore);
            } else if (i11 == 4) {
                this.f39131K = (TextView) view.findViewById(AbstractC6918a0.name);
                this.f39140T = (RecyclingImageView) view.findViewById(AbstractC6918a0.image);
                this.f39135O = view.findViewById(AbstractC6918a0.separate_line);
            } else if (i11 == 0) {
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n0 */
        public /* synthetic */ void m36385n0(ContactProfile contactProfile, View view) {
            a aVar = C7153n7.this.f39122t;
            if (aVar != null) {
                aVar.mo36377P(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o0 */
        public /* synthetic */ void m36386o0(ContactProfile contactProfile, View view) {
            C7153n7 c7153n7 = C7153n7.this;
            if (c7153n7.f39122t != null) {
                Map map = c7153n7.f39128z;
                String str = contactProfile.f42434r;
                map.put(str, str);
                TextView textView = this.f39133M;
                textView.setText(textView.getResources().getString(AbstractC8020f0.say_hi_box_action_sent));
                this.f39133M.setEnabled(false);
                C7153n7.this.m10008p();
                C7153n7.this.f39122t.mo36379Z1(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p0 */
        public /* synthetic */ void m36387p0(ContactProfile contactProfile, View view) {
            a aVar = C7153n7.this.f39122t;
            if (aVar != null) {
                aVar.mo36380w(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q0 */
        public /* synthetic */ void m36388q0(ContactProfile contactProfile, View view) {
            a aVar = C7153n7.this.f39122t;
            if (aVar != null) {
                aVar.mo36380w(contactProfile);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0194 A[Catch: Exception -> 0x0045, TryCatch #2 {Exception -> 0x0045, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0015, B:8:0x001b, B:11:0x0020, B:13:0x0042, B:14:0x004a, B:15:0x0099, B:17:0x00a3, B:19:0x00af, B:20:0x00be, B:22:0x00c4, B:24:0x0153, B:26:0x0166, B:29:0x0184, B:30:0x0190, B:32:0x0194, B:34:0x019e, B:35:0x01b2, B:37:0x01b6, B:39:0x01c4, B:41:0x01d5, B:56:0x0241, B:59:0x023e, B:60:0x024b, B:62:0x025b, B:64:0x025f, B:69:0x01ad, B:70:0x016d, B:72:0x0175, B:75:0x017e, B:76:0x00d2, B:78:0x00da, B:79:0x00e4, B:94:0x014e, B:97:0x014b, B:98:0x00b7, B:99:0x0048, B:100:0x006e, B:102:0x0079, B:103:0x0094, B:106:0x0272, B:109:0x0281, B:114:0x0289, B:118:0x0298, B:121:0x02a0, B:123:0x02ad, B:125:0x02ba, B:126:0x02c7, B:127:0x0360, B:129:0x02de, B:132:0x02ed, B:133:0x030d, B:135:0x0317, B:136:0x0337, B:138:0x0341, B:44:0x01df, B:46:0x01e8, B:48:0x01f6, B:50:0x0212, B:82:0x00f2, B:84:0x00fb, B:86:0x0109, B:88:0x0125), top: B:1:0x0000, inners: #0, #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01b6 A[Catch: Exception -> 0x0045, TryCatch #2 {Exception -> 0x0045, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0015, B:8:0x001b, B:11:0x0020, B:13:0x0042, B:14:0x004a, B:15:0x0099, B:17:0x00a3, B:19:0x00af, B:20:0x00be, B:22:0x00c4, B:24:0x0153, B:26:0x0166, B:29:0x0184, B:30:0x0190, B:32:0x0194, B:34:0x019e, B:35:0x01b2, B:37:0x01b6, B:39:0x01c4, B:41:0x01d5, B:56:0x0241, B:59:0x023e, B:60:0x024b, B:62:0x025b, B:64:0x025f, B:69:0x01ad, B:70:0x016d, B:72:0x0175, B:75:0x017e, B:76:0x00d2, B:78:0x00da, B:79:0x00e4, B:94:0x014e, B:97:0x014b, B:98:0x00b7, B:99:0x0048, B:100:0x006e, B:102:0x0079, B:103:0x0094, B:106:0x0272, B:109:0x0281, B:114:0x0289, B:118:0x0298, B:121:0x02a0, B:123:0x02ad, B:125:0x02ba, B:126:0x02c7, B:127:0x0360, B:129:0x02de, B:132:0x02ed, B:133:0x030d, B:135:0x0317, B:136:0x0337, B:138:0x0341, B:44:0x01df, B:46:0x01e8, B:48:0x01f6, B:50:0x0212, B:82:0x00f2, B:84:0x00fb, B:86:0x0109, B:88:0x0125), top: B:1:0x0000, inners: #0, #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01d5 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #2 {Exception -> 0x0045, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0015, B:8:0x001b, B:11:0x0020, B:13:0x0042, B:14:0x004a, B:15:0x0099, B:17:0x00a3, B:19:0x00af, B:20:0x00be, B:22:0x00c4, B:24:0x0153, B:26:0x0166, B:29:0x0184, B:30:0x0190, B:32:0x0194, B:34:0x019e, B:35:0x01b2, B:37:0x01b6, B:39:0x01c4, B:41:0x01d5, B:56:0x0241, B:59:0x023e, B:60:0x024b, B:62:0x025b, B:64:0x025f, B:69:0x01ad, B:70:0x016d, B:72:0x0175, B:75:0x017e, B:76:0x00d2, B:78:0x00da, B:79:0x00e4, B:94:0x014e, B:97:0x014b, B:98:0x00b7, B:99:0x0048, B:100:0x006e, B:102:0x0079, B:103:0x0094, B:106:0x0272, B:109:0x0281, B:114:0x0289, B:118:0x0298, B:121:0x02a0, B:123:0x02ad, B:125:0x02ba, B:126:0x02c7, B:127:0x0360, B:129:0x02de, B:132:0x02ed, B:133:0x030d, B:135:0x0317, B:136:0x0337, B:138:0x0341, B:44:0x01df, B:46:0x01e8, B:48:0x01f6, B:50:0x0212, B:82:0x00f2, B:84:0x00fb, B:86:0x0109, B:88:0x0125), top: B:1:0x0000, inners: #0, #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x025b A[Catch: Exception -> 0x0045, TryCatch #2 {Exception -> 0x0045, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0015, B:8:0x001b, B:11:0x0020, B:13:0x0042, B:14:0x004a, B:15:0x0099, B:17:0x00a3, B:19:0x00af, B:20:0x00be, B:22:0x00c4, B:24:0x0153, B:26:0x0166, B:29:0x0184, B:30:0x0190, B:32:0x0194, B:34:0x019e, B:35:0x01b2, B:37:0x01b6, B:39:0x01c4, B:41:0x01d5, B:56:0x0241, B:59:0x023e, B:60:0x024b, B:62:0x025b, B:64:0x025f, B:69:0x01ad, B:70:0x016d, B:72:0x0175, B:75:0x017e, B:76:0x00d2, B:78:0x00da, B:79:0x00e4, B:94:0x014e, B:97:0x014b, B:98:0x00b7, B:99:0x0048, B:100:0x006e, B:102:0x0079, B:103:0x0094, B:106:0x0272, B:109:0x0281, B:114:0x0289, B:118:0x0298, B:121:0x02a0, B:123:0x02ad, B:125:0x02ba, B:126:0x02c7, B:127:0x0360, B:129:0x02de, B:132:0x02ed, B:133:0x030d, B:135:0x0317, B:136:0x0337, B:138:0x0341, B:44:0x01df, B:46:0x01e8, B:48:0x01f6, B:50:0x0212, B:82:0x00f2, B:84:0x00fb, B:86:0x0109, B:88:0x0125), top: B:1:0x0000, inners: #0, #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00da A[Catch: Exception -> 0x0045, TryCatch #2 {Exception -> 0x0045, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0015, B:8:0x001b, B:11:0x0020, B:13:0x0042, B:14:0x004a, B:15:0x0099, B:17:0x00a3, B:19:0x00af, B:20:0x00be, B:22:0x00c4, B:24:0x0153, B:26:0x0166, B:29:0x0184, B:30:0x0190, B:32:0x0194, B:34:0x019e, B:35:0x01b2, B:37:0x01b6, B:39:0x01c4, B:41:0x01d5, B:56:0x0241, B:59:0x023e, B:60:0x024b, B:62:0x025b, B:64:0x025f, B:69:0x01ad, B:70:0x016d, B:72:0x0175, B:75:0x017e, B:76:0x00d2, B:78:0x00da, B:79:0x00e4, B:94:0x014e, B:97:0x014b, B:98:0x00b7, B:99:0x0048, B:100:0x006e, B:102:0x0079, B:103:0x0094, B:106:0x0272, B:109:0x0281, B:114:0x0289, B:118:0x0298, B:121:0x02a0, B:123:0x02ad, B:125:0x02ba, B:126:0x02c7, B:127:0x0360, B:129:0x02de, B:132:0x02ed, B:133:0x030d, B:135:0x0317, B:136:0x0337, B:138:0x0341, B:44:0x01df, B:46:0x01e8, B:48:0x01f6, B:50:0x0212, B:82:0x00f2, B:84:0x00fb, B:86:0x0109, B:88:0x0125), top: B:1:0x0000, inners: #0, #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00e4 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #2 {Exception -> 0x0045, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0015, B:8:0x001b, B:11:0x0020, B:13:0x0042, B:14:0x004a, B:15:0x0099, B:17:0x00a3, B:19:0x00af, B:20:0x00be, B:22:0x00c4, B:24:0x0153, B:26:0x0166, B:29:0x0184, B:30:0x0190, B:32:0x0194, B:34:0x019e, B:35:0x01b2, B:37:0x01b6, B:39:0x01c4, B:41:0x01d5, B:56:0x0241, B:59:0x023e, B:60:0x024b, B:62:0x025b, B:64:0x025f, B:69:0x01ad, B:70:0x016d, B:72:0x0175, B:75:0x017e, B:76:0x00d2, B:78:0x00da, B:79:0x00e4, B:94:0x014e, B:97:0x014b, B:98:0x00b7, B:99:0x0048, B:100:0x006e, B:102:0x0079, B:103:0x0094, B:106:0x0272, B:109:0x0281, B:114:0x0289, B:118:0x0298, B:121:0x02a0, B:123:0x02ad, B:125:0x02ba, B:126:0x02c7, B:127:0x0360, B:129:0x02de, B:132:0x02ed, B:133:0x030d, B:135:0x0317, B:136:0x0337, B:138:0x0341, B:44:0x01df, B:46:0x01e8, B:48:0x01f6, B:50:0x0212, B:82:0x00f2, B:84:0x00fb, B:86:0x0109, B:88:0x0125), top: B:1:0x0000, inners: #0, #1 }] */
        /* renamed from: m0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m36389m0(int i11, int i12) {
            ContactProfile m141811g;
            TextView textView;
            int i13;
            try {
                List list = C7153n7.this.f39120r;
                if (list != null) {
                    final ContactProfile contactProfile = (ContactProfile) list.get(i11);
                    AbstractC19646n0.m103016p2(contactProfile);
                    int i14 = 8;
                    if (i12 == 1) {
                        C7153n7 c7153n7 = C7153n7.this;
                        if (!c7153n7.f39123u && !c7153n7.f39124v) {
                            this.f7784p.setOnClickListener(null);
                            this.f39133M.setVisibility(0);
                            this.f39136P.setVisibility(8);
                            Resources resources = this.f39133M.getResources();
                            if (!C7153n7.this.f39128z.containsKey(contactProfile.f42434r)) {
                                i13 = AbstractC8020f0.say_hi_box_action_send;
                            } else {
                                i13 = AbstractC8020f0.say_hi_box_action_sent;
                            }
                            this.f39133M.setText(resources.getString(i13));
                            this.f39133M.setEnabled(!C7153n7.this.f39128z.containsKey(contactProfile.f42434r));
                            this.f39133M.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.p7
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7153n7.b.this.m36386o0(contactProfile, view);
                                }
                            });
                            if (TextUtils.isEmpty(C7153n7.this.f39125w) && C7153n7.this.f39125w.equals(contactProfile.f42434r)) {
                                this.f7784p.setBackgroundResource(AbstractC16803z.stencils_contact_bg_new);
                            } else {
                                this.f7784p.setBackgroundResource(AbstractC16803z.stencils_contact_bg);
                            }
                            if (contactProfile.f42359M1 || contactProfile.mo2475c().equals(AbstractC21935u.m114547n())) {
                                if (!contactProfile.f42399a1.isEmpty()) {
                                    this.f39131K.setText(contactProfile.m40383Q(true, false));
                                } else {
                                    SpannableString spannableString = new SpannableString(contactProfile.m40383Q(true, false).trim());
                                    for (int i15 = 0; i15 < contactProfile.f42399a1.size() - 1; i15 += 2) {
                                        try {
                                            if (((Integer) contactProfile.f42399a1.get(i15)).intValue() >= 0) {
                                                int i16 = i15 + 1;
                                                if (((Integer) contactProfile.f42399a1.get(i16)).intValue() > ((Integer) contactProfile.f42399a1.get(i15)).intValue()) {
                                                    spannableString.setSpan(new StyleSpan(1), ((Integer) contactProfile.f42399a1.get(i15)).intValue(), ((Integer) contactProfile.f42399a1.get(i16)).intValue(), 33);
                                                }
                                            }
                                        } catch (Exception e11) {
                                            AbstractC20110a.m104539h(e11);
                                        }
                                    }
                                    this.f39131K.setText(spannableString);
                                }
                            }
                            AbstractC23268y2.m120027a(this.f39129I, contactProfile, C7153n7.this.f39121s);
                            m141811g = C28203u6.f131407a.m141811g(contactProfile.f42434r);
                            if ((m141811g != null || !m141811g.m40359B0()) && !AbstractC25495a.m132078c(contactProfile.f42434r) && !AbstractC25495a.m132086k(contactProfile.f42434r)) {
                                this.f39130J.setVisibility(8);
                                if (!AbstractC23210s6.f112470b && !TextUtils.isEmpty(contactProfile.m40378N())) {
                                    this.f39132L.setText(contactProfile.m40378N());
                                    this.f39132L.setVisibility(0);
                                } else {
                                    this.f39132L.setVisibility(8);
                                }
                                if (contactProfile.f42359M1 && !contactProfile.mo2475c().equals(AbstractC21935u.m114547n())) {
                                    this.f39131K.setText(AbstractC21935u.m114547n());
                                    if (!contactProfile.f42399a1.isEmpty()) {
                                        SpannableString spannableString2 = new SpannableString(contactProfile.mo2475c());
                                        for (int i17 = 0; i17 < contactProfile.f42399a1.size() - 1; i17 += 2) {
                                            try {
                                                if (((Integer) contactProfile.f42399a1.get(i17)).intValue() >= 0) {
                                                    int i18 = i17 + 1;
                                                    if (((Integer) contactProfile.f42399a1.get(i18)).intValue() > ((Integer) contactProfile.f42399a1.get(i17)).intValue()) {
                                                        spannableString2.setSpan(new ForegroundColorSpan(AbstractC23136l9.m118639A(AbstractC16801x.hignlight)), ((Integer) contactProfile.f42399a1.get(i17)).intValue(), ((Integer) contactProfile.f42399a1.get(i18)).intValue(), 33);
                                                    }
                                                }
                                            } catch (Exception e12) {
                                                e12.printStackTrace();
                                            }
                                        }
                                        this.f39132L.setText(spannableString2);
                                        this.f39132L.setVisibility(0);
                                    }
                                }
                                if (C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r) && (textView = this.f39132L) != null) {
                                    textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_block_chat));
                                    this.f39132L.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            this.f39130J.setImageResource(AbstractC16803z.ic_oa_verify);
                            this.f39130J.setVisibility(0);
                            if (!AbstractC23210s6.f112470b) {
                            }
                            this.f39132L.setVisibility(8);
                            if (contactProfile.f42359M1) {
                                this.f39131K.setText(AbstractC21935u.m114547n());
                                if (!contactProfile.f42399a1.isEmpty()) {
                                }
                            }
                            if (C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r)) {
                                return;
                            } else {
                                return;
                            }
                        }
                        this.f39133M.setVisibility(8);
                        a aVar = C7153n7.this.f39122t;
                        if (aVar != null) {
                            this.f39136P.setChecked(aVar.mo36378T1(contactProfile.f42434r));
                            this.f39136P.setVisibility(0);
                            this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.o7
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7153n7.b.this.m36385n0(contactProfile, view);
                                }
                            });
                        } else {
                            this.f39136P.setVisibility(8);
                        }
                        if (TextUtils.isEmpty(C7153n7.this.f39125w)) {
                        }
                        this.f7784p.setBackgroundResource(AbstractC16803z.stencils_contact_bg);
                        if (contactProfile.f42359M1) {
                        }
                        if (!contactProfile.f42399a1.isEmpty()) {
                        }
                        AbstractC23268y2.m120027a(this.f39129I, contactProfile, C7153n7.this.f39121s);
                        m141811g = C28203u6.f131407a.m141811g(contactProfile.f42434r);
                        if (m141811g != null) {
                        }
                        this.f39130J.setVisibility(8);
                        if (!AbstractC23210s6.f112470b) {
                        }
                        this.f39132L.setVisibility(8);
                        if (contactProfile.f42359M1) {
                        }
                        if (C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r)) {
                        }
                    } else {
                        if (i12 == 2) {
                            this.f39134N.setText(contactProfile.f42437s);
                            View view = this.f39135O;
                            if (!contactProfile.f42407e1) {
                                i14 = 0;
                            }
                            view.setVisibility(i14);
                            return;
                        }
                        if (i12 == 3) {
                            this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.q7
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C7153n7.b.this.m36387p0(contactProfile, view2);
                                }
                            });
                            return;
                        }
                        if (i12 == 4) {
                            View view2 = this.f39135O;
                            if (!contactProfile.f42407e1) {
                                i14 = 0;
                            }
                            view2.setVisibility(i14);
                            if (contactProfile.f42434r.equals("-10")) {
                                this.f39131K.setText(contactProfile.f42437s);
                                C7153n7 c7153n72 = C7153n7.this;
                                if (c7153n72.f39119A == null) {
                                    c7153n72.f39119A = new C23528a(this.f7784p.getContext());
                                }
                                ((C23528a) C7153n7.this.f39119A.m123612r(this.f39140T)).m123618x(contactProfile.f42446v, C23278z2.m120150q0());
                            } else if (contactProfile.f42434r.equals("-1")) {
                                this.f39131K.setText(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_lable_share_group_new));
                                this.f39140T.setTag(1090453505, "");
                                this.f39140T.setImageResource(AbstractC16803z.ic_creategroup_line_24_sharesheet_placeholder);
                            } else if (contactProfile.f42434r.equals("-2")) {
                                this.f39131K.setText(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_lable_share_story));
                                this.f39140T.setTag(1090453505, "");
                                this.f39140T.setImageResource(AbstractC16803z.ic_broadcast_to_story);
                            } else if (contactProfile.f42434r.equals("-3")) {
                                this.f39131K.setText(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_lable_share_timeline));
                                this.f39140T.setTag(1090453505, "");
                                this.f39140T.setImageResource(AbstractC16803z.ic_broadcast_to_timeline);
                            }
                            this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.r7
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    C7153n7.b.this.m36388q0(contactProfile, view3);
                                }
                            });
                        }
                    }
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
    }

    public C7153n7(a aVar, View view, View view2) {
        this.f39122t = aVar;
        this.f39126x = view;
        this.f39127y = view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        if (i11 < this.f39120r.size()) {
            bVar.m36389m0(i11, mo10005m(i11));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i11 == 0) {
            return new b(this.f39126x, i11);
        }
        if (i11 == 6) {
            return new b(this.f39127y, i11);
        }
        if (i11 == 2) {
            return new b(from.inflate(AbstractC7409c0.item_list_header_row_material, viewGroup, false), i11);
        }
        if (i11 == 3) {
            return new b(from.inflate(AbstractC7409c0.item_see_more_global_search, viewGroup, false), i11);
        }
        if (i11 == 4) {
            return new b(from.inflate(AbstractC7409c0.share_item_destinations_view, viewGroup, false), i11);
        }
        if (i11 == 5) {
            return new b(from.inflate(AbstractC7409c0.seperate_list_global_search, viewGroup, false), i11);
        }
        if (i11 == 7) {
            return new b(from.inflate(AbstractC7409c0.item_empty_share_view, viewGroup, false), i11);
        }
        return new b(from.inflate(AbstractC7409c0.share_item_normal_view, viewGroup, false), i11);
    }

    /* renamed from: N */
    public void m36375N(List list) {
        this.f39120r = new ArrayList(list);
    }

    /* renamed from: O */
    public void m36376O(boolean z11) {
        this.f39121s = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        int i11;
        List list = this.f39120r;
        if (list != null) {
            i11 = list.size();
        } else {
            i11 = 0;
        }
        return i11 + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (i11 >= mo10003k() - 1) {
            return 6;
        }
        if (i11 < this.f39120r.size()) {
            ContactProfile contactProfile = (ContactProfile) this.f39120r.get(i11);
            if (contactProfile.f42434r.equals("-8")) {
                return 5;
            }
            if (contactProfile.f42434r.equals("-9")) {
                return 7;
            }
            if (!contactProfile.f42434r.equals("-4") && !contactProfile.f42434r.equals("-5") && !contactProfile.f42434r.equals("-6") && !contactProfile.f42434r.equals("-7")) {
                if (contactProfile.f42434r.equals("-11")) {
                    return 0;
                }
                if (contactProfile.f42434r.startsWith("-")) {
                    return 4;
                }
                if (!contactProfile.m40366G0()) {
                    return 2;
                }
            } else {
                return 3;
            }
        }
        return 1;
    }
}
