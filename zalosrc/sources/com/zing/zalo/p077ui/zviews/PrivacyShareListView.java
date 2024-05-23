package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import ag0.AbstractC0857z0;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.zviews.PrivacyShareListView;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p361nb.AbstractC23647d;
import p461qu.AbstractC25495a;
import v20.C27489q;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class PrivacyShareListView extends SlidableZaloView implements ZaloView.InterfaceC17421f, InterfaceC0733x {

    /* renamed from: Q0 */
    View f76148Q0;

    /* renamed from: W0 */
    C27489q f76154W0;

    /* renamed from: X0 */
    TextView f76155X0;

    /* renamed from: Y0 */
    int f76156Y0;

    /* renamed from: Z0 */
    ListView f76157Z0;

    /* renamed from: a1 */
    Button f76158a1;

    /* renamed from: b1 */
    Button f76159b1;

    /* renamed from: c1 */
    Button f76160c1;

    /* renamed from: d1 */
    LinearLayout f76161d1;

    /* renamed from: e1 */
    LikeContactItem f76162e1;

    /* renamed from: f1 */
    View f76163f1;

    /* renamed from: P0 */
    int f76147P0 = 1;

    /* renamed from: R0 */
    ArrayList f76149R0 = new ArrayList();

    /* renamed from: S0 */
    ArrayList f76150S0 = new ArrayList();

    /* renamed from: T0 */
    int f76151T0 = -1;

    /* renamed from: U0 */
    ArrayList f76152U0 = new ArrayList();

    /* renamed from: V0 */
    ArrayList f76153V0 = new ArrayList();

    /* loaded from: classes6.dex */
    public static class ShareListFragmentDialog extends DialogView {

        /* renamed from: H0 */
        PrivacyShareListView f76164H0;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: XK */
        public /* synthetic */ void m82868XK(InterfaceC17463d interfaceC17463d, int i11) {
            PrivacyShareListView privacyShareListView = this.f76164H0;
            privacyShareListView.m82863nM(privacyShareListView.f76162e1);
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
        }

        @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
        /* renamed from: CJ */
        public void mo37111CJ(Bundle bundle) {
            super.mo37111CJ(bundle);
            if (m92650VI() instanceof PrivacyShareListView) {
                this.f76164H0 = (PrivacyShareListView) m92650VI();
            }
        }

        @Override // com.zing.zalo.zview.DialogView
        /* renamed from: LK */
        public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
            try {
                if (this.f76164H0 == null) {
                    dismiss();
                    return super.mo13885LK(bundle);
                }
                C8009j.a aVar = new C8009j.a(this.f88762c0.m92648SI());
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_remove_from_group_message), this.f76164H0.f76162e1.m56331b())).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.s60
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        PrivacyShareListView.ShareListFragmentDialog.this.m82868XK(interfaceC17463d, i11);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                m43152a.m92873y(false);
                return m43152a;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PrivacyShareListView$a */
    /* loaded from: classes6.dex */
    public class C14784a implements C27489q.a {
        C14784a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m82871e(Bundle bundle) {
            PrivacyShareListView.this.f72421L0.m92662fJ().m93069k2(MyInfoView.class, bundle, 1, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m82872f(Bundle bundle) {
            PrivacyShareListView.this.f72421L0.m92662fJ().m93069k2(UserDetailsView.class, bundle, 1, true);
        }

        @Override // v20.C27489q.a
        /* renamed from: a */
        public void mo82873a(LikeContactItem likeContactItem) {
            try {
                PrivacyShareListView.this.m82863nM(likeContactItem);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // v20.C27489q.a
        /* renamed from: b */
        public void mo82874b(LikeContactItem likeContactItem, TrackingSource trackingSource) {
            try {
                final Bundle bundle = new Bundle();
                if (likeContactItem.m56333d().equals(CoreUtility.f89233i) && PrivacyShareListView.this.f72421L0.m92648SI() != null) {
                    if (PrivacyShareListView.this.f72421L0.m92648SI() instanceof ZaloLauncherActivity) {
                        PrivacyShareListView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.p60
                            @Override // java.lang.Runnable
                            public final void run() {
                                PrivacyShareListView.C14784a.this.m82871e(bundle);
                            }
                        });
                        return;
                    } else {
                        PrivacyShareListView.this.f72421L0.m92648SI().startActivity(AbstractC23152n3.m119012O(MyInfoView.class, bundle));
                        return;
                    }
                }
                if (!AbstractC25495a.m132077b(likeContactItem.m56333d()) && !likeContactItem.m56333d().equals("-1")) {
                    if (PrivacyShareListView.this.f72421L0.m92648SI() != null) {
                        if (trackingSource != null) {
                            C21927m.m114302u().m114330e0(likeContactItem.m56333d(), trackingSource);
                        } else {
                            C21927m.m114302u().m114330e0(likeContactItem.m56333d(), new TrackingSource(-1));
                        }
                        bundle.putString("userID", likeContactItem.m56333d());
                        if (PrivacyShareListView.this.f72421L0.m92648SI() instanceof ZaloLauncherActivity) {
                            PrivacyShareListView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.q60
                                @Override // java.lang.Runnable
                                public final void run() {
                                    PrivacyShareListView.C14784a.this.m82872f(bundle);
                                }
                            });
                            return;
                        } else {
                            PrivacyShareListView.this.f72421L0.m92648SI().startActivity(AbstractC23152n3.m119012O(UserDetailsView.class, bundle));
                            return;
                        }
                    }
                    return;
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_prevent_viewprofile));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.zviews.PrivacyShareListView$b */
    /* loaded from: classes6.dex */
    public class C14785b extends AbstractC0857z0 {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public Boolean mo2432g(String... strArr) {
            ContactProfile m141809c;
            PrivacyShareListView privacyShareListView = PrivacyShareListView.this;
            if (privacyShareListView.f76153V0 != null) {
                ArrayList arrayList = privacyShareListView.f76150S0;
                if (arrayList != null) {
                    arrayList.clear();
                }
                for (int i11 = 0; i11 < PrivacyShareListView.this.f76153V0.size(); i11++) {
                    String str = (String) PrivacyShareListView.this.f76153V0.get(i11);
                    if (!CoreUtility.f89233i.equals(str) && AbstractC21935u.m114558y(str) && (m141809c = C28203u6.f131407a.m141809c(str)) != null) {
                        LikeContactItem likeContactItem = new LikeContactItem(m141809c.f42434r, m141809c.m40383Q(true, false), m141809c.f42446v);
                        ArrayList arrayList2 = PrivacyShareListView.this.f76150S0;
                        if (arrayList2 != null) {
                            arrayList2.add(likeContactItem);
                        }
                    }
                }
            }
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo2438n(Boolean bool) {
            try {
                if (!PrivacyShareListView.this.f72421L0.m92677nJ() && !PrivacyShareListView.this.f72421L0.m92681pJ()) {
                    PrivacyShareListView privacyShareListView = PrivacyShareListView.this;
                    privacyShareListView.f76154W0.m140584h(privacyShareListView.f76150S0);
                    PrivacyShareListView privacyShareListView2 = PrivacyShareListView.this;
                    privacyShareListView2.f76157Z0.setAdapter((ListAdapter) privacyShareListView2.f76154W0);
                    PrivacyShareListView.this.f76154W0.notifyDataSetChanged();
                    PrivacyShareListView.this.f76157Z0.setVisibility(0);
                    View view = PrivacyShareListView.this.f76163f1;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        private C14785b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public /* synthetic */ void m82859kM(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m82860lM(View view) {
        int i11 = this.f76147P0;
        if (i11 == 3) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("fromSettingNotiFeed", true);
            bundle.putStringArrayList("fromSettingNotiFeedArrUid", this.f76153V0);
            this.f72421L0.m92662fJ().m93066i2(ChooseMultiFriendsView.class, bundle, 1234, 1, true);
            finish();
            return;
        }
        if (i11 == 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("fromSettingMutedCallers", true);
            bundle2.putStringArrayList("fromSettingNotiFeedArrUid", this.f76153V0);
            this.f72421L0.m92662fJ().m93066i2(ChooseMultiFriendsView.class, bundle2, 1234, 1, true);
            finish();
            return;
        }
        AbstractC23647d.m123906p("13432");
        AbstractC23647d.m123893c();
        if (this.f72421L0.m92648SI() != null) {
            this.f72421L0.m92662fJ().m93066i2(ProfilePickerView.class, ProfilePickerView.m83055pM(new ArrayList(this.f76149R0), 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_select_title)), 1017, 2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m82861mM(View view) {
        m82864oM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f76148Q0 = layoutInflater.inflate(AbstractC7409c0.privacy_share_list_fragment, (ViewGroup) null);
        this.f72421L0.m92676n2().mo35554O(18);
        m82866qM();
        m82862jM();
        return this.f76148Q0;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PrivacyShareListView";
    }

    /* renamed from: jM */
    void m82862jM() {
        View view;
        try {
            this.f76154W0.m140584h(this.f76150S0);
            this.f76157Z0.setAdapter((ListAdapter) this.f76154W0);
            this.f76154W0.notifyDataSetChanged();
            ArrayList arrayList = this.f76153V0;
            if (arrayList != null && !arrayList.isEmpty() && (view = this.f76163f1) != null) {
                view.setVisibility(0);
                new C14785b().m2434i(AbstractC0837p0.m2225f(), new String[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            finish();
        }
    }

    /* renamed from: nM */
    void m82863nM(LikeContactItem likeContactItem) {
        Iterator it = this.f76149R0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
            if (inviteContactProfile.f42434r.equals(likeContactItem.m56333d())) {
                this.f76149R0.remove(inviteContactProfile);
                break;
            }
        }
        this.f76152U0.add(likeContactItem.m56333d());
        this.f76154W0.m140583g(likeContactItem.m56333d());
        m82865pM(this.f76154W0.m140582d().size());
        this.f76162e1 = null;
        if (this.f76149R0.size() == 0) {
            finish();
        }
    }

    /* renamed from: oM */
    void m82864oM() {
        Intent intent = new Intent();
        ArrayList<? extends Parcelable> arrayList = this.f76149R0;
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("extra_selected_profiles", arrayList);
            intent.putExtra("extra_list_id", this.f76151T0);
        }
        this.f72421L0.mo50035CK(-1, intent);
        finish();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1017) {
            if (i12 == -1 && intent != null && intent.hasExtra("extra_selected_profiles")) {
                this.f76149R0 = intent.getParcelableArrayListExtra("extra_selected_profiles");
                m82864oM();
            } else {
                finish();
            }
        }
    }

    /* renamed from: pM */
    void m82865pM(int i11) {
        try {
            TextView textView = this.f76155X0;
            if (textView != null) {
                int i12 = this.f76147P0;
                if (i12 != 1 && i12 != 3 && i12 != 4) {
                    textView.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_group_title), Integer.valueOf(i11)));
                }
                textView.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_my_list_title), Integer.valueOf(i11)));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    void m82866qM() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("extra_mode")) {
                this.f76147P0 = m92642L3.getInt("extra_mode");
            }
            if (m92642L3.containsKey("extra_selected_profile")) {
                ArrayList parcelableArrayList = m92642L3.getParcelableArrayList("extra_selected_profile");
                this.f76149R0 = parcelableArrayList;
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                    this.f76150S0.add(new LikeContactItem(inviteContactProfile.f42434r, inviteContactProfile.m40383Q(true, false), inviteContactProfile.f42446v));
                }
            }
            if (m92642L3.containsKey("extra_share_friend_list")) {
                ArrayList arrayList = (ArrayList) m92642L3.getSerializable("extra_share_friend_list");
                this.f76150S0 = arrayList;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    LikeContactItem likeContactItem = (LikeContactItem) it2.next();
                    this.f76149R0.add(new InviteContactProfile(likeContactItem.m56333d(), likeContactItem.m56330a(), likeContactItem.m56331b()));
                }
            }
            if (m92642L3.containsKey("extra_uid_selected_profile")) {
                this.f76153V0 = m92642L3.getStringArrayList("extra_uid_selected_profile");
            }
            if (m92642L3.containsKey("extra_list_id")) {
                this.f76151T0 = m92642L3.getInt("extra_list_id");
            }
        }
        this.f76156Y0 = this.f76150S0.size();
        this.f76155X0 = (TextView) this.f76148Q0.findViewById(AbstractC6918a0.confirm_title);
        int i11 = this.f76147P0;
        if ((i11 == 3 || i11 == 4) && !this.f76153V0.isEmpty()) {
            m82865pM(this.f76153V0.size());
        } else {
            m82865pM(this.f76156Y0);
        }
        this.f76157Z0 = (ListView) this.f76148Q0.findViewById(AbstractC6918a0.likesListview);
        this.f76161d1 = (LinearLayout) this.f76148Q0.findViewById(AbstractC6918a0.layoutBtnDialog);
        this.f76158a1 = (Button) this.f76148Q0.findViewById(AbstractC6918a0.confirm_btn_no);
        this.f76159b1 = (Button) this.f76148Q0.findViewById(AbstractC6918a0.confirm_btn_yes);
        this.f76160c1 = (Button) this.f76148Q0.findViewById(AbstractC6918a0.btn_neutral);
        View findViewById = this.f76148Q0.findViewById(AbstractC6918a0.pb_loading);
        this.f76163f1 = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.m60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyShareListView.this.m82859kM(view);
            }
        };
        int i12 = this.f76147P0;
        if (i12 != 1 && i12 != 3 && i12 != 4) {
            this.f76161d1.setVisibility(0);
            this.f76160c1.setVisibility(8);
            this.f76158a1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.cancel).toUpperCase());
            this.f76158a1.setOnClickListener(onClickListener);
            this.f76159b1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.next).toUpperCase());
            this.f76159b1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.o60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrivacyShareListView.this.m82861mM(view);
                }
            });
            this.f76154W0 = new C27489q(4, this.f72421L0.m92648SI(), CoreUtility.f89233i, new C14784a(), null);
            return;
        }
        this.f76158a1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.close).toUpperCase());
        this.f76158a1.setOnClickListener(onClickListener);
        this.f76159b1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.change).toUpperCase());
        this.f76159b1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.n60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyShareListView.this.m82860lM(view);
            }
        });
        this.f76154W0 = new C27489q(5, this.f72421L0.m92648SI(), CoreUtility.f89233i, null, null);
    }
}
