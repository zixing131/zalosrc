package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3047v0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.feed.domain.usecase.C8550b;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.zviews.TagsListView;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p172fy.C19171b;
import p398oo.C24371m0;
import p455qo.C25406e0;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p716zh.C32002l4;
import v20.C27492t;

/* loaded from: classes6.dex */
public class TagsListView extends SlidableZaloView implements ZaloView.InterfaceC17421f, C27492t.b, View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    int f78226P0;

    /* renamed from: Q0 */
    LinearLayout f78227Q0;

    /* renamed from: R0 */
    LinearLayout f78228R0;

    /* renamed from: S0 */
    LinearLayout f78229S0;

    /* renamed from: T0 */
    ListView f78230T0;

    /* renamed from: U0 */
    TextView f78231U0;

    /* renamed from: V0 */
    TextView f78232V0;

    /* renamed from: W0 */
    Button f78233W0;

    /* renamed from: Y0 */
    C27492t f78235Y0;

    /* renamed from: Z0 */
    String f78236Z0;

    /* renamed from: a1 */
    int f78237a1;

    /* renamed from: b1 */
    String f78238b1;

    /* renamed from: c1 */
    String f78239c1;

    /* renamed from: d1 */
    View f78240d1;

    /* renamed from: k1 */
    KeyEventCallbackC17462c f78247k1;

    /* renamed from: l1 */
    View f78248l1;

    /* renamed from: X0 */
    ArrayList f78234X0 = new ArrayList();

    /* renamed from: e1 */
    Set f78241e1 = new HashSet();

    /* renamed from: f1 */
    LikeContactItem f78242f1 = null;

    /* renamed from: g1 */
    int f78243g1 = 0;

    /* renamed from: h1 */
    boolean f78244h1 = false;

    /* renamed from: i1 */
    boolean f78245i1 = false;

    /* renamed from: j1 */
    boolean f78246j1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TagsListView$a */
    /* loaded from: classes6.dex */
    public class C15162a implements InterfaceC20094a {
        C15162a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m85011e() {
            try {
                TagsListView tagsListView = TagsListView.this;
                tagsListView.f78235Y0.m140591g(tagsListView.f78234X0);
                TagsListView tagsListView2 = TagsListView.this;
                tagsListView2.f78230T0.setAdapter((ListAdapter) tagsListView2.f78235Y0);
                TagsListView.this.f78235Y0.notifyDataSetChanged();
                TagsListView.this.f78230T0.setVisibility(0);
                TagsListView.this.f78227Q0.setVisibility(8);
                TagsListView.this.f78228R0.setVisibility(8);
                if (TagsListView.this.f78235Y0.getCount() == 0) {
                    TagsListView.this.m84996AM(0);
                    TagsListView.this.f78228R0.setVisibility(0);
                    TagsListView.this.m84998CM(AbstractC8020f0.str_feed_tag_list_empty_text, null);
                    TagsListView.this.f78240d1.setVisibility(8);
                } else {
                    TagsListView tagsListView3 = TagsListView.this;
                    tagsListView3.m84996AM(tagsListView3.f78243g1);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m85012f(C20096c c20096c) {
            try {
                TagsListView.this.f78227Q0.setVisibility(8);
                C27492t c27492t = TagsListView.this.f78235Y0;
                if (c27492t != null && c27492t.getCount() > 0) {
                    TagsListView.this.f78230T0.setVisibility(0);
                    TagsListView.this.f78228R0.setVisibility(8);
                } else {
                    TagsListView.this.f78230T0.setVisibility(8);
                    TagsListView.this.f78228R0.setVisibility(0);
                }
                TagsListView.this.f78240d1.setVisibility(0);
                int m104491c = c20096c.m104491c();
                if (m104491c != 1001) {
                    if (m104491c != 50001) {
                        TagsListView.this.m84998CM(AbstractC8020f0.str_feed_tag_list_error_text, null);
                        return;
                    } else {
                        TagsListView.this.m84998CM(AbstractC8020f0.empty_text_network_error, null);
                        return;
                    }
                }
                TagsListView tagsListView = TagsListView.this;
                tagsListView.f78245i1 = true;
                tagsListView.m84998CM(AbstractC8020f0.str_tv_feednoexist, tagsListView.f72421L0.m92651WI().getDrawable(AbstractC16803z.ignore_icon));
                TagsListView.this.f78240d1.setVisibility(8);
                new C8550b().m101508a(new C8550b.a(TagsListView.this.f78236Z0, false));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            TagsListView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.qq0
                @Override // java.lang.Runnable
                public final void run() {
                    TagsListView.C15162a.this.m85012f(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                TagsListView.this.f78234X0.clear();
                JSONArray jSONArray = ((JSONObject) obj).getJSONArray("data");
                if (jSONArray.length() > 0) {
                    TagsListView tagsListView = TagsListView.this;
                    tagsListView.f78244h1 = false;
                    tagsListView.f78234X0.clear();
                    boolean z11 = false;
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        LikeContactItem likeContactItem = new LikeContactItem(jSONArray.getJSONObject(i11));
                        if (TagsListView.m84990rM(likeContactItem)) {
                            z11 = true;
                        }
                        if (likeContactItem.m56333d().equals(CoreUtility.f89233i)) {
                            TagsListView.this.f78234X0.add(0, likeContactItem);
                        } else {
                            TagsListView.this.f78234X0.add(likeContactItem);
                        }
                    }
                    if (!z11) {
                        TagsListView tagsListView2 = TagsListView.this;
                        tagsListView2.f78243g1 = tagsListView2.f78234X0.size();
                        TagsListView tagsListView3 = TagsListView.this;
                        if (tagsListView3.f78243g1 < 0) {
                            tagsListView3.f78243g1 = 0;
                        }
                    }
                } else {
                    TagsListView tagsListView4 = TagsListView.this;
                    tagsListView4.f78244h1 = true;
                    tagsListView4.f78243g1 = 0;
                    new C25406e0().m101508a(new C25406e0.a(TagsListView.this.f78236Z0));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            TagsListView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.pq0
                @Override // java.lang.Runnable
                public final void run() {
                    TagsListView.C15162a.this.m85011e();
                }
            });
        }
    }

    /* renamed from: jM */
    public static Intent m84986jM(String str, int i11, String str2, int i12, boolean z11) {
        Intent intent = new Intent();
        intent.putExtra("extra_tag_type", 2);
        intent.putExtra("extra_feed_id", str);
        intent.putExtra("extra_feed_owner_id", str2);
        intent.putExtra("extra_feed_type", i11);
        intent.putExtra("extra_feed_tag_count", i12);
        intent.putExtra("extra_show_option_discuss", z11);
        return intent;
    }

    /* renamed from: kM */
    public static Intent m84987kM(String str, String str2, String str3, int i11) {
        Intent intent = new Intent();
        intent.putExtra("extra_tag_type", 1);
        intent.putExtra("extra_photo_id", str);
        intent.putExtra("extra_feed_owner_id", str2);
        intent.putExtra("extra_feed_tag_count", i11);
        intent.putExtra("extra_feed_id", str3);
        return intent;
    }

    /* renamed from: lM */
    public static Intent m84988lM(String str, int i11) {
        Intent intent = new Intent();
        intent.putExtra("extra_tag_type", 3);
        intent.putExtra("extra_feed_id", str);
        intent.putExtra("extra_feed_tag_count", i11);
        return intent;
    }

    /* renamed from: oM */
    public static ArrayList m84989oM(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent != null) {
            try {
                if (intent.hasExtra("extra_remove_tag_uids")) {
                    return intent.getStringArrayListExtra("extra_remove_tag_uids");
                }
                return arrayList;
            } catch (Exception e11) {
                e11.printStackTrace();
                return arrayList;
            }
        }
        return arrayList;
    }

    /* renamed from: rM */
    static boolean m84990rM(LikeContactItem likeContactItem) {
        if (likeContactItem == null) {
            return false;
        }
        try {
            if (!AbstractC25495a.m132077b(likeContactItem.m56333d())) {
                if (!likeContactItem.m56333d().equals("-1")) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: sM */
    public static boolean m84991sM(Intent intent) {
        if (intent != null) {
            try {
                return intent.getBooleanExtra("extra_feed_has_no_tags", false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: tM */
    public static boolean m84992tM(Intent intent) {
        if (intent != null) {
            try {
                return intent.getBooleanExtra("extra_feed_not_exist", false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m84993vM(LikeContactItem likeContactItem) {
        if (likeContactItem != null) {
            try {
                if (!TextUtils.isEmpty(likeContactItem.m56333d())) {
                    this.f78242f1 = likeContactItem;
                    this.f72421L0.showDialog(1);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m84994wM(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            if (!TextUtils.isEmpty(this.f78242f1.m56333d())) {
                this.f72421L0.mo46829Y();
                rq0.m87390a(this, this.f78242f1.m56333d());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f72421L0.mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m84995xM(InterfaceC17463d interfaceC17463d) {
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f78247k1;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            this.f78247k1.dismiss();
        }
    }

    /* renamed from: AM */
    void m84996AM(int i11) {
        String m118746s0;
        try {
            TextView textView = this.f78232V0;
            if (textView != null) {
                if (i11 <= 0) {
                    m118746s0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleTag);
                } else {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_titleTagCount, Integer.valueOf(i11));
                }
                textView.setText(m118746s0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: BM */
    void m84997BM() {
        this.f78248l1.findViewById(AbstractC6918a0.tags_list_container).setOnClickListener(this);
        this.f78232V0 = (TextView) this.f78248l1.findViewById(AbstractC6918a0.confirm_title);
        m84996AM(this.f78243g1);
        this.f78227Q0 = (LinearLayout) this.f78248l1.findViewById(AbstractC6918a0.layoutLikesLoading);
        this.f78228R0 = (LinearLayout) this.f78248l1.findViewById(AbstractC6918a0.layoutLikesError);
        this.f78230T0 = (ListView) this.f78248l1.findViewById(AbstractC6918a0.likesListview);
        View findViewById = this.f78248l1.findViewById(AbstractC6918a0.btn_retry);
        this.f78240d1 = findViewById;
        findViewById.setOnClickListener(this);
        this.f78231U0 = (TextView) this.f78248l1.findViewById(AbstractC6918a0.list_empty_text);
        this.f78229S0 = (LinearLayout) this.f78248l1.findViewById(AbstractC6918a0.layoutBtnDialog);
        Button button = (Button) this.f78248l1.findViewById(AbstractC6918a0.confirm_btn_no);
        button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close).toUpperCase());
        button.setOnClickListener(this);
        Button button2 = (Button) this.f78248l1.findViewById(AbstractC6918a0.confirm_btn_yes);
        if (this.f78246j1) {
            button2.setVisibility(0);
            button2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_create_group_from_tags).toUpperCase());
            button2.setOnClickListener(this);
        } else {
            button2.setVisibility(8);
        }
        Button button3 = (Button) this.f78248l1.findViewById(AbstractC6918a0.btn_neutral);
        this.f78233W0 = button3;
        button3.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close).toUpperCase());
        this.f78233W0.setOnClickListener(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                if (m92642L3.containsKey("extra_feed_tag_count")) {
                    this.f78243g1 = m92642L3.getInt("extra_feed_tag_count");
                }
                if (m92642L3.containsKey("extra_tag_type")) {
                    this.f78226P0 = m92642L3.getInt("extra_tag_type");
                }
                if (m92642L3.containsKey("extra_feed_type")) {
                    this.f78237a1 = m92642L3.getInt("extra_feed_type");
                }
                if (m92642L3.containsKey("extra_show_option_discuss")) {
                    this.f78246j1 = m92642L3.getBoolean("extra_show_option_discuss");
                }
                if (m85006uM(this.f78226P0)) {
                    int i11 = this.f78226P0;
                    if (i11 == 2) {
                        if (m92642L3.containsKey("extra_feed_id")) {
                            this.f78236Z0 = m92642L3.getString("extra_feed_id");
                        }
                        if (m92642L3.containsKey("extra_feed_owner_id")) {
                            this.f78239c1 = m92642L3.getString("extra_feed_owner_id");
                        }
                        if (TextUtils.isEmpty(this.f78236Z0) || TextUtils.isEmpty(this.f78239c1)) {
                            throw new IllegalArgumentException("Invalid data");
                        }
                        return;
                    }
                    if (i11 == 1) {
                        if (m92642L3.containsKey("extra_photo_id")) {
                            this.f78238b1 = m92642L3.getString("extra_photo_id");
                        }
                        if (m92642L3.containsKey("extra_feed_owner_id")) {
                            this.f78239c1 = m92642L3.getString("extra_feed_owner_id");
                        }
                        if (m92642L3.containsKey("extra_feed_id")) {
                            this.f78236Z0 = m92642L3.getString("extra_feed_id");
                        }
                        if (TextUtils.isEmpty(this.f78238b1) || TextUtils.isEmpty(this.f78239c1) || TextUtils.isEmpty(this.f78236Z0)) {
                            throw new IllegalArgumentException("Invalid data");
                        }
                        return;
                    }
                    if (i11 == 3) {
                        if (m92642L3.containsKey("extra_feed_id")) {
                            this.f78236Z0 = m92642L3.getString("extra_feed_id");
                        }
                        this.f78239c1 = "";
                        if (TextUtils.isEmpty(this.f78236Z0)) {
                            throw new IllegalArgumentException("Invalid data");
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid objec type: " + this.f78226P0);
            }
            throw new IllegalArgumentException("Null intent");
        } catch (Exception e11) {
            e11.printStackTrace();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            this.f72421L0.finish();
        }
    }

    /* renamed from: CM */
    void m84998CM(int i11, Drawable drawable) {
        try {
            TextView textView = this.f78231U0;
            if (textView != null) {
                textView.setText(i11);
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f78231U0.setCompoundDrawables(null, drawable, null, null);
                } else {
                    this.f78231U0.setCompoundDrawables(null, null, null, null);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        String str;
        if (i11 != 1) {
            return null;
        }
        LikeContactItem likeContactItem = this.f78242f1;
        if (likeContactItem != null) {
            if (likeContactItem.m56333d().equals(CoreUtility.f89233i)) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_untag_confirm_msg);
            } else {
                str = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_untag_profile_confirm_msg), this.f78242f1.m56331b());
            }
        } else {
            str = "";
        }
        KeyEventCallbackC17462c m118470w = AbstractC23093i.m118470w(this.f72421L0.m92648SI(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.nq0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                TagsListView.this.m84994wM(interfaceC17463d, i12);
            }
        }, str);
        m118470w.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.oq0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
            /* renamed from: Tv */
            public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                TagsListView.this.m84995xM(interfaceC17463d);
            }
        });
        this.f78247k1 = m118470w;
        return m118470w;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.tags_list_fragment, viewGroup, false);
        this.f78248l1 = inflate;
        return inflate;
    }

    @Override // v20.C27492t.b
    /* renamed from: Gj */
    public void mo84999Gj(LikeContactItem likeContactItem, TrackingSource trackingSource) {
        try {
            C32002l4 m154264g = C32002l4.m154264g(10032);
            if (!AbstractC25495a.m132077b(likeContactItem.m56333d()) && !likeContactItem.m56333d().equals("-1")) {
                new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(likeContactItem.m56333d(), m154264g).m135741H(trackingSource).m135743b(), 0, 1));
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_prevent_viewprofile));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        m84997BM();
        m85005qM();
    }

    /* renamed from: g3 */
    void m85000g3() {
        try {
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(this.f78236Z0)) {
                intent.putExtra("extra_feed_id", this.f78236Z0);
            }
            if (!TextUtils.isEmpty(this.f78238b1)) {
                intent.putExtra("extra_photo_id", this.f78238b1);
            }
            if (this.f78245i1) {
                intent.putExtra("extra_feed_not_exist", true);
            } else {
                boolean z11 = this.f78244h1;
                if (z11) {
                    intent.putExtra("extra_feed_has_no_tags", z11);
                } else {
                    Set set = this.f78241e1;
                    if (set != null && set.size() > 0) {
                        intent.putStringArrayListExtra("extra_remove_tag_uids", new ArrayList<>(this.f78241e1));
                    }
                }
            }
            this.f72421L0.mo50035CK(-1, intent);
            this.f72421L0.finish();
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f72421L0.finish();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "TagsListView";
    }

    /* renamed from: mM */
    void m85001mM(String str) {
        try {
            C27492t c27492t = this.f78235Y0;
            if (c27492t != null) {
                if (c27492t.getCount() == 0) {
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C15162a());
                c0766k.mo1574X8(str);
            }
            this.f78227Q0.setVisibility(0);
            this.f78228R0.setVisibility(8);
            C0766k c0766k2 = new C0766k();
            c0766k2.mo1704o8(new C15162a());
            c0766k2.mo1574X8(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ma */
    void m85002ma() {
        try {
            this.f78230T0.setVisibility(8);
            this.f78228R0.setVisibility(0);
            m84998CM(AbstractC8020f0.str_tv_feednoexist, this.f72421L0.m92651WI().getDrawable(AbstractC16803z.ignore_icon));
            this.f78240d1.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    public void m85003nM() {
        try {
            this.f78234X0.clear();
            C3000l0 mo127471c = C24371m0.m127468p().mo127471c(this.f78236Z0);
            if (mo127471c != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (C3020p0 c3020p0 : mo127471c.f11899s) {
                    C3047v0 c3047v0 = c3020p0.f12022B;
                    linkedHashMap.put(c3020p0.f12022B.f12280b, new LikeContactItem(c3047v0.f12280b, c3047v0.f12282d, c3047v0.f12283e));
                }
                if (linkedHashMap.size() > 0) {
                    this.f78234X0.addAll(linkedHashMap.values());
                    this.f78235Y0.m140591g(this.f78234X0);
                    this.f78230T0.setAdapter((ListAdapter) this.f78235Y0);
                    this.f78235Y0.notifyDataSetChanged();
                    this.f78230T0.setVisibility(0);
                    this.f78227Q0.setVisibility(8);
                    this.f78228R0.setVisibility(8);
                    this.f78229S0.setVisibility(8);
                    this.f78233W0.setVisibility(0);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tags_list_container) {
            m85000g3();
            return;
        }
        if (id2 == AbstractC6918a0.btn_retry) {
            m85001mM(this.f78236Z0);
            return;
        }
        if (id2 == AbstractC6918a0.confirm_btn_no) {
            m85000g3();
            return;
        }
        if (id2 == AbstractC6918a0.confirm_btn_yes) {
            m85000g3();
            C27492t c27492t = this.f78235Y0;
            if (c27492t != null && c27492t.getCount() > 0) {
                ArrayList<String> arrayList = new ArrayList<>();
                for (int i11 = 0; i11 < this.f78235Y0.getCount(); i11++) {
                    String m56333d = ((LikeContactItem) this.f78235Y0.getItem(i11)).m56333d();
                    if (C18644n.m98531l().m98558u(m56333d) && !CoreUtility.f89233i.equals(m56333d)) {
                        arrayList.add(m56333d);
                    }
                }
                if (!TextUtils.isEmpty(this.f78239c1) && C18644n.m98531l().m98558u(this.f78239c1) && !CoreUtility.f89233i.equals(this.f78239c1)) {
                    arrayList.add(this.f78239c1);
                }
                if (arrayList.size() > 0) {
                    Intent intent = new Intent();
                    intent.putStringArrayListExtra("STR_EXTRA_SELECTED_UIDS", arrayList);
                    this.f72421L0.m92662fJ().m93069k2(QuickCreateGroupView.class, intent.getExtras(), 1, true);
                    return;
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_createGroup_fromTag));
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_neutral) {
            m85000g3();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m85000g3();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: pM */
    TrackingSource m85004pM() {
        int i11;
        try {
            if (this.f78226P0 == 2 && !TextUtils.isEmpty(this.f78236Z0) && (i11 = this.f78237a1) >= 0) {
                return FeedActionZUtils.m47564v(this.f78236Z0, i11);
            }
            return new TrackingSource(-1);
        } catch (Exception e11) {
            e11.printStackTrace();
            return new TrackingSource(-1);
        }
    }

    /* renamed from: qM */
    void m85005qM() {
        try {
            this.f78235Y0 = new C27492t(this.f78226P0, this, this.f78239c1, new C27492t.a() { // from class: com.zing.zalo.ui.zviews.mq0
                @Override // v20.C27492t.a
                /* renamed from: a */
                public final void mo87358a(LikeContactItem likeContactItem) {
                    TagsListView.this.m84993vM(likeContactItem);
                }
            }, m85004pM());
            int i11 = this.f78226P0;
            if (i11 == 2) {
                m85001mM(this.f78236Z0);
            } else if (i11 == 1) {
                m85001mM(this.f78236Z0);
            } else if (i11 == 3) {
                m85003nM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            this.f72421L0.finish();
        }
    }

    /* renamed from: uM */
    boolean m85006uM(int i11) {
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    /* renamed from: yM */
    public void m85007yM(Boolean bool) {
        this.f78242f1 = null;
        if (bool.booleanValue()) {
            m85002ma();
            this.f78245i1 = true;
        }
    }

    /* renamed from: zM */
    public void m85008zM(String str) {
        try {
            this.f78242f1 = null;
            this.f78241e1.add(str);
            int i11 = this.f78243g1 - 1;
            this.f78243g1 = i11;
            if (i11 < 0) {
                this.f78243g1 = 0;
            }
            m84996AM(this.f78243g1);
            C27492t c27492t = this.f78235Y0;
            if (c27492t != null) {
                c27492t.m140590f(str);
                if (this.f78235Y0.getCount() == 0 && !this.f72421L0.mo60294yp()) {
                    m85000g3();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
