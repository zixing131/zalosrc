package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.GroupNearbyPwdZView;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import me0.AbstractC23034c6;
import me0.AbstractC23093i;
import me0.C23046d7;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import vg.AbstractC28248z6;
import vg.C28139n5;
import vg.C28239y6;

/* loaded from: classes6.dex */
public class GroupNearbyPwdZView extends BaseZaloView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: O0 */
    TextView f73891O0;

    /* renamed from: P0 */
    TextView f73892P0;

    /* renamed from: Q0 */
    TextView f73893Q0;

    /* renamed from: R0 */
    TextView f73894R0;

    /* renamed from: S0 */
    TextView f73895S0;

    /* renamed from: T0 */
    TextView f73896T0;

    /* renamed from: U0 */
    TextView f73897U0;

    /* renamed from: V0 */
    TextView f73898V0;

    /* renamed from: W0 */
    TextView f73899W0;

    /* renamed from: X0 */
    TextView f73900X0;

    /* renamed from: Y0 */
    ImageButton f73901Y0;

    /* renamed from: Z0 */
    TextView f73902Z0;

    /* renamed from: b1 */
    boolean f73904b1;

    /* renamed from: c1 */
    boolean f73905c1;

    /* renamed from: d1 */
    String f73906d1;

    /* renamed from: e1 */
    String f73907e1;

    /* renamed from: M0 */
    TextView[] f73889M0 = new TextView[4];

    /* renamed from: N0 */
    ImageView[] f73890N0 = new ImageView[4];

    /* renamed from: a1 */
    StringBuilder f73903a1 = new StringBuilder(4);

    /* renamed from: f1 */
    ArrayList f73908f1 = new ArrayList();

    /* renamed from: g1 */
    Handler f73909g1 = new Handler(Looper.getMainLooper());

    /* renamed from: h1 */
    boolean f73910h1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupNearbyPwdZView$a */
    /* loaded from: classes6.dex */
    public class C14379a implements InterfaceC20094a {
        C14379a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m80289d(ArrayList arrayList, boolean z11) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("extra_data", GroupNearbyPwdZView.this.f73908f1);
            bundle.putStringArrayList("extra_group_owner_uids", arrayList);
            bundle.putString("extra_pin", GroupNearbyPwdZView.this.f73903a1.toString());
            bundle.putString("extra_lobby_id", GroupNearbyPwdZView.this.f73906d1);
            bundle.putString("extra_lobby_description", GroupNearbyPwdZView.this.f73907e1);
            bundle.putBoolean("extra_load_more", z11);
            GroupNearbyPwdZView.this.m92662fJ().m93069k2(GroupNearbyLobbyZView.class, bundle, 1, true);
            GroupNearbyPwdZView.this.f73910h1 = true;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            GroupNearbyPwdZView groupNearbyPwdZView = GroupNearbyPwdZView.this;
            groupNearbyPwdZView.f73905c1 = false;
            if (groupNearbyPwdZView.f72421L0.m92674mJ()) {
                String m92652XI = GroupNearbyPwdZView.this.m92652XI(AbstractC8020f0.str_group_unknown_error);
                if (c20096c != null && c20096c.m104491c() == -116) {
                    m92652XI = GroupNearbyPwdZView.this.m92652XI(AbstractC8020f0.str_group_invalid_pin);
                } else if (c20096c != null && c20096c.m104491c() == 50001) {
                    m92652XI = GroupNearbyPwdZView.this.m92652XI(AbstractC8020f0.location_no_network);
                }
                GroupNearbyPwdZView.this.m80282iM(m92652XI);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ContactProfile contactProfile;
            String str;
            String string;
            long j11;
            String str2;
            String string2;
            String string3;
            String string4;
            String string5;
            int i11;
            String string6;
            C14379a c14379a = this;
            String str3 = "checkinTime";
            String str4 = "userId";
            try {
                GroupNearbyPwdZView groupNearbyPwdZView = GroupNearbyPwdZView.this;
                groupNearbyPwdZView.f73905c1 = false;
                if (groupNearbyPwdZView.f72421L0.m92674mJ()) {
                    GroupNearbyPwdZView.this.f73908f1.clear();
                    GroupNearbyPwdZView.this.mo49315c4();
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    JSONArray jSONArray = jSONObject.getJSONArray("entries");
                    GroupNearbyPwdZView.this.f73906d1 = jSONObject.optString("lobbyId");
                    GroupNearbyPwdZView.this.f73907e1 = jSONObject.optString("desc");
                    final ArrayList arrayList = new ArrayList();
                    int i12 = 0;
                    while (i12 < jSONArray.length()) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                            contactProfile = new ContactProfile();
                            String str5 = "";
                            if (jSONObject2.isNull(str4)) {
                                str = str4;
                                string = "";
                            } else {
                                str = str4;
                                string = jSONObject2.getString(str4);
                            }
                            contactProfile.f42434r = string;
                            if (jSONObject2.isNull(str3)) {
                                j11 = 0;
                            } else {
                                j11 = jSONObject2.getLong(str3);
                            }
                            str2 = str3;
                            contactProfile.f42454x1 = j11;
                            if (jSONObject2.isNull("code")) {
                                string2 = "";
                            } else {
                                string2 = jSONObject2.getString("code");
                            }
                            contactProfile.f42457y1 = string2;
                            if (jSONObject2.isNull("displayName")) {
                                string3 = "";
                            } else {
                                string3 = jSONObject2.getString("displayName");
                            }
                            contactProfile.f42437s = string3;
                            if (jSONObject2.isNull("status")) {
                                string4 = "";
                            } else {
                                string4 = jSONObject2.getString("status");
                            }
                            contactProfile.f42458z = string4;
                            if (jSONObject2.isNull("avatar")) {
                                string5 = "";
                            } else {
                                string5 = jSONObject2.getString("avatar");
                            }
                            contactProfile.f42446v = string5;
                            if (jSONObject2.isNull("gender")) {
                                i11 = 0;
                            } else {
                                i11 = jSONObject2.getInt("gender");
                            }
                            contactProfile.f42449w = i11;
                            if (jSONObject2.isNull("dob")) {
                                string6 = "";
                            } else {
                                string6 = jSONObject2.getString("dob");
                            }
                            contactProfile.f42452x = string6;
                            if (!jSONObject2.isNull("isFriend")) {
                                jSONObject2.getInt("isFriend");
                            }
                            if (jSONObject2.has(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                                if (!jSONObject3.isNull("address")) {
                                    str5 = jSONObject3.getString("address");
                                }
                                contactProfile.m40397a1(str5);
                            }
                            if (jSONObject2.optInt("isGroupOwner") == 1) {
                                arrayList.add(contactProfile.f42434r);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            AbstractC23350e.m122778h(e);
                            return;
                        }
                        try {
                            GroupNearbyPwdZView.this.f73908f1.add(contactProfile);
                            i12++;
                            c14379a = this;
                            str3 = str2;
                            str4 = str;
                        } catch (Exception e12) {
                            e = e12;
                            AbstractC23350e.m122778h(e);
                            return;
                        }
                    }
                    final boolean z11 = true;
                    if (jSONObject.getInt("isLoadMore") != 1) {
                        z11 = false;
                    }
                    AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.ql
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupNearbyPwdZView.C14379a.this.m80289d(arrayList, z11);
                        }
                    });
                }
            } catch (Exception e13) {
                e = e13;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupNearbyPwdZView$b */
    /* loaded from: classes6.dex */
    public class C14380b extends AbstractC28248z6.f {
        C14380b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m80291c(Location location) {
            if (location != null) {
                if (GroupNearbyPwdZView.this.f73903a1.length() == 4) {
                    GroupNearbyPwdZView.this.m80280gM();
                    return;
                } else {
                    GroupNearbyPwdZView.this.mo49315c4();
                    return;
                }
            }
            GroupNearbyPwdZView.this.mo49315c4();
            GroupNearbyPwdZView.this.f73903a1.setLength(0);
            GroupNearbyPwdZView.this.m80287qM();
            GroupNearbyPwdZView groupNearbyPwdZView = GroupNearbyPwdZView.this;
            groupNearbyPwdZView.m80282iM(groupNearbyPwdZView.m92652XI(AbstractC8020f0.location_not_found));
            if (new C28239y6().m142223b(GroupNearbyPwdZView.this.m92648SI()) == 1) {
                GroupNearbyPwdZView.this.showDialog(4);
            }
        }

        @Override // vg.AbstractC28248z6.f
        /* renamed from: a */
        public void mo40758a(final Location location, int i11) {
            try {
                GroupNearbyPwdZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.rl
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupNearbyPwdZView.C14380b.this.m80291c(location);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupNearbyPwdZView.this.f73904b1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public /* synthetic */ void m80277kM() {
        try {
            mo49315c4();
            this.f73903a1.setLength(0);
            m80287qM();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m80278lM(String str) {
        try {
            mo49315c4();
            this.f73902Z0.setVisibility(0);
            this.f73902Z0.setText(str);
            this.f73903a1.setLength(0);
            m80287qM();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m80279mM() {
        AbstractC23034c6.m118184v0(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (m92676n2() != null) {
            AbstractC2379w.m12430d(m92676n2().getCurrentFocus());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        C8009j c8009j = null;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 5) {
                    return null;
                }
                return C23046d7.m118240c(m92689tK());
            }
            try {
                if (!AbstractC23309i.m121488Ub()) {
                    return null;
                }
                return AbstractC23093i.m118457j(m92648SI(), this);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return null;
            }
        }
        try {
            C8009j.a aVar = new C8009j.a(m92648SI());
            aVar.m43159h(4).m43162k(m92652XI(AbstractC8020f0.ask_to_enable_gps)).m43165n(m92652XI(AbstractC8020f0.str_button_confirm_no), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.setting_title), this);
            c8009j = aVar.m43152a();
            c8009j.m92874z(false);
            return c8009j;
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
            return c8009j;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.group_rada_pwd_view, viewGroup, false);
        m80283jM(inflate);
        m80286pM();
        return inflate;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 3) {
                if (mo92862f != 4) {
                    if (mo92862f == 5) {
                        interfaceC17463d.dismiss();
                        this.f73902Z0.setText("");
                        this.f73902Z0.setVisibility(4);
                    }
                } else {
                    m80284nM();
                    interfaceC17463d.dismiss();
                    this.f73902Z0.setText("");
                    this.f73902Z0.setVisibility(4);
                }
            } else if (i11 == -1) {
                interfaceC17463d.dismiss();
                m92641HK(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: gM */
    void m80280gM() {
        try {
            if (this.f73905c1) {
                return;
            }
            this.f73905c1 = true;
            mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14379a());
            c0766k.mo1585Z3(C28139n5.m141620j().m141645r(), C28139n5.m141620j().m141640m(), AbstractC23309i.m122489v1(), 1, 20, this.f73903a1.toString());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f73905c1 = false;
            mo49315c4();
            m80282iM(m92652XI(AbstractC8020f0.str_group_unknown_error));
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupNearbyPwdZView";
    }

    /* renamed from: hM */
    public void m80281hM() {
        try {
            if (this.f73904b1) {
                return;
            }
            if (!C23055e5.m118271f()) {
                m80282iM(m92652XI(AbstractC8020f0.NETWORK_ERROR_MSG));
                return;
            }
            if (this.f73903a1.length() == 4) {
                mo46829Y();
            }
            C14380b c14380b = new C14380b();
            C28239y6 c28239y6 = new C28239y6();
            this.f73904b1 = true;
            SensitiveData sensitiveData = new SensitiveData("group_offline", "comm_group_offline");
            if (!c28239y6.m142225f(m92648SI(), c14380b, sensitiveData)) {
                this.f73904b1 = false;
                if (!C8937j0.m47663l(sensitiveData.m35528c())) {
                    removeDialog(5);
                    showDialog(5);
                } else {
                    removeDialog(3);
                    showDialog(3);
                }
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.nl
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupNearbyPwdZView.this.m80277kM();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f73904b1 = false;
        }
    }

    /* renamed from: iM */
    void m80282iM(final String str) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ol
            @Override // java.lang.Runnable
            public final void run() {
                GroupNearbyPwdZView.this.m80278lM(str);
            }
        });
    }

    /* renamed from: jM */
    void m80283jM(View view) {
        this.f73889M0[0] = (TextView) view.findViewById(AbstractC6918a0.tv_code_1);
        this.f73889M0[1] = (TextView) view.findViewById(AbstractC6918a0.tv_code_2);
        this.f73889M0[2] = (TextView) view.findViewById(AbstractC6918a0.tv_code_3);
        this.f73889M0[3] = (TextView) view.findViewById(AbstractC6918a0.tv_code_4);
        this.f73890N0[0] = (ImageView) view.findViewById(AbstractC6918a0.img_code_1);
        this.f73890N0[1] = (ImageView) view.findViewById(AbstractC6918a0.img_code_2);
        this.f73890N0[2] = (ImageView) view.findViewById(AbstractC6918a0.img_code_3);
        this.f73890N0[3] = (ImageView) view.findViewById(AbstractC6918a0.img_code_4);
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.keypad_0);
        this.f73891O0 = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) view.findViewById(AbstractC6918a0.keypad_1);
        this.f73892P0 = textView2;
        textView2.setOnClickListener(this);
        TextView textView3 = (TextView) view.findViewById(AbstractC6918a0.keypad_2);
        this.f73893Q0 = textView3;
        textView3.setOnClickListener(this);
        TextView textView4 = (TextView) view.findViewById(AbstractC6918a0.keypad_3);
        this.f73894R0 = textView4;
        textView4.setOnClickListener(this);
        TextView textView5 = (TextView) view.findViewById(AbstractC6918a0.keypad_4);
        this.f73895S0 = textView5;
        textView5.setOnClickListener(this);
        TextView textView6 = (TextView) view.findViewById(AbstractC6918a0.keypad_5);
        this.f73896T0 = textView6;
        textView6.setOnClickListener(this);
        TextView textView7 = (TextView) view.findViewById(AbstractC6918a0.keypad_6);
        this.f73897U0 = textView7;
        textView7.setOnClickListener(this);
        TextView textView8 = (TextView) view.findViewById(AbstractC6918a0.keypad_7);
        this.f73898V0 = textView8;
        textView8.setOnClickListener(this);
        TextView textView9 = (TextView) view.findViewById(AbstractC6918a0.keypad_8);
        this.f73899W0 = textView9;
        textView9.setOnClickListener(this);
        TextView textView10 = (TextView) view.findViewById(AbstractC6918a0.keypad_9);
        this.f73900X0 = textView10;
        textView10.setOnClickListener(this);
        ImageButton imageButton = (ImageButton) view.findViewById(AbstractC6918a0.keypad_back);
        this.f73901Y0 = imageButton;
        imageButton.setOnClickListener(this);
        this.f73902Z0 = (TextView) view.findViewById(AbstractC6918a0.tv_error);
    }

    /* renamed from: nM */
    void m80284nM() {
        m92641HK(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* renamed from: oM */
    void m80285oM(char c11) {
        if (this.f73903a1.length() >= 4) {
            return;
        }
        this.f73903a1.append(c11);
        m80287qM();
        this.f73902Z0.setText("");
        this.f73902Z0.setVisibility(4);
        if (this.f73903a1.length() == 4) {
            if (System.currentTimeMillis() - C28139n5.m141620j().m141644q() >= 60000) {
                m80286pM();
            } else {
                m80280gM();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.keypad_0) {
            m80285oM('0');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_1) {
            m80285oM('1');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_2) {
            m80285oM('2');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_3) {
            m80285oM('3');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_4) {
            m80285oM('4');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_5) {
            m80285oM('5');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_6) {
            m80285oM('6');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_7) {
            m80285oM('7');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_8) {
            m80285oM('8');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_9) {
            m80285oM('9');
        } else if (id2 == AbstractC6918a0.keypad_back) {
            if (this.f73903a1.length() > 0) {
                this.f73903a1.deleteCharAt(r2.length() - 1);
            }
            m80287qM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            return m92649TI().mo92703Q0();
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 110) {
            if (AbstractC23034c6.m118165m(m92648SI(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
                if (this.f73903a1.length() == 4) {
                    m80281hM();
                    return;
                }
                return;
            }
            m80282iM(m92652XI(AbstractC8020f0.no_permission_location));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f73910h1) {
            this.f73903a1.setLength(0);
            m80287qM();
            this.f73910h1 = false;
        }
    }

    /* renamed from: pM */
    void m80286pM() {
        if (m92648SI() != null && AbstractC23034c6.m118165m(m92648SI(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            this.f73909g1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.pl
                @Override // java.lang.Runnable
                public final void run() {
                    GroupNearbyPwdZView.this.m80279mM();
                }
            }, 100L);
        } else {
            m80281hM();
        }
    }

    /* renamed from: qM */
    void m80287qM() {
        for (int i11 = 0; i11 < this.f73889M0.length; i11++) {
            if (i11 < this.f73903a1.length()) {
                this.f73889M0[i11].setText("" + this.f73903a1.charAt(i11));
                this.f73889M0[i11].setVisibility(0);
                this.f73890N0[i11].setVisibility(4);
            } else {
                this.f73890N0[i11].setVisibility(0);
                this.f73889M0[i11].setVisibility(4);
            }
        }
    }
}
