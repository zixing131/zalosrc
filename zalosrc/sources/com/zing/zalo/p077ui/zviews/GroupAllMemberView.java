package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import am.C0943w;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.GroupAllMemberView;
import com.zing.zalo.p077ui.zviews.ManageMembersView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i70.C20380b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23262x6;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p085ct.C17572a;
import p205hc.C19965d;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p542ub.InterfaceC27218a;
import p656xs.AbstractC30201b;
import p656xs.C30202c;
import p716zh.C31973j5;
import p716zh.C32076q5;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25378x;
import vg.C28203u6;
import xb0.C29572a;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class GroupAllMemberView extends BaseGroupMemberView implements InterfaceC0733x {
    public static final C14307a Companion = new C14307a(null);

    /* renamed from: N1 */
    private static int f73547N1 = 1000;

    /* renamed from: H1 */
    public int f73549H1;

    /* renamed from: I1 */
    public boolean f73550I1;

    /* renamed from: G1 */
    private final InterfaceC24854k f73548G1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C17572a.class), new C14312f(new C14311e(this)), C14314h.f73562q);

    /* renamed from: J1 */
    public String f73551J1 = "";

    /* renamed from: K1 */
    private ArrayList f73552K1 = new ArrayList();

    /* renamed from: L1 */
    private InterfaceC0765j f73553L1 = new C0766k();

    /* renamed from: M1 */
    private InterfaceC20094a f73554M1 = new C14309c();

    /* renamed from: com.zing.zalo.ui.zviews.GroupAllMemberView$a */
    /* loaded from: classes6.dex */
    public static final class C14307a {
        private C14307a() {
        }

        public /* synthetic */ C14307a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m79918a() {
            return GroupAllMemberView.f73547N1;
        }

        /* renamed from: b */
        public final GroupAllMemberView m79919b(Bundle bundle) {
            GroupAllMemberView groupAllMemberView = new GroupAllMemberView();
            groupAllMemberView.mo60305zK(bundle);
            return groupAllMemberView;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupAllMemberView$b */
    /* loaded from: classes6.dex */
    public static final class C14308b extends ClickableSpan {

        /* renamed from: q */
        final /* synthetic */ boolean f73556q;

        C14308b(boolean z11) {
            this.f73556q = z11;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c = GroupAllMemberView.this.f72344y1;
            if (interfaceC6939c != null) {
                interfaceC6939c.mo35653f(this.f73556q, "gr_member_manage");
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(GroupAllMemberView.this.getContext(), AbstractC16781w.LinkColor));
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupAllMemberView$c */
    /* loaded from: classes6.dex */
    public static final class C14309c implements InterfaceC20094a {
        C14309c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m79921d(GroupAllMemberView groupAllMemberView, C20096c c20096c) {
            MultiStateView.EnumC15915f enumC15915f;
            int i11;
            AbstractC19074t.m100208f(groupAllMemberView, "this$0");
            AbstractC19074t.m100208f(c20096c, "$this_apply");
            try {
                if (groupAllMemberView.m78410hN().f137468t.getVisibility() != 8 && groupAllMemberView.m78410hN().f137468t.getState() == MultiStateView.EnumC15914e.ERROR) {
                    return;
                }
                groupAllMemberView.mo78422yN(false);
                MultiStateView multiStateView = groupAllMemberView.m78410hN().f137468t;
                multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
                if (c20096c.m104491c() == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView.setErrorType(enumC15915f);
                if (c20096c.m104491c() == 50001) {
                    i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i11 = AbstractC8020f0.str_tv_loadingMemberList_error;
                }
                multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            GroupAllMemberView.this.m78418sN();
            try {
                final GroupAllMemberView groupAllMemberView = GroupAllMemberView.this;
                groupAllMemberView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.hh
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupAllMemberView.C14309c.m79921d(GroupAllMemberView.this, c20096c);
                    }
                });
                GroupAllMemberView.this.f72325C1 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:178:0x0331 A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:99:0x0251, B:103:0x024e, B:132:0x0264, B:134:0x0272, B:136:0x0285, B:138:0x029c, B:140:0x02a7, B:153:0x0316, B:165:0x0313, B:175:0x0323, B:176:0x032b, B:178:0x0331, B:181:0x033b, B:184:0x033f, B:187:0x034d, B:191:0x0369, B:209:0x037c, B:197:0x0382, B:202:0x0385, B:203:0x03d2, B:217:0x0390, B:221:0x03ac, B:236:0x03bf, B:227:0x03c5, B:232:0x03c8, B:247:0x03d6, B:249:0x03dc, B:251:0x03ea, B:253:0x03f1, B:254:0x040b, B:256:0x0417, B:257:0x042f, B:260:0x044b, B:262:0x0451, B:263:0x0457, B:264:0x045c, B:267:0x02a3), top: B:102:0x024e }] */
        /* JADX WARN: Removed duplicated region for block: B:249:0x03dc A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:99:0x0251, B:103:0x024e, B:132:0x0264, B:134:0x0272, B:136:0x0285, B:138:0x029c, B:140:0x02a7, B:153:0x0316, B:165:0x0313, B:175:0x0323, B:176:0x032b, B:178:0x0331, B:181:0x033b, B:184:0x033f, B:187:0x034d, B:191:0x0369, B:209:0x037c, B:197:0x0382, B:202:0x0385, B:203:0x03d2, B:217:0x0390, B:221:0x03ac, B:236:0x03bf, B:227:0x03c5, B:232:0x03c8, B:247:0x03d6, B:249:0x03dc, B:251:0x03ea, B:253:0x03f1, B:254:0x040b, B:256:0x0417, B:257:0x042f, B:260:0x044b, B:262:0x0451, B:263:0x0457, B:264:0x045c, B:267:0x02a3), top: B:102:0x024e }] */
        /* JADX WARN: Removed duplicated region for block: B:262:0x0451 A[Catch: Exception -> 0x0261, TryCatch #16 {Exception -> 0x0261, blocks: (B:99:0x0251, B:103:0x024e, B:132:0x0264, B:134:0x0272, B:136:0x0285, B:138:0x029c, B:140:0x02a7, B:153:0x0316, B:165:0x0313, B:175:0x0323, B:176:0x032b, B:178:0x0331, B:181:0x033b, B:184:0x033f, B:187:0x034d, B:191:0x0369, B:209:0x037c, B:197:0x0382, B:202:0x0385, B:203:0x03d2, B:217:0x0390, B:221:0x03ac, B:236:0x03bf, B:227:0x03c5, B:232:0x03c8, B:247:0x03d6, B:249:0x03dc, B:251:0x03ea, B:253:0x03f1, B:254:0x040b, B:256:0x0417, B:257:0x042f, B:260:0x044b, B:262:0x0451, B:263:0x0457, B:264:0x045c, B:267:0x02a3), top: B:102:0x024e }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            C14309c c14309c;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            boolean z11;
            String str;
            String str2;
            String str3;
            String str4;
            JSONObject jSONObject3;
            Iterator it;
            GroupAllMemberView groupAllMemberView;
            GroupAllMemberView groupAllMemberView2;
            boolean z12;
            boolean z13;
            boolean z14;
            ContactProfile contactProfile;
            String obj2;
            int i11;
            boolean z15;
            int i12;
            boolean z16;
            boolean z17;
            JSONArray jSONArray;
            String str5;
            String str6;
            Object obj3;
            JSONArray jSONArray2;
            int i13;
            JSONObject jSONObject4;
            String str7;
            String str8;
            String str9;
            String str10;
            GroupAllMemberView groupAllMemberView3;
            String sb2;
            String optString;
            ContactProfile contactProfile2;
            JSONArray jSONArray3;
            int i14;
            JSONObject jSONObject5;
            GroupAllMemberView groupAllMemberView4;
            String sb3;
            String optString2;
            ContactProfile contactProfile3;
            C14309c c14309c2 = this;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                jSONObject = new JSONObject(obj.toString());
                jSONObject2 = jSONObject.getJSONObject("data");
            } catch (Exception e11) {
                e = e11;
                c14309c = c14309c2;
            }
            if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                GroupAllMemberView groupAllMemberView5 = GroupAllMemberView.this;
                if (groupAllMemberView5.f72323A1 == 0) {
                    groupAllMemberView5.f72337r1.clear();
                    GroupAllMemberView.this.f72330k1.clear();
                    GroupAllMemberView groupAllMemberView6 = GroupAllMemberView.this;
                    int optInt = jSONObject2.optInt("ownerId");
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(optInt);
                    groupAllMemberView6.f72342w1 = sb4.toString();
                }
                GroupAllMemberView groupAllMemberView7 = GroupAllMemberView.this;
                if (jSONObject2.optInt("hasMore") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                groupAllMemberView7.f72345z1 = z11;
                GroupAllMemberView.this.f72324B1 = jSONObject2.optInt("lastId");
                JSONArray optJSONArray = jSONObject2.optJSONArray("adminMembers");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                JSONArray jSONArray4 = optJSONArray;
                int length = jSONArray4.length();
                int i15 = 0;
                while (true) {
                    str = "ts";
                    str2 = "src";
                    str3 = "typeContact";
                    str4 = "null cannot be cast to non-null type org.json.JSONObject";
                    if (i15 >= length) {
                        break;
                    }
                    try {
                        Object obj4 = jSONArray4.get(i15);
                        AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type org.json.JSONObject");
                        jSONObject5 = (JSONObject) obj4;
                        groupAllMemberView4 = GroupAllMemberView.this;
                        int optInt2 = jSONObject5.optInt("uid");
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(optInt2);
                        sb3 = sb5.toString();
                        optString2 = jSONObject5.optString("dpn");
                        jSONArray3 = jSONArray4;
                    } catch (Exception e12) {
                        e = e12;
                        jSONArray3 = jSONArray4;
                    }
                    try {
                        String optString3 = jSONObject5.optString("avt");
                        int optInt3 = jSONObject5.optInt("typeContact");
                        if (!TextUtils.isEmpty(sb3)) {
                            i14 = length;
                            try {
                                if (!groupAllMemberView4.f72330k1.containsKey(sb3)) {
                                    GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                                    if (AbstractC19074t.m100204b(groupAllMemberView4.f72342w1, sb3)) {
                                        c6938b.f38025e = true;
                                    } else {
                                        c6938b.f38027g = true;
                                    }
                                    ContactProfile m78411iN = groupAllMemberView4.m78411iN(sb3, optString2, optString3, optInt3);
                                    c6938b.f38022b = m78411iN;
                                    c6938b.f38026f = AbstractC30201b.m148949b(groupAllMemberView4.f72357R0, m78411iN);
                                    JSONObject optJSONObject = jSONObject5.optJSONObject("inviteInfo");
                                    if (optJSONObject != null) {
                                        ContactProfile contactProfile4 = new ContactProfile();
                                        int optInt4 = optJSONObject.optInt("uid");
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append(optInt4);
                                        contactProfile4.f42434r = sb6.toString();
                                        contactProfile4.f42437s = optJSONObject.optString("dpn");
                                        contactProfile4.f42446v = optJSONObject.optString("avt");
                                        contactProfile4.f42376S0 = optJSONObject.optInt("src");
                                        contactProfile4.f42330D = optJSONObject.optInt("ts");
                                        contactProfile3 = contactProfile4;
                                    } else {
                                        contactProfile3 = null;
                                    }
                                    c6938b.f38023c = contactProfile3;
                                    groupAllMemberView4.f72337r1.add(c6938b);
                                    groupAllMemberView4.f72330k1.put(sb3, c6938b);
                                }
                            } catch (Exception e13) {
                                e = e13;
                                try {
                                    AbstractC23350e.m122778h(e);
                                    i15++;
                                    c14309c2 = this;
                                    jSONArray4 = jSONArray3;
                                    length = i14;
                                } catch (Exception e14) {
                                    e = e14;
                                    c14309c = this;
                                }
                            }
                        } else {
                            i14 = length;
                        }
                        C19637j.f97466a.m102837T(sb3, jSONObject5);
                    } catch (Exception e15) {
                        e = e15;
                        i14 = length;
                        AbstractC23350e.m122778h(e);
                        i15++;
                        c14309c2 = this;
                        jSONArray4 = jSONArray3;
                        length = i14;
                    }
                    i15++;
                    c14309c2 = this;
                    jSONArray4 = jSONArray3;
                    length = i14;
                    e = e14;
                    c14309c = this;
                    AbstractC23350e.m122778h(e);
                    GroupAllMemberView.this.m78418sN();
                    return;
                }
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("currentMems");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                JSONArray jSONArray5 = optJSONArray2;
                int length2 = jSONArray5.length();
                int i16 = 0;
                while (i16 < length2) {
                    try {
                        Object obj5 = jSONArray5.get(i16);
                        AbstractC19074t.m100206d(obj5, str4);
                        JSONObject jSONObject6 = (JSONObject) obj5;
                        c14309c = this;
                        try {
                            groupAllMemberView3 = GroupAllMemberView.this;
                            int optInt5 = jSONObject6.optInt("uid");
                            jSONArray2 = jSONArray5;
                            try {
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(optInt5);
                                sb2 = sb7.toString();
                                optString = jSONObject6.optString("dpn");
                                i13 = length2;
                            } catch (Exception e16) {
                                e = e16;
                                i13 = length2;
                                jSONObject4 = jSONObject2;
                                str7 = str2;
                                str8 = str3;
                                str9 = str4;
                                str10 = str;
                                try {
                                    AbstractC23350e.m122778h(e);
                                    i16++;
                                    str2 = str7;
                                    str = str10;
                                    jSONArray5 = jSONArray2;
                                    length2 = i13;
                                    str4 = str9;
                                    str3 = str8;
                                    jSONObject2 = jSONObject4;
                                } catch (Exception e17) {
                                    e = e17;
                                }
                            }
                        } catch (Exception e18) {
                            e = e18;
                            jSONArray2 = jSONArray5;
                            i13 = length2;
                            jSONObject4 = jSONObject2;
                            str7 = str2;
                            str8 = str3;
                            str9 = str4;
                            str10 = str;
                            AbstractC23350e.m122778h(e);
                            i16++;
                            str2 = str7;
                            str = str10;
                            jSONArray5 = jSONArray2;
                            length2 = i13;
                            str4 = str9;
                            str3 = str8;
                            jSONObject2 = jSONObject4;
                        }
                        try {
                            String optString4 = jSONObject6.optString("avt");
                            str9 = str4;
                            try {
                                int optInt6 = jSONObject6.optInt(str3);
                                if (!TextUtils.isEmpty(sb2)) {
                                    str8 = str3;
                                    try {
                                        if (!groupAllMemberView3.f72330k1.containsKey(sb2)) {
                                            jSONObject4 = jSONObject2;
                                            try {
                                                GroupFullMemberAdapter.C6938b c6938b2 = new GroupFullMemberAdapter.C6938b(0);
                                                c6938b2.f38025e = AbstractC19074t.m100204b(groupAllMemberView3.f72342w1, sb2);
                                                ContactProfile m78411iN2 = groupAllMemberView3.m78411iN(sb2, optString, optString4, optInt6);
                                                c6938b2.f38022b = m78411iN2;
                                                c6938b2.f38026f = AbstractC30201b.m148949b(groupAllMemberView3.f72357R0, m78411iN2);
                                                JSONObject optJSONObject2 = jSONObject6.optJSONObject("inviteInfo");
                                                if (optJSONObject2 != null) {
                                                    contactProfile2 = new ContactProfile();
                                                    int optInt7 = optJSONObject2.optInt("uid");
                                                    StringBuilder sb8 = new StringBuilder();
                                                    sb8.append(optInt7);
                                                    contactProfile2.f42434r = sb8.toString();
                                                    contactProfile2.f42437s = optJSONObject2.optString("dpn");
                                                    contactProfile2.f42446v = optJSONObject2.optString("avt");
                                                    contactProfile2.f42376S0 = optJSONObject2.optInt(str2);
                                                    str10 = str;
                                                    str7 = str2;
                                                    try {
                                                        contactProfile2.f42330D = optJSONObject2.optInt(str);
                                                    } catch (Exception e19) {
                                                        e = e19;
                                                        AbstractC23350e.m122778h(e);
                                                        i16++;
                                                        str2 = str7;
                                                        str = str10;
                                                        jSONArray5 = jSONArray2;
                                                        length2 = i13;
                                                        str4 = str9;
                                                        str3 = str8;
                                                        jSONObject2 = jSONObject4;
                                                    }
                                                } else {
                                                    str10 = str;
                                                    str7 = str2;
                                                    contactProfile2 = null;
                                                }
                                                c6938b2.f38023c = contactProfile2;
                                                groupAllMemberView3.f72337r1.add(c6938b2);
                                                groupAllMemberView3.f72330k1.put(sb2, c6938b2);
                                            } catch (Exception e21) {
                                                e = e21;
                                                str10 = str;
                                                str7 = str2;
                                                AbstractC23350e.m122778h(e);
                                                i16++;
                                                str2 = str7;
                                                str = str10;
                                                jSONArray5 = jSONArray2;
                                                length2 = i13;
                                                str4 = str9;
                                                str3 = str8;
                                                jSONObject2 = jSONObject4;
                                            }
                                        } else {
                                            jSONObject4 = jSONObject2;
                                            str10 = str;
                                            str7 = str2;
                                        }
                                    } catch (Exception e22) {
                                        e = e22;
                                        jSONObject4 = jSONObject2;
                                    }
                                } else {
                                    jSONObject4 = jSONObject2;
                                    str10 = str;
                                    str7 = str2;
                                    str8 = str3;
                                }
                                C19637j.f97466a.m102837T(sb2, jSONObject6);
                            } catch (Exception e23) {
                                e = e23;
                                jSONObject4 = jSONObject2;
                                str10 = str;
                                str7 = str2;
                                str8 = str3;
                            }
                        } catch (Exception e24) {
                            e = e24;
                            jSONObject4 = jSONObject2;
                            str7 = str2;
                            str8 = str3;
                            str9 = str4;
                            str10 = str;
                            AbstractC23350e.m122778h(e);
                            i16++;
                            str2 = str7;
                            str = str10;
                            jSONArray5 = jSONArray2;
                            length2 = i13;
                            str4 = str9;
                            str3 = str8;
                            jSONObject2 = jSONObject4;
                        }
                    } catch (Exception e25) {
                        e = e25;
                        c14309c = this;
                    }
                    i16++;
                    str2 = str7;
                    str = str10;
                    jSONArray5 = jSONArray2;
                    length2 = i13;
                    str4 = str9;
                    str3 = str8;
                    jSONObject2 = jSONObject4;
                }
                c14309c = this;
                JSONObject jSONObject7 = jSONObject2;
                String str11 = str3;
                String str12 = str4;
                GroupAllMemberView groupAllMemberView8 = GroupAllMemberView.this;
                if (groupAllMemberView8.f72323A1 == 0) {
                    groupAllMemberView8.m79911dO().clear();
                    C32076q5 m4476k = C0943w.f3447a.m4476k(GroupAllMemberView.this.f72339t1);
                    if (m4476k != null) {
                        GroupAllMemberView groupAllMemberView9 = GroupAllMemberView.this;
                        boolean z18 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
                        jSONObject3 = jSONObject7;
                        JSONArray optJSONArray3 = jSONObject3.optJSONArray("suggestMembers");
                        if (optJSONArray3 == null) {
                            optJSONArray3 = new JSONArray();
                        } else {
                            AbstractC19074t.m100205c(optJSONArray3);
                        }
                        JSONArray jSONArray6 = optJSONArray3;
                        int length3 = jSONArray6.length();
                        int i17 = 0;
                        while (i17 < length3) {
                            try {
                                obj3 = jSONArray6.get(i17);
                                str5 = str12;
                            } catch (Exception e26) {
                                e = e26;
                                z17 = z18;
                                jSONArray = jSONArray6;
                                str5 = str12;
                            }
                            try {
                                AbstractC19074t.m100206d(obj3, str5);
                                JSONObject jSONObject8 = (JSONObject) obj3;
                                if (z18 && C21927m.m114302u().m114345m(jSONObject8.optString("uid"))) {
                                    z17 = z18;
                                    jSONArray = jSONArray6;
                                    str6 = str11;
                                } else {
                                    String optString5 = jSONObject8.optString("uid");
                                    String optString6 = jSONObject8.optString("dpn");
                                    String optString7 = jSONObject8.optString("avt");
                                    z17 = z18;
                                    jSONArray = jSONArray6;
                                    str6 = str11;
                                    try {
                                        int optInt8 = jSONObject8.optInt(str6);
                                        AbstractC19074t.m100205c(optString5);
                                        ContactProfile m78411iN3 = groupAllMemberView9.m78411iN(optString5, optString6, optString7, optInt8);
                                        if (groupAllMemberView9.m79894cO(optString5, m4476k)) {
                                            groupAllMemberView9.m79911dO().add(m78411iN3);
                                        }
                                        C19637j.f97466a.m102837T(optString5, jSONObject8);
                                    } catch (Exception e27) {
                                        e = e27;
                                        AbstractC23350e.m122778h(e);
                                        i17++;
                                        str11 = str6;
                                        str12 = str5;
                                        jSONArray6 = jSONArray;
                                        z18 = z17;
                                    }
                                }
                            } catch (Exception e28) {
                                e = e28;
                                z17 = z18;
                                jSONArray = jSONArray6;
                                str6 = str11;
                                AbstractC23350e.m122778h(e);
                                i17++;
                                str11 = str6;
                                str12 = str5;
                                jSONArray6 = jSONArray;
                                z18 = z17;
                            }
                            i17++;
                            str11 = str6;
                            str12 = str5;
                            jSONArray6 = jSONArray;
                            z18 = z17;
                        }
                        it = GroupAllMemberView.this.f72337r1.iterator();
                        while (it.hasNext()) {
                            GroupFullMemberAdapter.C6938b c6938b3 = (GroupFullMemberAdapter.C6938b) it.next();
                            if (c6938b3.f38021a == 0 && (contactProfile = c6938b3.f38022b) != null) {
                                if (AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
                                    String m120002o = AbstractC23262x6.m120002o(AbstractC23136l9.m118743r0(AbstractC8020f0.str_you));
                                    AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                                    int length4 = m120002o.length() - 1;
                                    boolean z19 = false;
                                    int i18 = 0;
                                    while (i18 <= length4) {
                                        if (!z19) {
                                            i12 = i18;
                                        } else {
                                            i12 = length4;
                                        }
                                        if (AbstractC19074t.m100209g(m120002o.charAt(i12), 32) <= 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (!z19) {
                                            if (!z16) {
                                                z19 = true;
                                            } else {
                                                i18++;
                                            }
                                        } else if (!z16) {
                                            break;
                                        } else {
                                            length4--;
                                        }
                                    }
                                    obj2 = m120002o.subSequence(i18, length4 + 1).toString();
                                } else {
                                    String m120002o2 = AbstractC23262x6.m120002o(contactProfile.m40383Q(true, false));
                                    AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
                                    int length5 = m120002o2.length() - 1;
                                    int i19 = 0;
                                    boolean z21 = false;
                                    while (i19 <= length5) {
                                        if (!z21) {
                                            i11 = i19;
                                        } else {
                                            i11 = length5;
                                        }
                                        if (AbstractC19074t.m100209g(m120002o2.charAt(i11), 32) <= 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (!z21) {
                                            if (!z15) {
                                                z21 = true;
                                            } else {
                                                i19++;
                                            }
                                        } else if (!z15) {
                                            break;
                                        } else {
                                            length5--;
                                        }
                                    }
                                    obj2 = m120002o2.subSequence(i19, length5 + 1).toString();
                                }
                                contactProfile.f42440t = obj2;
                            }
                        }
                        groupAllMemberView = GroupAllMemberView.this;
                        if (groupAllMemberView.f72323A1 == 0) {
                            groupAllMemberView.f73549H1 = jSONObject3.optInt("totalMembers");
                            C31973j5 c31973j5 = GroupAllMemberView.this.f72357R0;
                            if (c31973j5 != null && c31973j5.m153742T()) {
                                GroupFullMemberAdapter.C6938b c6938b4 = new GroupFullMemberAdapter.C6938b(7);
                                GroupAllMemberView groupAllMemberView10 = GroupAllMemberView.this;
                                c6938b4.f38028h = groupAllMemberView10.f72357R0.m153713E();
                                groupAllMemberView10.f72337r1.add(c6938b4);
                                z12 = true;
                                z13 = true;
                            } else {
                                z12 = false;
                                z13 = false;
                            }
                            if (GroupAllMemberView.this.m79911dO().size() > 0) {
                                GroupFullMemberAdapter.C6938b c6938b5 = new GroupFullMemberAdapter.C6938b(6);
                                GroupAllMemberView groupAllMemberView11 = GroupAllMemberView.this;
                                c6938b5.f38029i = groupAllMemberView11.m79911dO();
                                c6938b5.f38034n = z13;
                                groupAllMemberView11.f72337r1.add(c6938b5);
                                z14 = true;
                            } else {
                                z14 = z12;
                            }
                            GroupFullMemberAdapter.C6938b c6938b6 = new GroupFullMemberAdapter.C6938b(5);
                            GroupAllMemberView groupAllMemberView12 = GroupAllMemberView.this;
                            c6938b6.f38030j = groupAllMemberView12.f73549H1;
                            c6938b6.f38035o = z14;
                            groupAllMemberView12.f72337r1.add(c6938b6);
                            GroupAllMemberView groupAllMemberView13 = GroupAllMemberView.this;
                            Collections.sort(groupAllMemberView13.f72337r1, groupAllMemberView13.f72343x1);
                        }
                        groupAllMemberView2 = GroupAllMemberView.this;
                        if (groupAllMemberView2.f72345z1) {
                            groupAllMemberView2.f72323A1++;
                        }
                        groupAllMemberView2.mo79914vO();
                    }
                }
                jSONObject3 = jSONObject7;
                it = GroupAllMemberView.this.f72337r1.iterator();
                while (it.hasNext()) {
                }
                groupAllMemberView = GroupAllMemberView.this;
                if (groupAllMemberView.f72323A1 == 0) {
                }
                groupAllMemberView2 = GroupAllMemberView.this;
                if (groupAllMemberView2.f72345z1) {
                }
                groupAllMemberView2.mo79914vO();
            } else {
                c14309c = c14309c2;
            }
            GroupAllMemberView.this.f72325C1 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupAllMemberView$d */
    /* loaded from: classes6.dex */
    public static final class C14310d extends RecyclerView.AbstractC1892s {
        C14310d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            String str;
            int i12;
            boolean z11;
            Editable text;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        GroupFullMemberAdapter groupFullMemberAdapter = GroupAllMemberView.this.f72331l1;
                        if (groupFullMemberAdapter != null) {
                            groupFullMemberAdapter.m35636Q(true);
                        }
                        GroupAllMemberView groupAllMemberView = GroupAllMemberView.this;
                        if (groupAllMemberView.f73550I1) {
                            AbstractC2379w.m12430d(groupAllMemberView.f72332m1);
                            GroupAllMemberView.this.f73550I1 = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                GroupFullMemberAdapter groupFullMemberAdapter2 = GroupAllMemberView.this.f72331l1;
                if (groupFullMemberAdapter2 != null) {
                    groupFullMemberAdapter2.m35636Q(false);
                    groupFullMemberAdapter2.m10008p();
                }
                LinearLayoutManager linearLayoutManager = GroupAllMemberView.this.f72333n1;
                AbstractC19074t.m100205c(linearLayoutManager);
                int m10127i = linearLayoutManager.m10127i();
                LinearLayoutManager linearLayoutManager2 = GroupAllMemberView.this.f72333n1;
                AbstractC19074t.m100205c(linearLayoutManager2);
                int m9745c2 = linearLayoutManager2.m9745c2();
                EditText editText = GroupAllMemberView.this.f72332m1;
                if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                    str = "";
                }
                int length = str.length() - 1;
                int i13 = 0;
                boolean z12 = false;
                while (i13 <= length) {
                    if (!z12) {
                        i12 = i13;
                    } else {
                        i12 = length;
                    }
                    if (AbstractC19074t.m100209g(str.charAt(i12), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z12) {
                        if (!z11) {
                            z12 = true;
                        } else {
                            i13++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (TextUtils.isEmpty(str.subSequence(i13, length + 1).toString()) && m9745c2 >= m10127i - 2) {
                    GroupAllMemberView groupAllMemberView2 = GroupAllMemberView.this;
                    if (!groupAllMemberView2.f72325C1 && groupAllMemberView2.f72345z1) {
                        groupAllMemberView2.mo78412jN();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupAllMemberView$e */
    /* loaded from: classes6.dex */
    public static final class C14311e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f73559q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14311e(ZaloView zaloView) {
            super(0);
            this.f73559q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f73559q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupAllMemberView$f */
    /* loaded from: classes6.dex */
    public static final class C14312f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f73560q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14312f(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f73560q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f73560q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupAllMemberView$g */
    /* loaded from: classes6.dex */
    public static final class C14313g extends AbstractC19075u implements InterfaceC18505l {
        C14313g() {
            super(1);
        }

        /* renamed from: a */
        public final void m79924a(boolean z11) {
            if (z11) {
                GroupAllMemberView.this.f72421L0.mo46829Y();
            } else {
                GroupAllMemberView.this.f72421L0.mo49315c4();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m79924a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupAllMemberView$h */
    /* loaded from: classes6.dex */
    static final class C14314h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C14314h f73562q = new C14314h();

        C14314h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C17572a.a();
        }
    }

    /* renamed from: N5 */
    private final void m79881N5(int i11) {
        int size = this.f72337r1.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((GroupFullMemberAdapter.C6938b) this.f72337r1.get(i12)).f38021a == 5) {
                ((GroupFullMemberAdapter.C6938b) this.f72337r1.get(i12)).f38030j = i11;
                return;
            }
        }
    }

    /* renamed from: aO */
    private final CharSequence m79892aO(String str, boolean z11) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + ". ");
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_lock_view_members_change_setting);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m118743r0);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new C14308b(z11), length, length2, 33);
        spannableStringBuilder.setSpan(new C29572a(Typeface.DEFAULT_BOLD), length, length2, 33);
        return spannableStringBuilder;
    }

    /* renamed from: bO */
    private final void m79893bO(GroupFullMemberAdapter.C6938b c6938b, C31973j5 c31973j5) {
        int i11;
        String m118743r0;
        int i12;
        boolean m153742T = c31973j5.m153742T();
        boolean m153768k0 = c31973j5.m153768k0();
        boolean m153747Y = c31973j5.m153747Y();
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_chat_info_participant_header, Integer.valueOf(c6938b.f38030j));
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        c6938b.f38031k = m118746s0;
        CharSequence charSequence = "";
        if (C30202c.f140315a.m148952c(c31973j5)) {
            if (m153742T) {
                if (m153768k0) {
                    if (m153747Y) {
                        i12 = AbstractC8020f0.str_community_view_member_owner_admin;
                    } else {
                        i12 = AbstractC8020f0.str_view_members_for_admins;
                    }
                    m118743r0 = AbstractC23136l9.m118743r0(i12);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_members_for_all);
                }
                AbstractC19074t.m100205c(m118743r0);
                charSequence = m79892aO(m118743r0, m153768k0);
            } else if (m153768k0) {
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                if (m153747Y) {
                    i11 = AbstractC8020f0.str_community_view_member_owner_admin;
                } else {
                    i11 = AbstractC8020f0.str_view_members_for_admins;
                }
                String m118743r02 = AbstractC23136l9.m118743r0(i11);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                charSequence = C20380b.m106165d(m92689tK, this, m118743r02, "gr_member_list", null, 16, null);
            }
        }
        c6938b.f38032l = charSequence;
        c6938b.f38033m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cO */
    public final boolean m79894cO(String str, C32076q5 c32076q5) {
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str) && !AbstractC21935u.m114515E(str) && !AbstractC21935u.m114536c(str) && c32076q5 != null && !c32076q5.m154725n(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: eO */
    private final C17572a m79895eO() {
        return (C17572a) this.f73548G1.getValue();
    }

    /* renamed from: fO */
    private final boolean m79896fO(C31973j5 c31973j5) {
        if (!c31973j5.m153742T() && (c31973j5.m153732O() >= AbstractC23309i.m122459u8() || (C30202c.f140315a.m148952c(c31973j5) && c31973j5.m153768k0()))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gO */
    public static final void m79897gO(GroupAllMemberView groupAllMemberView, C31973j5 c31973j5, InterfaceC17463d interfaceC17463d, int i11) {
        C17487o0 c17487o0;
        AbstractC19074t.m100208f(groupAllMemberView, "this$0");
        AbstractC19074t.m100208f(c31973j5, "$group");
        if (!groupAllMemberView.m79896fO(c31973j5)) {
            ToastUtils.m89266n(AbstractC8020f0.str_clone_existing_group_select_members_error_not_admin, new Object[0]);
        } else {
            Bundle bundle = new Bundle();
            bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 4);
            bundle.putString("extra_group_id", c31973j5.m153781r());
            if (c31973j5.m153768k0() && C30202c.f140315a.m148952c(c31973j5)) {
                bundle.putString("EXTRA_TITLE", AbstractC23136l9.m118743r0(AbstractC8020f0.str_clone_group_hide_members_title_for_admins));
            }
            bundle.putString("extra_preload_data", QuickCreateGroupView.m83234GM(1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_new_group_title_select_member)));
            InterfaceC27218a m92676n2 = groupAllMemberView.f72421L0.m92676n2();
            if (m92676n2 != null) {
                c17487o0 = m92676n2.mo35579p();
            } else {
                c17487o0 = null;
            }
            C17487o0 c17487o02 = c17487o0;
            if (c17487o02 != null) {
                c17487o02.m93066i2(QuickCreateGroupView.class, bundle, 0, 1, true);
            }
        }
        AbstractC23647d.m123897g("10300141");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hO */
    public static final void m79898hO(GroupAllMemberView groupAllMemberView) {
        String str;
        int i11;
        boolean z11;
        Editable text;
        AbstractC19074t.m100208f(groupAllMemberView, "this$0");
        try {
            ActionBar actionBar = groupAllMemberView.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_chat_group_member_title));
            }
            groupAllMemberView.m78421xN(AbstractC8020f0.str_emptyResult);
            groupAllMemberView.mo78422yN(false);
            EditText editText = groupAllMemberView.f72332m1;
            if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            int length = str.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(str.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            if (!TextUtils.isEmpty(str.subSequence(i12, length + 1).toString())) {
                EditText editText2 = groupAllMemberView.f72332m1;
                if (editText2 != null) {
                    editText2.setSelection(str.length());
                    return;
                }
                return;
            }
            GroupFullMemberAdapter groupFullMemberAdapter = groupAllMemberView.f72331l1;
            if (groupFullMemberAdapter != null) {
                groupFullMemberAdapter.m35635P(groupAllMemberView.f72336q1);
                groupFullMemberAdapter.m10008p();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: iO */
    private final void m79899iO() {
        int size = this.f72337r1.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((GroupFullMemberAdapter.C6938b) this.f72337r1.get(i11)).f38021a == 6) {
                this.f72337r1.remove(i11);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jO */
    public static final void m79900jO(GroupAllMemberView groupAllMemberView, RecyclerView recyclerView, int i11, View view) {
        GroupFullMemberAdapter.C6938b m35631L;
        AbstractC19074t.m100208f(groupAllMemberView, "this$0");
        try {
            groupAllMemberView.f72334o1 = i11;
            String str = groupAllMemberView.f72339t1;
            AbstractC19074t.m100205c(str);
            GroupFullMemberAdapter groupFullMemberAdapter = groupAllMemberView.f72331l1;
            if (groupFullMemberAdapter != null && (m35631L = groupFullMemberAdapter.m35631L(groupAllMemberView.f72334o1)) != null) {
                int i12 = m35631L.f38021a;
                if (i12 != 1) {
                    if (i12 != 6) {
                        if (i12 != 7) {
                            ContactProfile contactProfile = m35631L.f38022b;
                            if (contactProfile != null) {
                                if (!AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
                                    groupAllMemberView.f72326D1 = contactProfile;
                                    GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c = groupFullMemberAdapter.f38013z;
                                    if (interfaceC6939c != null) {
                                        groupAllMemberView.mo79917zO();
                                        interfaceC6939c.mo35657j(str, contactProfile, 1);
                                    }
                                } else {
                                    GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c2 = groupFullMemberAdapter.f38013z;
                                    if (interfaceC6939c2 != null) {
                                        groupAllMemberView.mo79916yO();
                                        String str2 = contactProfile.f42434r;
                                        AbstractC19074t.m100207e(str2, "uid");
                                        interfaceC6939c2.mo35659l(str2, str);
                                    }
                                }
                            }
                        } else {
                            GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c3 = groupFullMemberAdapter.f38013z;
                            if (interfaceC6939c3 != null) {
                                AbstractC23647d.m123897g("1591120");
                                interfaceC6939c3.mo35661n(str);
                            }
                        }
                    } else {
                        GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c4 = groupFullMemberAdapter.f38013z;
                        if (interfaceC6939c4 != null) {
                            AbstractC23647d.m123897g("1591117");
                            interfaceC6939c4.mo35662o(str, groupAllMemberView.f73552K1);
                        }
                    }
                } else {
                    GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c5 = groupFullMemberAdapter.f38013z;
                    if (interfaceC6939c5 != null) {
                        interfaceC6939c5.mo35651d(str, groupAllMemberView.f73552K1);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kO */
    public static final boolean m79901kO(GroupAllMemberView groupAllMemberView, RecyclerView recyclerView, int i11, View view) {
        GroupFullMemberAdapter.C6938b m35631L;
        ContactProfile contactProfile;
        AbstractC19074t.m100208f(groupAllMemberView, "this$0");
        groupAllMemberView.f72334o1 = i11;
        String str = groupAllMemberView.f72339t1;
        AbstractC19074t.m100205c(str);
        GroupFullMemberAdapter groupFullMemberAdapter = groupAllMemberView.f72331l1;
        if (groupFullMemberAdapter != null && (m35631L = groupFullMemberAdapter.m35631L(groupAllMemberView.f72334o1)) != null && m35631L.f38021a == 0 && (contactProfile = m35631L.f38022b) != null && !AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
            groupAllMemberView.f72326D1 = contactProfile;
            GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c = groupFullMemberAdapter.f38013z;
            if (interfaceC6939c != null) {
                AbstractC23647d.m123897g("1591101");
                interfaceC6939c.mo35657j(str, contactProfile, 1);
            }
        }
        return true;
    }

    /* renamed from: lO */
    private final void m79902lO() {
        m79895eO().m93574R().m9219j(this, new C19965d(new C14313g()));
    }

    /* renamed from: mO */
    private final void m79903mO() {
        m79902lO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pO */
    public static final void m79904pO(ArrayList arrayList, GroupAllMemberView groupAllMemberView) {
        AbstractC19074t.m100208f(arrayList, "$uids");
        AbstractC19074t.m100208f(groupAllMemberView, "this$0");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!groupAllMemberView.f72330k1.containsKey(str)) {
                ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
                GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                c6938b.f38022b = m141798e;
                groupAllMemberView.f72337r1.add(c6938b);
                HashMap hashMap = groupAllMemberView.f72330k1;
                AbstractC19074t.m100205c(str);
                hashMap.put(str, c6938b);
            }
        }
        Collections.sort(groupAllMemberView.f72337r1, groupAllMemberView.f72343x1);
        groupAllMemberView.mo78416pN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qO */
    public static final void m79905qO(String str, GroupAllMemberView groupAllMemberView) {
        AbstractC19074t.m100208f(str, "$finalUid");
        AbstractC19074t.m100208f(groupAllMemberView, "$this_run");
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
        if (m141798e != null) {
            GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
            c6938b.f38022b = m141798e;
            groupAllMemberView.m78400KN(c6938b, true, false);
            groupAllMemberView.f72337r1.add(c6938b);
            groupAllMemberView.f72330k1.put(str, c6938b);
            Collections.sort(groupAllMemberView.f72337r1, groupAllMemberView.f72343x1);
            groupAllMemberView.mo78416pN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rO */
    public static final void m79906rO(String str, GroupAllMemberView groupAllMemberView) {
        AbstractC19074t.m100208f(str, "$uid");
        AbstractC19074t.m100208f(groupAllMemberView, "$this_run");
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
        if (m141798e != null) {
            groupAllMemberView.m78400KN((GroupFullMemberAdapter.C6938b) groupAllMemberView.f72330k1.get(groupAllMemberView.f72342w1), false, false);
            groupAllMemberView.f72342w1 = str;
            GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
            c6938b.f38022b = m141798e;
            groupAllMemberView.m78400KN(c6938b, true, false);
            groupAllMemberView.f72337r1.add(c6938b);
            groupAllMemberView.f72330k1.put(str, c6938b);
        }
        Collections.sort(groupAllMemberView.f72337r1, groupAllMemberView.f72343x1);
        groupAllMemberView.mo78416pN();
    }

    /* renamed from: sO */
    private final void m79907sO() {
        Iterator it = this.f72337r1.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            GroupFullMemberAdapter.C6938b c6938b = (GroupFullMemberAdapter.C6938b) it.next();
            if (c6938b.f38021a == 7) {
                C31973j5 m4472f = C0943w.f3447a.m4472f(this.f72339t1);
                this.f72357R0 = m4472f;
                if (m4472f != null) {
                    c6938b.f38028h = m4472f.m153713E();
                }
            }
        }
        mo78416pN();
    }

    /* renamed from: tO */
    private final void m79908tO() {
        int size = this.f73552K1.size() - 1;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                if (this.f72330k1.containsKey(((ContactProfile) this.f73552K1.get(size)).f42434r)) {
                    this.f73552K1.remove(size);
                }
                if (i11 < 0) {
                    break;
                } else {
                    size = i11;
                }
            }
        }
        if (this.f73552K1.size() == 0) {
            m79899iO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uO */
    public static final void m79909uO(ArrayList arrayList, GroupAllMemberView groupAllMemberView) {
        AbstractC19074t.m100208f(arrayList, "$listUnknownUid");
        AbstractC19074t.m100208f(groupAllMemberView, "this$0");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
            if (m141798e != null) {
                GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                c6938b.f38022b = m141798e;
                groupAllMemberView.m78400KN(c6938b, false, true);
                groupAllMemberView.f72337r1.add(c6938b);
                HashMap hashMap = groupAllMemberView.f72330k1;
                AbstractC19074t.m100205c(str);
                hashMap.put(str, c6938b);
            }
        }
        Collections.sort(groupAllMemberView.f72337r1, groupAllMemberView.f72343x1);
        groupAllMemberView.mo78416pN();
    }

    /* renamed from: wO */
    private final void m79910wO() {
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        mo78416pN();
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: CN */
    public void mo78394CN() {
        boolean z11;
        super.mo78394CN();
        try {
            C31973j5 c31973j5 = this.f72357R0;
            if (c31973j5 != null) {
                z11 = c31973j5.m153747Y();
            } else {
                z11 = false;
            }
            Context m92686rK = this.f72421L0.m92686rK();
            AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
            this.f72331l1 = new GroupFullMemberAdapter(m92686rK, this.f72336q1, this.f72335p1, this.f72344y1, 1, this.f73551J1, z11);
            m78410hN().f137465q.setAdapter(this.f72331l1);
            m78410hN().f137466r.setVisibility(8);
            GroupFullMemberAdapter groupFullMemberAdapter = this.f72331l1;
            if (groupFullMemberAdapter != null) {
                groupFullMemberAdapter.f38011x = true;
            }
            C31784b.m152808a(m78410hN().f137465q).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.ah
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    GroupAllMemberView.m79900jO(GroupAllMemberView.this, recyclerView, i11, view);
                }
            });
            C31784b.m152808a(m78410hN().f137465q).m152810c(new C31784b.e() { // from class: com.zing.zalo.ui.zviews.bh
                @Override // zc0.C31784b.e
                /* renamed from: T3 */
                public final boolean mo81113T3(RecyclerView recyclerView, int i11, View view) {
                    boolean m79901kO;
                    m79901kO = GroupAllMemberView.m79901kO(GroupAllMemberView.this, recyclerView, i11, view);
                    return m79901kO;
                }
            });
            m78410hN().f137465q.m9826E(new C14310d());
            AbstractC23126l.m118627a("GroupAllMemberView");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1001) {
            final C31973j5 m4473g = C0943w.f3447a.m4473g(this.f72339t1);
            if (m4473g == null) {
                return null;
            }
            if (!m79896fO(m4473g)) {
                ToastUtils.m89266n(AbstractC8020f0.str_clone_existing_group_select_members_error_not_admin, new Object[0]);
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_existing_group)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_existing_group_description)).m43169r(AbstractC8020f0.continue_text, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.dh
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    GroupAllMemberView.m79897gO(GroupAllMemberView.this, m4473g, interfaceC17463d, i12);
                }
            }).m43164m(AbstractC8020f0.str_close, new InterfaceC17463d.b());
            return aVar.m43152a();
        }
        return super.mo39014DJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        try {
            actionBarMenu.m92750r();
            super.mo37482FJ(actionBarMenu);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: FN */
    public void mo78396FN(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        mo78403NN(arrayList);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        m92637BK(true);
        mo78394CN();
        mo78415mN();
        LinearLayout root = m78410hN().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: GN */
    public void mo78397GN(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        if (arrayList.size() == 2) {
            Object obj = arrayList.get(0);
            AbstractC19074t.m100207e(obj, "get(...)");
            C28203u6 c28203u6 = C28203u6.f131407a;
            C24848g0 c24848g0 = null;
            if (C28203u6.m141798e(c28203u6, (String) obj, null, 2, null) != null && this.f72330k1.containsKey(obj)) {
                ArrayList arrayList2 = this.f72337r1;
                AbstractC19069o0.m100184a(arrayList2).remove(this.f72330k1.remove(obj));
            }
            Object obj2 = arrayList.get(1);
            AbstractC19074t.m100207e(obj2, "get(...)");
            final String str = (String) obj2;
            ContactProfile m141798e = C28203u6.m141798e(c28203u6, str, null, 2, null);
            if (m141798e != null) {
                if (this.f72330k1.containsKey(obj2)) {
                    m78400KN((GroupFullMemberAdapter.C6938b) this.f72330k1.get(obj2), true, false);
                } else {
                    GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                    c6938b.f38022b = m141798e;
                    m78400KN(c6938b, true, false);
                    this.f72337r1.add(c6938b);
                    this.f72330k1.put(obj2, c6938b);
                }
                Collections.sort(this.f72337r1, this.f72343x1);
                mo78416pN();
                c24848g0 = C24848g0.f119245a;
            }
            if (c24848g0 == null) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(obj2);
                AbstractC23184q2.m119463u(arrayList3, new Runnable() { // from class: com.zing.zalo.ui.zviews.ch
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupAllMemberView.m79905qO(str, this);
                    }
                });
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: IN */
    public void mo78399IN(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        if (arrayList.size() != 1) {
            return;
        }
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        Object obj = arrayList.get(0);
        AbstractC19074t.m100207e(obj, "get(...)");
        final String str = (String) obj;
        C24848g0 c24848g0 = null;
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
        if (m141798e != null) {
            m78400KN((GroupFullMemberAdapter.C6938b) this.f72330k1.get(this.f72342w1), false, false);
            this.f72342w1 = str;
            if (this.f72330k1.containsKey(str)) {
                m78400KN((GroupFullMemberAdapter.C6938b) this.f72330k1.get(str), true, false);
            } else {
                GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                c6938b.f38022b = m141798e;
                m78400KN(c6938b, true, false);
                this.f72337r1.add(c6938b);
                this.f72330k1.put(str, c6938b);
            }
            Collections.sort(this.f72337r1, this.f72343x1);
            mo78416pN();
            c24848g0 = C24848g0.f119245a;
        }
        if (c24848g0 == null) {
            AbstractC23184q2.m119463u(arrayList, new Runnable() { // from class: com.zing.zalo.ui.zviews.gh
                @Override // java.lang.Runnable
                public final void run() {
                    GroupAllMemberView.m79906rO(str, this);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        ManageMembersView.C14568a c14568a = ManageMembersView.Companion;
        c14568a.m81554b().clear();
        c14568a.m81553a().clear();
        c14568a.m81555c(true);
        c14568a.m81556d(0);
        c14568a.m81557e(0);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: NN */
    public void mo78403NN(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.f72330k1.containsKey(str)) {
                AbstractC19069o0.m100184a(this.f72337r1).remove(this.f72330k1.remove(str));
            }
        }
        int i11 = this.f73549H1 - 1;
        this.f73549H1 = i11;
        m79881N5(i11);
        Collections.sort(this.f72337r1, this.f72343x1);
        mo78416pN();
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: ON */
    public void mo78404ON(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
            if (m141798e != null) {
                if (this.f72330k1.containsKey(str)) {
                    m78400KN((GroupFullMemberAdapter.C6938b) this.f72330k1.get(str), false, true);
                } else {
                    GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                    c6938b.f38022b = m141798e;
                    m78400KN(c6938b, false, true);
                    this.f72337r1.add(c6938b);
                    HashMap hashMap = this.f72330k1;
                    AbstractC19074t.m100205c(str);
                    hashMap.put(str, c6938b);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (arrayList2.size() > 0) {
            AbstractC23184q2.m119463u(arrayList2, new Runnable() { // from class: com.zing.zalo.ui.zviews.eh
                @Override // java.lang.Runnable
                public final void run() {
                    GroupAllMemberView.m79909uO(arrayList2, this);
                }
            });
        } else {
            Collections.sort(this.f72337r1, this.f72343x1);
            mo78416pN();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 != 0) {
                if (i11 == 16908332) {
                    AbstractC2379w.m12430d(this.f72332m1);
                    finish();
                } else {
                    return true;
                }
            } else {
                GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c = this.f72344y1;
                if (interfaceC6939c != null) {
                    AbstractC23647d.m123897g("1591119");
                    String str = this.f72339t1;
                    AbstractC19074t.m100205c(str);
                    interfaceC6939c.mo35651d(str, this.f73552K1);
                }
            }
            return true;
        } catch (Exception unused) {
            return super.mo37491QJ(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m79903mO();
    }

    /* renamed from: dO */
    public final ArrayList m79911dO() {
        return this.f73552K1;
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: fN */
    public List mo78408fN(List list) {
        AbstractC19074t.m100208f(list, "data");
        ArrayList arrayList = new ArrayList(list);
        C31973j5 c31973j5 = this.f72357R0;
        if (c31973j5 != null) {
            if (C30202c.f140315a.m148952c(c31973j5) && !c31973j5.m153742T() && c31973j5.m153768k0()) {
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                AbstractC19074t.m100207e(listIterator, "listIterator(...)");
                while (listIterator.hasPrevious()) {
                    GroupFullMemberAdapter.C6938b c6938b = (GroupFullMemberAdapter.C6938b) listIterator.previous();
                    if (c6938b.f38021a == 0 && !c6938b.f38025e && !c6938b.f38027g) {
                        listIterator.remove();
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GroupFullMemberAdapter.C6938b c6938b2 = (GroupFullMemberAdapter.C6938b) it.next();
                if (c6938b2.f38021a == 5) {
                    AbstractC19074t.m100205c(c6938b2);
                    m79893bO(c6938b2, c31973j5);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupAllMemberView";
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: jN */
    public void mo78412jN() {
        if (TextUtils.isEmpty(this.f72339t1) || this.f72325C1) {
            return;
        }
        this.f72325C1 = true;
        m78406bN(10);
        this.f73553L1.mo1704o8(this.f73554M1);
        this.f73553L1.mo1617d4(this.f72339t1, this.f72323A1, this.f72324B1, (byte) 0);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: lN */
    public void mo78414lN(String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, "groupId");
        m79895eO().m93575T(str, i11, z11);
    }

    /* renamed from: nO */
    protected void mo79912nO() {
    }

    /* renamed from: oO */
    public void m79913oO(final ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
            if (m141798e != null) {
                if (!this.f72330k1.containsKey(str)) {
                    GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                    c6938b.f38022b = m141798e;
                    this.f72337r1.add(c6938b);
                    HashMap hashMap = this.f72330k1;
                    AbstractC19074t.m100205c(str);
                    hashMap.put(str, c6938b);
                }
            } else {
                arrayList2.add(str);
            }
        }
        int i11 = this.f73549H1 + 1;
        this.f73549H1 = i11;
        m79881N5(i11);
        Collections.sort(this.f72337r1, this.f72343x1);
        mo78416pN();
        AbstractC23184q2.m119463u(arrayList2, new Runnable() { // from class: com.zing.zalo.ui.zviews.zg
            @Override // java.lang.Runnable
            public final void run() {
                GroupAllMemberView.m79904pO(arrayList, this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 104 && i12 == -1 && intent != null) {
            try {
                String stringExtra = intent.getStringExtra("GROUP_ID");
                String stringExtra2 = intent.getStringExtra("INTERACTED_UID");
                int intExtra = intent.getIntExtra("MENU_OPTIONS_SELECTED", -1);
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                    AbstractC19074t.m100205c(stringExtra);
                    AbstractC19074t.m100205c(stringExtra2);
                    m78413kN(intExtra, stringExtra, stringExtra2);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: pN */
    public synchronized void mo78416pN() {
        ArrayList arrayList;
        try {
            try {
                m79908tO();
                this.f72336q1.clear();
                Iterator it = this.f72337r1.iterator();
                while (it.hasNext()) {
                    ContactProfile contactProfile = ((GroupFullMemberAdapter.C6938b) it.next()).f38022b;
                    if (contactProfile != null && (arrayList = contactProfile.f42399a1) != null) {
                        arrayList.clear();
                    }
                }
                this.f72336q1.addAll(mo78408fN(this.f72337r1));
                this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.fh
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupAllMemberView.m79898hO(GroupAllMemberView.this);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: vO */
    protected void mo79914vO() {
        m78402MN(this.f72323A1, this.f72345z1, this.f72324B1, this.f72337r1, this.f73552K1);
        mo78416pN();
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 27) {
            if (i11 != 62) {
                if (i11 == 6080) {
                    m79910wO();
                    return;
                }
                return;
            }
            m79907sO();
            return;
        }
        if (objArr.length >= 3) {
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = objArr[1];
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            Object obj3 = objArr[2];
            AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.String");
            ArrayList arrayList = new ArrayList();
            String[] split = TextUtils.split((String) obj3, ";");
            AbstractC19074t.m100207e(split, "split(...)");
            AbstractC25378x.m131549y(arrayList, split);
            boolean contains = arrayList.contains(CoreUtility.f89233i);
            if (AbstractC19074t.m100204b(this.f72339t1, (String) obj) && (!arrayList.isEmpty())) {
                mo79912nO();
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                if (intValue != 5) {
                                    if (intValue != 10) {
                                        if (intValue == 11) {
                                            mo78399IN(arrayList);
                                            return;
                                        }
                                        return;
                                    } else if (contains) {
                                        finish();
                                        return;
                                    } else {
                                        mo78396FN(arrayList);
                                        return;
                                    }
                                }
                                mo78397GN(arrayList);
                                return;
                            }
                            if (contains) {
                                finish();
                                return;
                            } else {
                                mo78403NN(arrayList);
                                return;
                            }
                        }
                        m79913oO(arrayList);
                        return;
                    }
                    m79915xO(arrayList);
                    return;
                }
                mo78404ON(arrayList);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f73551J1 = string;
        }
        C31973j5 c31973j5 = this.f72357R0;
        if (c31973j5 != null && !c31973j5.m153742T()) {
            C0815e1.m2075D().m2100V(new C23648e(5, this.f73551J1, 1, "gr_member_list", "2"), false);
        }
    }

    /* renamed from: xO */
    public void m79915xO(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.f72330k1.containsKey(str)) {
                m78400KN((GroupFullMemberAdapter.C6938b) this.f72330k1.get(str), false, false);
            }
        }
        Collections.sort(this.f72337r1, this.f72343x1);
        mo78416pN();
    }

    /* renamed from: yO */
    protected void mo79916yO() {
        AbstractC23647d.m123897g("1591122");
    }

    /* renamed from: zO */
    protected void mo79917zO() {
        AbstractC23647d.m123897g("1591101");
    }
}
