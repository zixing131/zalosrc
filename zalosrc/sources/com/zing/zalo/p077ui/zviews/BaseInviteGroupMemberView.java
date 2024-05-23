package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import am.C0943w;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import c70.C3334c;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.zviews.BaseInviteGroupMemberView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i70.C20379a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p656xs.AbstractC30200a;
import p716zh.C31973j5;
import p720zl.C32223a;
import vg.C28203u6;

/* loaded from: classes6.dex */
public abstract class BaseInviteGroupMemberView extends SlidableZaloView {

    /* renamed from: R0 */
    C31973j5 f72357R0;

    /* renamed from: S0 */
    boolean f72358S0;

    /* renamed from: T0 */
    boolean f72359T0;

    /* renamed from: P0 */
    boolean f72355P0 = false;

    /* renamed from: Q0 */
    int f72356Q0 = 0;

    /* renamed from: U0 */
    HashMap f72360U0 = new HashMap();

    /* renamed from: V0 */
    ArrayList f72361V0 = new ArrayList();

    /* renamed from: W0 */
    final C32223a f72362W0 = new C32223a();

    /* renamed from: com.zing.zalo.ui.zviews.BaseInviteGroupMemberView$a */
    /* loaded from: classes6.dex */
    public class C14093a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f72363a;

        C14093a(String str) {
            this.f72363a = str;
        }

