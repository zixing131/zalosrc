package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7045d9;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.AbstractC17466e;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p142ey.C18644n;
import p262jb.AbstractC21196a;
import p304ks.C21927m;
import p348mi.C23302b;
import p354n3.C23528a;
import p716zh.C31859bb;
import p716zh.C31874cb;
import r30.C25643m;
import t00.C26446c;
import y60.C30802d;

/* renamed from: com.zing.zalo.adapters.d9 */
/* loaded from: classes3.dex */
public class C7045d9 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    ArrayList f38495r;

    /* renamed from: s */
    List f38496s;

    /* renamed from: t */
    List f38497t;

    /* renamed from: u */
    public Context f38498u;

    /* renamed from: v */
    public LayoutInflater f38499v;

    /* renamed from: w */
    c f38500w;

    /* renamed from: x */
    C23528a f38501x;

    /* renamed from: z */
    int f38503z;

    /* renamed from: y */
    boolean f38502y = false;

    /* renamed from: A */
    HashMap f38493A = new HashMap();

    /* renamed from: B */
    public boolean f38494B = false;

    /* renamed from: com.zing.zalo.adapters.d9$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        public a(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public abstract void mo35990i0(C31859bb c31859bb, int i11);
    }

    /* renamed from: com.zing.zalo.adapters.d9$b */
    /* loaded from: classes3.dex */
    public class b extends a {

        /* renamed from: I */
        public TextView f38504I;

        /* renamed from: J */
        public View f38505J;

        /* renamed from: K */
        public TextView f38506K;

        /* renamed from: L */
        LinearLayout f38507L;

        /* renamed from: M */
        LinearLayout f38508M;

        /* renamed from: N */
        public boolean f38509N;

        /* renamed from: O */
        public TextView f38510O;

        /* renamed from: P */
        public GroupAvatarView[] f38511P;

        /* renamed from: Q */
        public RobotoTextView f38512Q;

        public b(View view, int i11, Context context) {
            super(view);
            this.f38509N = false;
            this.f38511P = new GroupAvatarView[3];
            m36003p0(view, i11, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q0 */
        public /* synthetic */ void m35997q0(int i11, View view) {
            c cVar = C7045d9.this.f38500w;
            if (cVar != null) {
                cVar.mo36011n(i11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r0 */
        public /* synthetic */ boolean m35998r0(int i11, View view) {
            c cVar = C7045d9.this.f38500w;
            if (cVar != null) {
                return cVar.mo36015wb(i11);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s0 */
        public /* synthetic */ void m35999s0(C31859bb c31859bb, View view) {
            c cVar;
            int i11 = c31859bb.f146290a;
            if (i11 == 2) {
                c cVar2 = C7045d9.this.f38500w;
                if (cVar2 != null) {
                    cVar2.mo36013u1();
                    return;
                }
                return;
            }
            if (i11 == 1 && (cVar = C7045d9.this.f38500w) != null) {
                cVar.mo36006Pj();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t0 */
        public /* synthetic */ void m36000t0(View view) {
            c cVar = C7045d9.this.f38500w;
            if (cVar != null) {
                cVar.mo36012t3();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u0 */
        public /* synthetic */ void m36001u0(View view) {
            c cVar = C7045d9.this.f38500w;
            if (cVar != null) {
                cVar.mo36004B1();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v0 */
        public /* synthetic */ void m36002v0(String str, String str2, View view) {
            c cVar = C7045d9.this.f38500w;
            if (cVar != null) {
                cVar.mo36008Rn(str, str2);
            }
        }

        @Override // com.zing.zalo.adapters.C7045d9.a
        /* renamed from: i0 */
        public void mo35990i0(final C31859bb c31859bb, final int i11) {
            List list;
            String m118743r0;
            if (c31859bb != null) {
                try {
                    C31874cb m153145a = C7045d9.this.m35968L(i11).m153145a();
                    switch (m9931C()) {
                        case 3:
                            this.f38509N = false;
                            this.f38504I.setText(m153145a.f146387c);
                            this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.e9
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7045d9.b.this.m35997q0(i11, view);
                                }
                            });
                            this.f7784p.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.f9
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    boolean m35998r0;
                                    m35998r0 = C7045d9.b.this.m35998r0(i11, view);
                                    return m35998r0;
                                }
                            });
                            return;
                        case 4:
                            for (int i12 = 0; i12 < 3; i12++) {
                                this.f38511P[i12].setVisibility(8);
                            }
                            this.f38510O.setVisibility(8);
                            int i13 = c31859bb.f146290a;
                            if (i13 == 2) {
                                list = C7045d9.this.f38497t;
                            } else if (i13 == 1) {
                                list = C7045d9.this.f38496s;
                            } else {
                                list = null;
                            }
                            if (list != null && !list.isEmpty()) {
                                for (int i14 = 0; i14 < list.size(); i14++) {
                                    try {
                                        C31874cb c31874cb = (C31874cb) list.get(i14);
                                        if (c31874cb.f146385a.equals("-1")) {
                                            this.f38510O.setText(c31874cb.f146387c);
                                            this.f38510O.setVisibility(0);
                                        } else {
                                            this.f38511P[i14].setVisibility(0);
                                            if (C23302b.f113247a.m120523d(c31874cb.f146393i)) {
                                                if (TextUtils.isEmpty(c31874cb.f146401q)) {
                                                    c31874cb.f146401q = AbstractC23028c0.m118087g(c31874cb.m153180d(true, false));
                                                }
                                                if (!TextUtils.isEmpty(c31874cb.f146401q)) {
                                                    this.f38511P[i14].setShortDpnAvt(c31874cb.f146401q);
                                                    this.f38511P[i14].setUidForGenColor(c31874cb.f146385a);
                                                }
                                            }
                                            this.f38511P[i14].setImageOption(C23278z2.m120143n());
                                            if (!TextUtils.isEmpty(c31874cb.f146393i)) {
                                                this.f38511P[i14].setScrollingMode(C7045d9.this.f38502y);
                                                this.f38511P[i14].m75732d(c31874cb.f146393i);
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                            }
                            this.f38505J.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.g9
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7045d9.b.this.m35999s0(c31859bb, view);
                                }
                            });
                            return;
                        case 5:
                        default:
                            return;
                        case 6:
                            if (c31859bb.f146290a == 4) {
                                C31874cb c31874cb2 = c31859bb.f146291b;
                                if (c31874cb2 != null && !TextUtils.isEmpty(c31874cb2.f146387c)) {
                                    m118743r0 = c31859bb.f146291b.f146387c;
                                } else {
                                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.suggestfriend_title);
                                }
                            } else {
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_request_friend);
                            }
                            this.f38506K.setText(m118743r0);
                            return;
                        case 7:
                            this.f38507L.setVisibility(0);
                            this.f38508M.setVisibility(8);
                            return;
                        case 8:
                            this.f38508M.setVisibility(0);
                            this.f38507L.setVisibility(8);
                            this.f38508M.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.h9
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7045d9.b.this.m36000t0(view);
                                }
                            });
                            return;
                        case 9:
                            this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.i9
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7045d9.b.this.m36001u0(view);
                                }
                            });
                            return;
                        case 10:
                            C25643m c25643m = c31859bb.f146292c;
                            if (c25643m == null) {
                                c25643m = C25643m.m132535a();
                            }
                            if (c25643m.m132536b() && c25643m.m132537c()) {
                                this.f38512Q.setVisibility(0);
                                this.f38512Q.setText(c25643m.f122616b);
                                final String str = c25643m.f122617c;
                                final String str2 = c25643m.f122618d;
                                this.f38512Q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.j9
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C7045d9.b.this.m36002v0(str, str2, view);
                                    }
                                });
                                return;
                            }
                            this.f38512Q.setVisibility(8);
                            return;
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                e12.printStackTrace();
            }
        }

        /* renamed from: p0 */
        public void m36003p0(View view, int i11, Context context) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 6) {
                        if (i11 != 7 && i11 != 8) {
                            if (i11 == 10) {
                                this.f38512Q = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_find_friend);
                                return;
                            }
                            return;
                        } else {
                            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
                            this.f38507L = linearLayout;
                            linearLayout.setBackgroundResource(AbstractC17466e.transparent);
                            this.f38508M = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterError);
                            return;
                        }
                    }
                    this.f38506K = (TextView) view.findViewById(AbstractC6918a0.tv_suggest_title);
                    return;
                }
                this.f38505J = view;
                this.f38511P[0] = (GroupAvatarView) this.f7784p.findViewById(AbstractC6918a0.img_avatar_1);
                this.f38511P[1] = (GroupAvatarView) this.f7784p.findViewById(AbstractC6918a0.img_avatar_2);
                this.f38511P[2] = (GroupAvatarView) this.f7784p.findViewById(AbstractC6918a0.img_avatar_3);
                this.f38510O = (TextView) this.f7784p.findViewById(AbstractC6918a0.tvCount);
                return;
            }
            this.f38504I = (TextView) view.findViewById(AbstractC6918a0.title_row);
        }
    }

    /* renamed from: com.zing.zalo.adapters.d9$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: B1 */
        void mo36004B1();

        /* renamed from: Fx */
        void mo36005Fx(int i11, int i12);

        /* renamed from: Pj */
        void mo36006Pj();

        /* renamed from: R3 */
        boolean mo36007R3(String str);

        /* renamed from: Rn */
        void mo36008Rn(String str, String str2);

        /* renamed from: c7 */
        boolean mo36009c7();

        /* renamed from: g2 */
        boolean mo36010g2(String str);

        /* renamed from: n */
        void mo36011n(int i11);

        /* renamed from: t3 */
        void mo36012t3();

        /* renamed from: u1 */
        void mo36013u1();

        /* renamed from: u4 */
        void mo36014u4();

        /* renamed from: wb */
        boolean mo36015wb(int i11);
    }

    /* renamed from: com.zing.zalo.adapters.d9$d */
    /* loaded from: classes3.dex */
    public class d extends a {

        /* renamed from: I */
        public GroupAvatarView f38514I;

        /* renamed from: J */
        public RobotoTextView f38515J;

        /* renamed from: K */
        public RobotoTextView f38516K;

        /* renamed from: L */
        public RobotoTextView f38517L;

        /* renamed from: M */
        public TextView f38518M;

        /* renamed from: N */
        public TextView f38519N;

        /* renamed from: O */
        public ImageButton f38520O;

        /* renamed from: P */
        public TextView f38521P;

        /* renamed from: Q */
        public View f38522Q;

        /* renamed from: R */
        public TextView f38523R;

        /* renamed from: S */
        public View f38524S;

        /* renamed from: T */
        public CheckBox f38525T;

        /* renamed from: U */
        public RobotoTextView f38526U;

        /* renamed from: V */
        public C30802d f38527V;

        /* renamed from: W */
        int f38528W;

        /* renamed from: X */
        int f38529X;

        /* renamed from: Y */
        int f38530Y;

        /* renamed from: Z */
        int f38531Z;

        public d(View view, int i11, Context context) {
            super(view);
            m36024n0(view, i11, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o0 */
        public /* synthetic */ void m36020o0(int i11, View view) {
            c cVar = C7045d9.this.f38500w;
            if (cVar != null) {
                cVar.mo36011n(i11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p0 */
        public /* synthetic */ boolean m36021p0(int i11, View view) {
            c cVar = C7045d9.this.f38500w;
            if (cVar != null) {
                return cVar.mo36015wb(i11);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q0 */
        public /* synthetic */ void m36022q0(C31874cb c31874cb, View view) {
            c cVar = C7045d9.this.f38500w;
            if (cVar != null) {
                cVar.mo36014u4();
            }
            c31874cb.f146382D = true;
            C7045d9.this.m10008p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r0 */
        public /* synthetic */ void m36023r0(int i11, int i12, View view) {
            c cVar = C7045d9.this.f38500w;
            if (cVar != null) {
                cVar.mo36005Fx(i11, i12);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x04bc A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:3:0x0002, B:5:0x0026, B:6:0x00ba, B:8:0x00c0, B:12:0x00cb, B:13:0x00d7, B:15:0x00e9, B:17:0x00f1, B:19:0x00fd, B:20:0x00ff, B:22:0x0106, B:24:0x010f, B:26:0x0113, B:27:0x0132, B:28:0x0152, B:31:0x0166, B:34:0x0173, B:35:0x03c2, B:37:0x03ca, B:38:0x046b, B:41:0x048e, B:43:0x0494, B:44:0x04b2, B:46:0x04bc, B:48:0x04c4, B:49:0x04ce, B:51:0x04d6, B:52:0x04e4, B:54:0x04f5, B:56:0x0507, B:57:0x0526, B:61:0x0521, B:62:0x04ad, B:63:0x03d1, B:66:0x0123, B:67:0x0138, B:69:0x0140, B:70:0x014d, B:71:0x0178, B:73:0x017c, B:76:0x019a, B:78:0x01ad, B:81:0x01b7, B:82:0x01d2, B:84:0x01da, B:85:0x01eb, B:87:0x01f1, B:88:0x0201, B:90:0x0208, B:93:0x022b, B:96:0x0238, B:99:0x01fc, B:100:0x01dd, B:102:0x01c0, B:105:0x01ca, B:108:0x023d, B:110:0x0241, B:113:0x025a, B:116:0x026c, B:118:0x027e, B:119:0x02ab, B:121:0x02b1, B:123:0x02c6, B:125:0x02ce, B:128:0x02f1, B:131:0x02fe, B:134:0x02b7, B:135:0x028b, B:137:0x029b, B:138:0x02a6, B:142:0x0305, B:145:0x0314, B:148:0x0321, B:150:0x0333, B:151:0x0359, B:153:0x035f, B:154:0x036f, B:156:0x0375, B:158:0x038a, B:161:0x03b2, B:164:0x03bf, B:167:0x037b, B:168:0x0365, B:169:0x0336, B:176:0x0344, B:177:0x034d, B:180:0x03e2, B:183:0x03fb, B:186:0x040d, B:188:0x0430, B:190:0x0438, B:193:0x045b, B:196:0x0468, B:201:0x00d3, B:203:0x0072), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x04f5 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:3:0x0002, B:5:0x0026, B:6:0x00ba, B:8:0x00c0, B:12:0x00cb, B:13:0x00d7, B:15:0x00e9, B:17:0x00f1, B:19:0x00fd, B:20:0x00ff, B:22:0x0106, B:24:0x010f, B:26:0x0113, B:27:0x0132, B:28:0x0152, B:31:0x0166, B:34:0x0173, B:35:0x03c2, B:37:0x03ca, B:38:0x046b, B:41:0x048e, B:43:0x0494, B:44:0x04b2, B:46:0x04bc, B:48:0x04c4, B:49:0x04ce, B:51:0x04d6, B:52:0x04e4, B:54:0x04f5, B:56:0x0507, B:57:0x0526, B:61:0x0521, B:62:0x04ad, B:63:0x03d1, B:66:0x0123, B:67:0x0138, B:69:0x0140, B:70:0x014d, B:71:0x0178, B:73:0x017c, B:76:0x019a, B:78:0x01ad, B:81:0x01b7, B:82:0x01d2, B:84:0x01da, B:85:0x01eb, B:87:0x01f1, B:88:0x0201, B:90:0x0208, B:93:0x022b, B:96:0x0238, B:99:0x01fc, B:100:0x01dd, B:102:0x01c0, B:105:0x01ca, B:108:0x023d, B:110:0x0241, B:113:0x025a, B:116:0x026c, B:118:0x027e, B:119:0x02ab, B:121:0x02b1, B:123:0x02c6, B:125:0x02ce, B:128:0x02f1, B:131:0x02fe, B:134:0x02b7, B:135:0x028b, B:137:0x029b, B:138:0x02a6, B:142:0x0305, B:145:0x0314, B:148:0x0321, B:150:0x0333, B:151:0x0359, B:153:0x035f, B:154:0x036f, B:156:0x0375, B:158:0x038a, B:161:0x03b2, B:164:0x03bf, B:167:0x037b, B:168:0x0365, B:169:0x0336, B:176:0x0344, B:177:0x034d, B:180:0x03e2, B:183:0x03fb, B:186:0x040d, B:188:0x0430, B:190:0x0438, B:193:0x045b, B:196:0x0468, B:201:0x00d3, B:203:0x0072), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0507 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:3:0x0002, B:5:0x0026, B:6:0x00ba, B:8:0x00c0, B:12:0x00cb, B:13:0x00d7, B:15:0x00e9, B:17:0x00f1, B:19:0x00fd, B:20:0x00ff, B:22:0x0106, B:24:0x010f, B:26:0x0113, B:27:0x0132, B:28:0x0152, B:31:0x0166, B:34:0x0173, B:35:0x03c2, B:37:0x03ca, B:38:0x046b, B:41:0x048e, B:43:0x0494, B:44:0x04b2, B:46:0x04bc, B:48:0x04c4, B:49:0x04ce, B:51:0x04d6, B:52:0x04e4, B:54:0x04f5, B:56:0x0507, B:57:0x0526, B:61:0x0521, B:62:0x04ad, B:63:0x03d1, B:66:0x0123, B:67:0x0138, B:69:0x0140, B:70:0x014d, B:71:0x0178, B:73:0x017c, B:76:0x019a, B:78:0x01ad, B:81:0x01b7, B:82:0x01d2, B:84:0x01da, B:85:0x01eb, B:87:0x01f1, B:88:0x0201, B:90:0x0208, B:93:0x022b, B:96:0x0238, B:99:0x01fc, B:100:0x01dd, B:102:0x01c0, B:105:0x01ca, B:108:0x023d, B:110:0x0241, B:113:0x025a, B:116:0x026c, B:118:0x027e, B:119:0x02ab, B:121:0x02b1, B:123:0x02c6, B:125:0x02ce, B:128:0x02f1, B:131:0x02fe, B:134:0x02b7, B:135:0x028b, B:137:0x029b, B:138:0x02a6, B:142:0x0305, B:145:0x0314, B:148:0x0321, B:150:0x0333, B:151:0x0359, B:153:0x035f, B:154:0x036f, B:156:0x0375, B:158:0x038a, B:161:0x03b2, B:164:0x03bf, B:167:0x037b, B:168:0x0365, B:169:0x0336, B:176:0x0344, B:177:0x034d, B:180:0x03e2, B:183:0x03fb, B:186:0x040d, B:188:0x0430, B:190:0x0438, B:193:0x045b, B:196:0x0468, B:201:0x00d3, B:203:0x0072), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0521 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:3:0x0002, B:5:0x0026, B:6:0x00ba, B:8:0x00c0, B:12:0x00cb, B:13:0x00d7, B:15:0x00e9, B:17:0x00f1, B:19:0x00fd, B:20:0x00ff, B:22:0x0106, B:24:0x010f, B:26:0x0113, B:27:0x0132, B:28:0x0152, B:31:0x0166, B:34:0x0173, B:35:0x03c2, B:37:0x03ca, B:38:0x046b, B:41:0x048e, B:43:0x0494, B:44:0x04b2, B:46:0x04bc, B:48:0x04c4, B:49:0x04ce, B:51:0x04d6, B:52:0x04e4, B:54:0x04f5, B:56:0x0507, B:57:0x0526, B:61:0x0521, B:62:0x04ad, B:63:0x03d1, B:66:0x0123, B:67:0x0138, B:69:0x0140, B:70:0x014d, B:71:0x0178, B:73:0x017c, B:76:0x019a, B:78:0x01ad, B:81:0x01b7, B:82:0x01d2, B:84:0x01da, B:85:0x01eb, B:87:0x01f1, B:88:0x0201, B:90:0x0208, B:93:0x022b, B:96:0x0238, B:99:0x01fc, B:100:0x01dd, B:102:0x01c0, B:105:0x01ca, B:108:0x023d, B:110:0x0241, B:113:0x025a, B:116:0x026c, B:118:0x027e, B:119:0x02ab, B:121:0x02b1, B:123:0x02c6, B:125:0x02ce, B:128:0x02f1, B:131:0x02fe, B:134:0x02b7, B:135:0x028b, B:137:0x029b, B:138:0x02a6, B:142:0x0305, B:145:0x0314, B:148:0x0321, B:150:0x0333, B:151:0x0359, B:153:0x035f, B:154:0x036f, B:156:0x0375, B:158:0x038a, B:161:0x03b2, B:164:0x03bf, B:167:0x037b, B:168:0x0365, B:169:0x0336, B:176:0x0344, B:177:0x034d, B:180:0x03e2, B:183:0x03fb, B:186:0x040d, B:188:0x0430, B:190:0x0438, B:193:0x045b, B:196:0x0468, B:201:0x00d3, B:203:0x0072), top: B:2:0x0002 }] */
        @Override // com.zing.zalo.adapters.C7045d9.a
        /* renamed from: i0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo35990i0(C31859bb c31859bb, final int i11) {
            boolean z11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            String trim;
            int i18;
            int i19;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            String string;
            int i27;
            int i28;
            int i29;
            String m153180d;
            int i31;
            int i32;
            if (c31859bb != null) {
                try {
                    Context context = this.f7784p.getContext();
                    final C31874cb m153145a = C7045d9.this.m35968L(i11).m153145a();
                    boolean m35975S = C7045d9.this.m35975S(m153145a.f146385a);
                    if (!C7045d9.this.m35974R(m153145a.f146385a)) {
                        this.f38515J.setTextStyleBold(false);
                        this.f38527V.m149869b(C23212s8.m119607o(context, AbstractC16781w.PopupBackgroundColor));
                        this.f38527V.m149868a(true);
                        this.f38516K.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
                        this.f38517L.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
                        this.f38526U.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
                        this.f38523R.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
                        this.f7784p.setBackgroundResource(AbstractC16803z.stencils_bg_white_with_press_state);
                    } else {
                        this.f38515J.setTextStyleBold(true);
                        this.f38527V.m149869b(C23212s8.m119607o(context, AbstractC16781w.PopupBackgroundColor));
                        this.f38527V.m149868a(true);
                        this.f38516K.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
                        this.f38517L.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
                        this.f38526U.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
                        this.f38523R.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
                        this.f7784p.setBackgroundResource(AbstractC16803z.stencils_contact_bg_new);
                    }
                    c cVar = C7045d9.this.f38500w;
                    if (cVar != null && cVar.mo36009c7()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.f38529X = this.f38530Y - this.f38531Z;
                    } else {
                        this.f38529X = this.f38530Y;
                    }
                    this.f38525T.setChecked(C7045d9.this.m35977U(m153145a.f146385a));
                    if (m153145a.f146400p == 3 && !AbstractC23063f2.m118359k(m153145a.f146385a) && !C18644n.m98531l().m98558u(m153145a.f146385a)) {
                        m153145a.f146400p = 1;
                    }
                    if (m153145a.f146400p == 3) {
                        this.f38524S.setVisibility(8);
                        if (m153145a.f146390f <= 0) {
                            if (m153145a.f146399o == 2) {
                                this.f38516K.setText(C7045d9.this.f38498u.getString(AbstractC8020f0.str_done_action_friend_request_new));
                            } else {
                                this.f38516K.setText(C7045d9.this.f38498u.getString(AbstractC8020f0.str_done_action_friend_suggest_new));
                            }
                            this.f38516K.setVisibility(0);
                        } else if (!TextUtils.isEmpty(m153145a.f146386b)) {
                            this.f38516K.setText(m153145a.f146386b);
                            this.f38516K.setVisibility(0);
                        } else {
                            this.f38516K.setVisibility(8);
                        }
                        this.f38518M.setVisibility(8);
                        this.f38519N.setVisibility(8);
                        ImageButton imageButton = this.f38520O;
                        if (m153145a.f146407w == 1) {
                            i31 = 0;
                        } else {
                            i31 = 8;
                        }
                        imageButton.setVisibility(i31);
                        TextView textView = this.f38521P;
                        if (m153145a.f146406v == 1) {
                            i32 = 0;
                        } else {
                            i32 = 8;
                        }
                        textView.setVisibility(i32);
                    } else {
                        if (m153145a.f146390f > 0) {
                            this.f38518M.setText(C7045d9.this.f38498u.getString(AbstractC8020f0.str_suggest_func_follow_page));
                            this.f38519N.setVisibility(8);
                            ImageButton imageButton2 = this.f38520O;
                            if (m153145a.f146407w == 1) {
                                i25 = 0;
                            } else {
                                i25 = 8;
                            }
                            imageButton2.setVisibility(i25);
                            if (C21927m.m114302u().m114357s().m153137g(m153145a.f146385a)) {
                                TextView textView2 = this.f38521P;
                                if (m153145a.f146406v == 1) {
                                    i29 = 0;
                                } else {
                                    i29 = 8;
                                }
                                textView2.setVisibility(i29);
                                this.f38518M.setVisibility(8);
                            } else {
                                TextView textView3 = this.f38518M;
                                if (m153145a.f146406v == 1) {
                                    i26 = 0;
                                } else {
                                    i26 = 8;
                                }
                                textView3.setVisibility(i26);
                                this.f38521P.setVisibility(8);
                            }
                            if (!TextUtils.isEmpty(m153145a.f146386b)) {
                                string = m153145a.f146386b;
                            } else {
                                string = C7045d9.this.f38498u.getResources().getString(AbstractC8020f0.str_maybe_you_care);
                            }
                            if (!TextUtils.isEmpty(string)) {
                                this.f38516K.setText(string);
                                this.f38516K.setVisibility(0);
                            } else {
                                this.f38516K.setVisibility(8);
                            }
                            this.f38524S.setVisibility(8);
                            if (m35975S) {
                                this.f38516K.setText(C7045d9.this.f38498u.getString(AbstractC8020f0.str_done_action_page_suggest));
                                this.f38516K.setVisibility(0);
                                this.f38518M.setVisibility(8);
                                ImageButton imageButton3 = this.f38520O;
                                if (m153145a.f146407w == 1) {
                                    i27 = 0;
                                } else {
                                    i27 = 8;
                                }
                                imageButton3.setVisibility(i27);
                                TextView textView4 = this.f38521P;
                                if (m153145a.f146406v == 1) {
                                    i28 = 0;
                                } else {
                                    i28 = 8;
                                }
                                textView4.setVisibility(i28);
                            }
                        } else {
                            int i33 = m153145a.f146399o;
                            if (i33 == 1) {
                                this.f38518M.setText(C7045d9.this.f38498u.getString(AbstractC8020f0.str_suggest_func_add_friend_new));
                                TextView textView5 = this.f38518M;
                                if (m153145a.f146406v == 1) {
                                    i21 = 0;
                                } else {
                                    i21 = 8;
                                }
                                textView5.setVisibility(i21);
                                this.f38519N.setVisibility(8);
                                ImageButton imageButton4 = this.f38520O;
                                if (m153145a.f146407w == 1) {
                                    i22 = 0;
                                } else {
                                    i22 = 8;
                                }
                                imageButton4.setVisibility(i22);
                                this.f38521P.setVisibility(8);
                                String str = m153145a.f146396l;
                                if (!TextUtils.isEmpty(m153145a.f146397m)) {
                                    this.f38516K.setText(m153145a.f146397m);
                                    this.f38516K.setVisibility(0);
                                } else {
                                    String m118339r = AbstractC23059e9.m118339r(m153145a.f146399o, m153145a.f146389e, m153145a.f146394j);
                                    if (!TextUtils.isEmpty(m118339r)) {
                                        this.f38516K.setText(m118339r);
                                        this.f38516K.setVisibility(0);
                                    } else {
                                        this.f38516K.setVisibility(8);
                                    }
                                }
                                if (TextUtils.isEmpty(str)) {
                                    this.f38524S.setVisibility(8);
                                } else {
                                    m36026t0(this.f38517L, str, !m153145a.f146382D);
                                    this.f38524S.setVisibility(0);
                                }
                                if (m35975S || AbstractC23063f2.m118359k(m153145a.f146385a)) {
                                    this.f38516K.setText(C7045d9.this.f38498u.getString(AbstractC8020f0.str_done_action_friend_suggest_new));
                                    this.f38516K.setVisibility(0);
                                    this.f38518M.setVisibility(8);
                                    ImageButton imageButton5 = this.f38520O;
                                    if (m153145a.f146407w == 1) {
                                        i23 = 0;
                                    } else {
                                        i23 = 8;
                                    }
                                    imageButton5.setVisibility(i23);
                                    TextView textView6 = this.f38521P;
                                    if (m153145a.f146406v == 1) {
                                        i24 = 0;
                                    } else {
                                        i24 = 8;
                                    }
                                    textView6.setVisibility(i24);
                                }
                            } else if (i33 == 2) {
                                this.f38518M.setVisibility(8);
                                TextView textView7 = this.f38519N;
                                if (m153145a.f146406v == 1) {
                                    i16 = 0;
                                } else {
                                    i16 = 8;
                                }
                                textView7.setVisibility(i16);
                                ImageButton imageButton6 = this.f38520O;
                                if (m153145a.f146407w == 1) {
                                    i17 = 0;
                                } else {
                                    i17 = 8;
                                }
                                imageButton6.setVisibility(i17);
                                this.f38521P.setVisibility(8);
                                String str2 = m153145a.f146396l;
                                if (!TextUtils.isEmpty(m153145a.f146397m)) {
                                    trim = m153145a.f146397m;
                                } else {
                                    int i34 = m153145a.f146389e;
                                    if (i34 != -1 && i34 != 30 && i34 != 10) {
                                        trim = AbstractC23059e9.m118339r(m153145a.f146399o, i34, m153145a.f146394j);
                                    }
                                    trim = AbstractC23059e9.m118339r(m153145a.f146399o, i34, m153145a.f146394j).trim();
                                }
                                if (TextUtils.isEmpty(trim)) {
                                    this.f38516K.setVisibility(8);
                                } else {
                                    this.f38516K.setText(trim);
                                    this.f38516K.setVisibility(0);
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    this.f38524S.setVisibility(8);
                                } else {
                                    m36026t0(this.f38517L, str2, !m153145a.f146382D);
                                    this.f38524S.setVisibility(0);
                                }
                                if (m35975S) {
                                    this.f38516K.setText(C7045d9.this.f38498u.getString(AbstractC8020f0.str_done_action_friend_request_new));
                                    this.f38516K.setVisibility(0);
                                    this.f38524S.setVisibility(8);
                                    this.f38519N.setVisibility(8);
                                    ImageButton imageButton7 = this.f38520O;
                                    if (m153145a.f146407w == 1) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    imageButton7.setVisibility(i18);
                                    TextView textView8 = this.f38521P;
                                    if (m153145a.f146406v == 1) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    textView8.setVisibility(i19);
                                }
                            } else {
                                this.f38518M.setText(C7045d9.this.f38498u.getString(AbstractC8020f0.str_suggest_func_add_friend_new));
                                TextView textView9 = this.f38518M;
                                if (m153145a.f146406v == 1) {
                                    i12 = 0;
                                } else {
                                    i12 = 8;
                                }
                                textView9.setVisibility(i12);
                                this.f38519N.setVisibility(8);
                                ImageButton imageButton8 = this.f38520O;
                                if (m153145a.f146407w == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                imageButton8.setVisibility(i13);
                                this.f38521P.setVisibility(8);
                                this.f38516K.setText(C7045d9.this.f38498u.getString(AbstractC8020f0.str_you_may_know));
                                this.f38516K.setVisibility(0);
                                this.f38524S.setVisibility(8);
                                if (m35975S || AbstractC23063f2.m118359k(m153145a.f146385a)) {
                                    this.f38516K.setText(C7045d9.this.f38498u.getString(AbstractC8020f0.str_done_action_friend_suggest_new));
                                    this.f38516K.setVisibility(0);
                                    this.f38518M.setVisibility(8);
                                    ImageButton imageButton9 = this.f38520O;
                                    if (m153145a.f146407w == 1) {
                                        i14 = 0;
                                    } else {
                                        i14 = 8;
                                    }
                                    imageButton9.setVisibility(i14);
                                    TextView textView10 = this.f38521P;
                                    if (m153145a.f146406v == 1) {
                                        i15 = 0;
                                    } else {
                                        i15 = 8;
                                    }
                                    textView10.setVisibility(i15);
                                }
                            }
                        }
                        m36025s0(this.f38518M, i11, 0);
                        m36025s0(this.f38519N, i11, 1);
                        m36025s0(this.f38520O, i11, 2);
                        m36025s0(this.f38521P, i11, 3);
                        m153180d = m153145a.m153180d(true, false);
                        String str3 = m153145a.f146387c;
                        this.f38515J.setText(m153180d);
                        if (m153180d == null && str3 != null && !m153180d.equals(str3)) {
                            this.f38526U.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_name_title), str3));
                            this.f38526U.setVisibility(0);
                        } else {
                            this.f38526U.setVisibility(8);
                        }
                        if (C23302b.f113247a.m120523d(m153145a.f146393i)) {
                            if (TextUtils.isEmpty(m153145a.f146401q)) {
                                m153145a.f146401q = AbstractC23028c0.m118087g(m153145a.m153180d(true, false));
                            }
                            if (!TextUtils.isEmpty(m153145a.f146401q)) {
                                this.f38514I.setShortDpnAvt(m153145a.f146401q);
                                this.f38514I.setUidForGenColor(m153145a.f146385a);
                            }
                        }
                        this.f38514I.setImageOption(C23278z2.m120143n());
                        if (!TextUtils.isEmpty(m153145a.f146393i)) {
                            this.f38514I.setScrollingMode(C7045d9.this.f38502y);
                            this.f38514I.m75732d(m153145a.f146393i);
                        }
                        if (!z11) {
                            this.f38525T.setVisibility(0);
                            this.f38518M.setVisibility(8);
                            this.f38519N.setVisibility(8);
                            this.f38520O.setVisibility(8);
                            this.f38521P.setVisibility(8);
                        } else {
                            this.f38525T.setVisibility(8);
                        }
                        this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.k9
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C7045d9.d.this.m36020o0(i11, view);
                            }
                        });
                        this.f7784p.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.l9
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                boolean m36021p0;
                                m36021p0 = C7045d9.d.this.m36021p0(i11, view);
                                return m36021p0;
                            }
                        });
                        this.f38523R.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.m9
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C7045d9.d.this.m36022q0(m153145a, view);
                            }
                        });
                    }
                    if (TextUtils.isEmpty(m153145a.f146396l)) {
                        this.f38524S.setVisibility(8);
                    } else {
                        m36026t0(this.f38517L, m153145a.f146396l, !m153145a.f146382D);
                        this.f38524S.setVisibility(0);
                    }
                    m36025s0(this.f38518M, i11, 0);
                    m36025s0(this.f38519N, i11, 1);
                    m36025s0(this.f38520O, i11, 2);
                    m36025s0(this.f38521P, i11, 3);
                    m153180d = m153145a.m153180d(true, false);
                    String str32 = m153145a.f146387c;
                    this.f38515J.setText(m153180d);
                    if (m153180d == null) {
                    }
                    this.f38526U.setVisibility(8);
                    if (C23302b.f113247a.m120523d(m153145a.f146393i)) {
                    }
                    this.f38514I.setImageOption(C23278z2.m120143n());
                    if (!TextUtils.isEmpty(m153145a.f146393i)) {
                    }
                    if (!z11) {
                    }
                    this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.k9
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C7045d9.d.this.m36020o0(i11, view);
                        }
                    });
                    this.f7784p.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.l9
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            boolean m36021p0;
                            m36021p0 = C7045d9.d.this.m36021p0(i11, view);
                            return m36021p0;
                        }
                    });
                    this.f38523R.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.m9
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C7045d9.d.this.m36022q0(m153145a, view);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* renamed from: n0 */
        public void m36024n0(View view, int i11, Context context) {
            this.f38514I = (GroupAvatarView) view.findViewById(AbstractC6918a0.buddy_dp);
            this.f38515J = (RobotoTextView) view.findViewById(AbstractC6918a0.name);
            this.f38516K = (RobotoTextView) view.findViewById(AbstractC6918a0.tvInvitation);
            this.f38517L = (RobotoTextView) view.findViewById(AbstractC6918a0.tvInvitationDetail);
            this.f38518M = (TextView) view.findViewById(AbstractC6918a0.btn_combine_func_1);
            this.f38519N = (TextView) view.findViewById(AbstractC6918a0.btn_combine_func_2);
            this.f38520O = (ImageButton) view.findViewById(AbstractC6918a0.btn_combine_func_3);
            this.f38521P = (TextView) view.findViewById(AbstractC6918a0.btn_combine_func_4);
            this.f38522Q = view.findViewById(AbstractC6918a0.separate_line);
            this.f38526U = (RobotoTextView) view.findViewById(AbstractC6918a0.tvZaloName);
            this.f38523R = (TextView) view.findViewById(AbstractC6918a0.view_see_more);
            this.f38524S = view.findViewById(AbstractC6918a0.view_container);
            this.f38525T = (CheckBox) view.findViewById(AbstractC6918a0.btn_check);
            this.f38528W = AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_l_r);
            this.f38531Z = AbstractC23136l9.m118742r(38.0f);
            C30802d c30802d = new C30802d(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(0.5f), C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            this.f38527V = c30802d;
            AbstractC23136l9.m118696b1(this.f38524S, c30802d);
            this.f38519N.setText(C26446c.m136326b().m136327a());
            this.f38530Y = AbstractC23136l9.m118722k0() - (this.f38528W * 4);
        }

        /* renamed from: s0 */
        void m36025s0(View view, final int i11, final int i12) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.n9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7045d9.d.this.m36023r0(i11, i12, view2);
                }
            });
        }

        /* renamed from: t0 */
        void m36026t0(TextView textView, String str, boolean z11) {
            if (textView == null) {
                return;
            }
            textView.setText(str);
            if (z11) {
                TextPaint paint = textView.getPaint();
                if (paint != null && paint.measureText(str) > this.f38529X) {
                    textView.setMaxLines(1);
                    this.f38523R.setVisibility(0);
                    return;
                } else {
                    textView.setMaxLines(Integer.MAX_VALUE);
                    this.f38523R.setVisibility(8);
                    return;
                }
            }
            textView.setMaxLines(Integer.MAX_VALUE);
            this.f38523R.setVisibility(8);
        }
    }

    public C7045d9(Context context, C23528a c23528a) {
        this.f38498u = context;
        this.f38501x = c23528a;
        this.f38499v = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: L */
    public C31859bb m35968L(int i11) {
        ArrayList arrayList = this.f38495r;
        if (arrayList != null && arrayList.size() > i11) {
            return (C31859bb) this.f38495r.get(i11);
        }
        return null;
    }

    /* renamed from: M */
    public List m35969M() {
        return this.f38495r;
    }

    /* renamed from: N */
    public int m35970N() {
        return this.f38503z;
    }

    /* renamed from: O */
    public int m35971O() {
        HashMap hashMap = this.f38493A;
        if (hashMap != null) {
            return hashMap.size();
        }
        return 0;
    }

    /* renamed from: P */
    public HashMap m35972P() {
        return this.f38493A;
    }

    /* renamed from: Q */
    public boolean m35973Q(int i11) {
        try {
            ArrayList arrayList = this.f38495r;
            if (arrayList != null && arrayList.size() > i11) {
                return ((C31859bb) this.f38495r.get(i11)).m153146b();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: R */
    boolean m35974R(String str) {
        c cVar = this.f38500w;
        if (cVar != null) {
            return cVar.mo36007R3(str);
        }
        return false;
    }

    /* renamed from: S */
    boolean m35975S(String str) {
        c cVar = this.f38500w;
        if (cVar != null) {
            return cVar.mo36010g2(str);
        }
        return false;
    }

    /* renamed from: T */
    public boolean m35976T(int i11) {
        try {
            return m35968L(i11).m153147c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: U */
    boolean m35977U(String str) {
        HashMap hashMap = this.f38493A;
        if (hashMap != null && hashMap.containsKey(str)) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        try {
            C31859bb m35968L = m35968L(i11);
            if (m35968L != null) {
                aVar.mo35990i0(m35968L, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        View inflate;
        switch (i11) {
            case 1:
            case 2:
                return new d(this.f38499v.inflate(AbstractC7409c0.layout_request_suggest_row, viewGroup, false), i11, this.f38498u);
            case 3:
                inflate = this.f38499v.inflate(AbstractC7409c0.item_list_header_row, viewGroup, false);
                return new b(inflate, i11, this.f38498u);
            case 4:
                inflate = this.f38499v.inflate(AbstractC7409c0.item_see_more_global_search, viewGroup, false);
                return new b(inflate, i11, this.f38498u);
            case 5:
                inflate = this.f38499v.inflate(AbstractC7409c0.suggest_seperate_line, viewGroup, false);
                return new b(inflate, i11, this.f38498u);
            case 6:
                inflate = this.f38499v.inflate(AbstractC7409c0.suggest_title_layout, viewGroup, false);
                return new b(inflate, i11, this.f38498u);
            case 7:
            case 8:
                inflate = this.f38499v.inflate(AbstractC7409c0.footer_loading, viewGroup, false);
                return new b(inflate, i11, this.f38498u);
            case 9:
                inflate = this.f38499v.inflate(AbstractC7409c0.item_open_request_friend, viewGroup, false);
                return new b(inflate, i11, this.f38498u);
            case 10:
                inflate = this.f38499v.inflate(AbstractC7409c0.item_find_more_friend_suggest, viewGroup, false);
                return new b(inflate, i11, this.f38498u);
            default:
                inflate = this.f38499v.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
                return new b(inflate, i11, this.f38498u);
        }
    }

    /* renamed from: X */
    public void m35980X() {
        this.f38493A.clear();
        m10008p();
    }

    /* renamed from: Y */
    public void m35981Y() {
        boolean z11 = false;
        for (int i11 = 0; i11 < this.f38495r.size(); i11++) {
            C31874cb m153145a = ((C31859bb) this.f38495r.get(i11)).m153145a();
            if (m153145a != null && !this.f38493A.containsKey(m153145a.f146385a)) {
                this.f38493A.put(m153145a.f146385a, m153145a);
                z11 = true;
            }
        }
        if (z11) {
            m10008p();
        }
    }

    /* renamed from: Z */
    public void m35982Z(ArrayList arrayList) {
        this.f38495r = new ArrayList(arrayList);
        this.f38503z = 0;
        for (int i11 = 0; i11 < this.f38495r.size(); i11++) {
            C31859bb c31859bb = (C31859bb) this.f38495r.get(i11);
            if (c31859bb != null && c31859bb.m153145a() != null) {
                this.f38503z++;
            }
        }
    }

    /* renamed from: a0 */
    public void m35983a0(c cVar) {
        this.f38500w = cVar;
    }

    /* renamed from: b0 */
    public void m35984b0(boolean z11) {
        this.f38502y = z11;
    }

    /* renamed from: c0 */
    public void m35985c0(List list) {
        this.f38497t = new ArrayList(list);
    }

    /* renamed from: d0 */
    public void m35986d0(List list) {
        this.f38496s = new ArrayList(list);
    }

    /* renamed from: e0 */
    public void m35987e0(boolean z11) {
        try {
            ArrayList arrayList = this.f38495r;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (z11) {
                    Iterator it = this.f38495r.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C31859bb) it.next()).f146290a == 7) {
                                break;
                            }
                        } else {
                            this.f38495r.add(new C31859bb(7, null));
                            break;
                        }
                    }
                } else {
                    int mo10003k = mo10003k();
                    int i11 = 0;
                    while (true) {
                        if (i11 < mo10003k) {
                            if (((C31859bb) this.f38495r.get(i11)).f146290a == 7) {
                                break;
                            } else {
                                i11++;
                            }
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (i11 != -1) {
                        this.f38495r.remove(i11);
                    }
                }
                this.f38494B = z11;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f0 */
    public void m35988f0(boolean z11) {
        try {
            ArrayList arrayList = this.f38495r;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (z11) {
                    Iterator it = this.f38495r.iterator();
                    while (it.hasNext()) {
                        if (((C31859bb) it.next()).f146290a == 6) {
                            return;
                        }
                    }
                    this.f38495r.add(new C31859bb(6, null));
                    return;
                }
                int mo10003k = mo10003k();
                int i11 = 0;
                while (true) {
                    if (i11 < mo10003k) {
                        if (((C31859bb) this.f38495r.get(i11)).f146290a == 6) {
                            break;
                        } else {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 != -1) {
                    this.f38495r.remove(i11);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g0 */
    public void m35989g0(String str, C31874cb c31874cb) {
        try {
            if (this.f38493A.containsKey(str)) {
                this.f38493A.remove(str);
            } else {
                this.f38493A.put(str, c31874cb);
            }
            m10008p();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        ArrayList arrayList = this.f38495r;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        ArrayList arrayList;
        try {
            arrayList = this.f38495r;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
        if (arrayList == null) {
            return 0;
        }
        switch (((C31859bb) arrayList.get(i11)).f146290a) {
            case 0:
                if (m35973Q(i11)) {
                    if (m35976T(i11)) {
                        return 2;
                    }
                    return 1;
                }
                return 3;
            case 1:
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
        e11.printStackTrace();
        return 0;
    }
}