        /* renamed from: d */
        public /* synthetic */ void m78435d(boolean z11, String str) {
            int i11;
            int i12;
            int i13;
            Integer num;
            C3334c c3334c = C3334c.f14156a;
            Context context = BaseInviteGroupMemberView.this.getContext();
            int i14 = AbstractC8020f0.str_popup_title_unable_add_to_group;
            if (z11) {
                i11 = AbstractC8020f0.str_popup_subtitle_limit_members_to_upgrade_community;
            } else {
                i11 = AbstractC8020f0.f43861x7f3f1748;
            }
            if (z11) {
                i12 = AbstractC23322a.zds_il_community_upgrade_spot_1_1;
            } else {
                i12 = AbstractC23322a.zds_il_community_error_spot_1_1;
            }
            if (z11) {
                i13 = AbstractC8020f0.str_popup_btn_upgrade_to_community;
            } else {
                i13 = AbstractC8020f0.str_popup_btn_close;
            }
            if (z11) {
                num = Integer.valueOf(AbstractC8020f0.str_popup_btn_close);
            } else {
                num = null;
            }
            c3334c.m16810d(context, i14, i11, i12, i13, num, str, BaseInviteGroupMemberView.this.f72421L0, null, "gr_add_mem");
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00f2 A[Catch: Exception -> 0x0014, TryCatch #1 {Exception -> 0x0014, blocks: (B:3:0x0002, B:5:0x000c, B:8:0x0018, B:14:0x0028, B:15:0x00dc, B:18:0x00e4, B:22:0x00f2, B:24:0x00f6, B:26:0x00fa, B:27:0x002d, B:29:0x0033, B:31:0x0039, B:34:0x0042, B:36:0x0053, B:38:0x0060, B:41:0x0068, B:42:0x0070, B:44:0x007a, B:45:0x0080, B:47:0x008b, B:52:0x0086, B:54:0x009a, B:61:0x00b8, B:63:0x00b5, B:64:0x00ca, B:57:0x00a0, B:59:0x00af), top: B:2:0x0002, inners: #0, #2 }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            boolean z11;
            boolean z12;
            int m104491c;
            BaseInviteGroupMemberView baseInviteGroupMemberView;
            C31973j5 c31973j5;
            boolean z13;
            try {
                BaseInviteGroupMemberView baseInviteGroupMemberView2 = BaseInviteGroupMemberView.this;
                baseInviteGroupMemberView2.f72355P0 = false;
                C31973j5 c31973j52 = baseInviteGroupMemberView2.f72357R0;
                z11 = true;
                if (c31973j52 != null && c31973j52.m153747Y()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m104491c = c20096c.m104491c();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (m104491c != 17007) {
                if (m104491c != 17013) {
                    if (m104491c != 19530) {
                        AbstractC23161o1.m119321f(c20096c, z12);
                    } else if (AbstractC30200a.m148947f()) {
                        C31973j5 c31973j53 = BaseInviteGroupMemberView.this.f72357R0;
                        if (c31973j53 != null && c31973j53.m153778p0()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        BaseInviteGroupMemberView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.k2

                            /* renamed from: q */
                            public final /* synthetic */ boolean f80843q;

                            /* renamed from: r */
                            public final /* synthetic */ String f80844r;

                            public /* synthetic */ RunnableC15794k2(boolean z132, String str) {
                                r2 = z132;
                                r3 = str;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                BaseInviteGroupMemberView.C14093a.this.m78435d(r2, r3);
                            }
                        });
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("gid", this.f72363a);
                            C31973j5 c31973j54 = BaseInviteGroupMemberView.this.f72357R0;
                            if (c31973j54 != null) {
                                if (c31973j54.m153778p0()) {
                                    jSONObject.put("member_role", "ow");
                                } else if (BaseInviteGroupMemberView.this.f72357R0.m153743U()) {
                                    jSONObject.put("member_role", "ad");
                                } else {
                                    jSONObject.put("member_role", "mem");
                                }
                            }
                        } catch (JSONException e12) {
                            AbstractC23350e.m122776f("CommonZaloview", e12);
                        }
                        C20379a.f100400a.m106159a("gr_add_mem", 1, "limit_100_mem", jSONObject.toString());
                    } else {
                        AbstractC23161o1.m119321f(c20096c, z12);
                    }
                } else {
                    int i11 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
                    try {
                        JSONObject jSONObject2 = new JSONObject(c20096c.m104490b());
                        if (jSONObject2.has("maxUsers")) {
                            i11 = jSONObject2.optInt("maxUsers");
                        }
                    } catch (Exception e13) {
                        AbstractC23350e.m122778h(e13);
                    }
                    Intent intent = new Intent();
                    intent.putExtra("maxUsers", i11);
                    BaseInviteGroupMemberView.this.f72421L0.mo50035CK(1001, intent);
                }
                baseInviteGroupMemberView = BaseInviteGroupMemberView.this;
                if (!baseInviteGroupMemberView.f72358S0) {
                    if (z11) {
                        BaseInviteGroupMemberView.this.f72421L0.mo50035CK(-1, new Intent());
                    }
                } else if (!baseInviteGroupMemberView.f72359T0 && (c31973j5 = baseInviteGroupMemberView.f72357R0) != null) {
                    AbstractC23211s7.m119577j(c31973j5, baseInviteGroupMemberView.f72421L0.m92676n2(), false);
                }
                BaseInviteGroupMemberView.this.f72421L0.mo49315c4();
                BaseInviteGroupMemberView.this.mo78429gM(c20096c.m104491c(), new ArrayList());
            }
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.ERROR_NOT_AUTHORIZED_ACTION, 17007));
            z11 = false;
            baseInviteGroupMemberView = BaseInviteGroupMemberView.this;
            if (!baseInviteGroupMemberView.f72358S0) {
            }
            BaseInviteGroupMemberView.this.f72421L0.mo49315c4();
            BaseInviteGroupMemberView.this.mo78429gM(c20096c.m104491c(), new ArrayList());
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:            if (r8.getInt("isPendingList") > 0) goto L97;     */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b4 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:3:0x0004, B:5:0x001d, B:7:0x0023, B:10:0x0033, B:12:0x0039, B:15:0x0040, B:16:0x00cd, B:21:0x0045, B:24:0x0053, B:26:0x005d, B:40:0x00ae, B:42:0x00b4, B:43:0x00bc, B:45:0x00c0, B:47:0x00c4, B:50:0x00aa, B:28:0x0066, B:30:0x007c, B:31:0x0087, B:33:0x0093, B:34:0x009b, B:36:0x00a1), top: B:2:0x0004, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00bc A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:3:0x0004, B:5:0x001d, B:7:0x0023, B:10:0x0033, B:12:0x0039, B:15:0x0040, B:16:0x00cd, B:21:0x0045, B:24:0x0053, B:26:0x005d, B:40:0x00ae, B:42:0x00b4, B:43:0x00bc, B:45:0x00c0, B:47:0x00c4, B:50:0x00aa, B:28:0x0066, B:30:0x007c, B:31:0x0087, B:33:0x0093, B:34:0x009b, B:36:0x00a1), top: B:2:0x0004, inners: #1 }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            int i11;
            boolean z11;
            BaseInviteGroupMemberView baseInviteGroupMemberView;
            C31973j5 c31973j5;
            try {
                boolean z12 = false;
                BaseInviteGroupMemberView.this.f72355P0 = false;
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject.has("data") && jSONObject.has("error_code")) {
                    i11 = Integer.parseInt(jSONObject.getString("error_code"));
                } else {
                    i11 = 0;
                }
                z11 = true;
                if (i11 != 0) {
                    C31973j5 c31973j52 = BaseInviteGroupMemberView.this.f72357R0;
                    if (c31973j52 != null && c31973j52.m153747Y()) {
                        z12 = true;
                    }
                    ToastUtils.m89260h(i11, z12);
                } else {
                    if (!jSONObject.getString("data").equals("null") && !jSONObject.getString("data").equals("")) {
                        jSONObject2 = new JSONObject(jSONObject.getString("data"));
                    }
                    try {
                        HashMap hashMap = new HashMap();
                        HashSet hashSet = new HashSet();
                        String optString = jSONObject2.optString("wrong_members", "");
                        if (!TextUtils.isEmpty(optString)) {
                            AbstractC23184q2.m119436A(hashMap, new JSONArray(optString), false, hashSet);
                        }
                        String optString2 = jSONObject2.optString("wrong_phones", "");
                        if (!TextUtils.isEmpty(optString2)) {
                            AbstractC23184q2.m119436A(hashMap, new JSONArray(optString2), true, hashSet);
                        }
                        if (hashMap.isEmpty()) {
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                    baseInviteGroupMemberView = BaseInviteGroupMemberView.this;
                    if (!baseInviteGroupMemberView.f72358S0) {
                        baseInviteGroupMemberView.f72421L0.mo50035CK(-1, null);
                    } else if (!baseInviteGroupMemberView.f72359T0 && (c31973j5 = baseInviteGroupMemberView.f72357R0) != null) {
                        AbstractC23211s7.m119577j(c31973j5, baseInviteGroupMemberView.f72421L0.m92676n2(), false);
                    }
                }
                BaseInviteGroupMemberView baseInviteGroupMemberView2 = BaseInviteGroupMemberView.this;
                baseInviteGroupMemberView2.mo78429gM(baseInviteGroupMemberView2.mo78430iM(z11, jSONObject2), BaseInviteGroupMemberView.this.m78431jM(jSONObject2));
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
            BaseInviteGroupMemberView.this.f72421L0.mo49315c4();
            z11 = false;
            baseInviteGroupMemberView = BaseInviteGroupMemberView.this;
            if (!baseInviteGroupMemberView.f72358S0) {
            }
            BaseInviteGroupMemberView baseInviteGroupMemberView22 = BaseInviteGroupMemberView.this;
            baseInviteGroupMemberView22.mo78429gM(baseInviteGroupMemberView22.mo78430iM(z11, jSONObject2), BaseInviteGroupMemberView.this.m78431jM(jSONObject2));
            BaseInviteGroupMemberView.this.f72421L0.mo49315c4();
        }
    }

    /* renamed from: hM */
    private String m78428hM(int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("src", i11);
            return jSONObject.toString();
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: gM */
    public void mo78429gM(int i11, ArrayList arrayList) {
        int i12;
        if (this.f72359T0) {
            this.f72421L0.finish();
            if (i11 != 0) {
                C31973j5 c31973j5 = this.f72357R0;
                if (c31973j5 != null) {
                    AbstractC23184q2.m119440E(c31973j5.m153781r(), 12, m78432kM());
                }
                if (arrayList.size() == 1) {
                    ContactProfile m141811g = C28203u6.f131407a.m141811g((String) arrayList.get(0));
                    if (m141811g != null) {
                        C31973j5 c31973j52 = this.f72357R0;
                        if (c31973j52 != null && c31973j52.m153747Y()) {
                            i12 = AbstractC8020f0.str_msg_toast_add_member_from_community_manage_view_fail_v2_1;
                        } else {
                            i12 = AbstractC8020f0.str_msg_toast_add_member_from_manage_view_fail_v2_1;
                        }
                        ToastUtils.m89268p(AbstractC23136l9.m118746s0(i12, m141811g.m40383Q(true, false)));
                    } else {
                        ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_msg_toast_add_member_from_manage_view_fail_v2_2, Integer.valueOf(arrayList.size())));
                    }
                } else if (arrayList.size() > 1) {
                    ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_msg_toast_add_member_from_manage_view_fail_v2_2, Integer.valueOf(arrayList.size())));
                }
            }
        }
        if (this.f72358S0) {
            this.f72421L0.finish();
        }
    }

    /* renamed from: iM */
    public int mo78430iM(boolean z11, JSONObject jSONObject) {
        if (z11) {
            try {
                String optString = jSONObject.optString("wrong_members", "");
                if (!TextUtils.isEmpty(optString)) {
                    JSONArray jSONArray = new JSONArray(optString);
                    if (jSONArray.length() > 0) {
                        return jSONArray.getJSONObject(0).getInt("errorCode");
                    }
                }
                String optString2 = jSONObject.optString("wrong_phones", "");
                if (!TextUtils.isEmpty(optString2)) {
                    JSONArray jSONArray2 = new JSONArray(optString2);
                    if (jSONArray2.length() > 0) {
                        return jSONArray2.getJSONObject(0).getInt("errorCode");
                    }
                }
                if (Integer.parseInt(jSONObject.optString("isPendingList")) > 0) {
                    return 17007;
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return 0;
    }

    /* renamed from: jM */
    public ArrayList m78431jM(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        try {
            String optString = jSONObject.optString("wrong_members", "");
            if (!TextUtils.isEmpty(optString)) {
                JSONArray jSONArray = new JSONArray(optString);
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONArray jSONArray2 = ((JSONObject) jSONArray.get(i11)).getJSONArray("uIds");
                    int length2 = jSONArray2.length();
                    for (int i12 = 0; i12 < length2; i12++) {
                        String string = jSONArray2.getString(i12);
                        if (!hashMap.containsKey(string)) {
                            arrayList.add(string);
                            hashMap.put(string, string);
                        }
                    }
                }
            }
            String optString2 = jSONObject.optString("wrong_phones", "");
            if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString2)) {
                JSONArray jSONArray3 = new JSONArray(optString2);
                int length3 = jSONArray3.length();
                for (int i13 = 0; i13 < length3; i13++) {
                    JSONArray jSONArray4 = ((JSONObject) jSONArray3.get(i13)).getJSONArray("uIds");
                    int length4 = jSONArray4.length();
                    for (int i14 = 0; i14 < length4; i14++) {
                        String string2 = jSONArray4.getString(i14);
                        if (!hashMap.containsKey(string2)) {
                            arrayList.add(string2);
                            hashMap.put(string2, string2);
                        }
                    }
                }
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: kM */
    public String m78432kM() {
        String str;
        int size = this.f72361V0.size();
        if (size > 0) {
            str = (String) this.f72361V0.get(0);
        } else {
            str = "";
        }
        for (int i11 = 1; i11 < size; i11++) {
            str = str + ";" + ((String) this.f72361V0.get(i11));
        }
        return str;
    }

    /* renamed from: lM */
    public void m78433lM(String str, int i11) {
        if (this.f72355P0) {
            return;
        }
        this.f72355P0 = true;
        this.f72421L0.mo46829Y();
        this.f72357R0 = C0943w.m4462l().m4472f(str);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14093a(str));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f72362W0.m155392f().iterator();
        while (it.hasNext()) {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
            if (inviteContactProfile.m40381O0()) {
                arrayList.add(inviteContactProfile.f42434r.substring(12));
            } else {
                arrayList2.add(inviteContactProfile);
            }
        }
        c0766k.mo1702o6(str, arrayList2, arrayList, m78428hM(i11));
    }
}
