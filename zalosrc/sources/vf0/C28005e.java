package vf0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.webview.C16794l;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p140ev.C18613b;
import p279jw.C21373a;
import p354n3.C23528a;
import p379o3.C23994e;
import p379o3.C23995f;
import pm0.C24848g0;
import zl0.AbstractC32232i;

/* renamed from: vf0.e */
/* loaded from: classes5.dex */
public final class C28005e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final Context f130592a;

    /* renamed from: b */
    private C18613b f130593b;

    /* renamed from: c */
    private d f130594c;

    /* renamed from: d */
    private final Object f130595d;

    /* renamed from: e */
    private final ConcurrentHashMap f130596e;

    /* renamed from: f */
    private boolean f130597f;

    /* renamed from: g */
    private String[] f130598g;

    /* renamed from: h */
    private int f130599h;

    /* renamed from: i */
    private LinearLayout f130600i;

    /* renamed from: j */
    private ImageButton f130601j;

    /* renamed from: k */
    private ImageButton f130602k;

    /* renamed from: l */
    public ImageButton f130603l;

    /* renamed from: m */
    private AtomicBoolean f130604m;

    /* renamed from: n */
    private C16794l f130605n;

    /* renamed from: o */
    private final List f130606o;

    /* renamed from: vf0.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: vf0.e$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final int f130607a;

        /* renamed from: b */
        private final String f130608b;

        /* renamed from: c */
        private final String f130609c;

        /* renamed from: d */
        private final String f130610d;

        /* renamed from: e */
        private final int f130611e;

        /* renamed from: f */
        private final int f130612f;

        /* renamed from: g */
        private final String f130613g;

        /* renamed from: h */
        private final String f130614h;

        public b(int i11, String str, String str2, String str3, int i12, int i13, String str4, String str5) {
            AbstractC19074t.m100208f(str2, "mAction");
            AbstractC19074t.m100208f(str3, "mIconUrl");
            AbstractC19074t.m100208f(str4, "mData");
            this.f130607a = i11;
            this.f130608b = str;
            this.f130609c = str2;
            this.f130610d = str3;
            this.f130611e = i12;
            this.f130612f = i13;
            this.f130613g = str4;
            this.f130614h = str5;
        }

        /* renamed from: a */
        public final String m141149a() {
            return this.f130609c;
        }

        /* renamed from: b */
        public final String m141150b() {
            return this.f130613g;
        }

        /* renamed from: c */
        public final String m141151c() {
            return this.f130614h;
        }

        /* renamed from: d */
        public final int m141152d() {
            return this.f130607a;
        }

        /* renamed from: e */
        public final String m141153e() {
            return this.f130610d;
        }

        /* renamed from: f */
        public final int m141154f() {
            return this.f130611e;
        }

        /* renamed from: g */
        public final String m141155g() {
            return this.f130608b;
        }
    }

    /* renamed from: vf0.e$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        private TextView f130615a;

        /* renamed from: a */
        public final TextView m141156a() {
            return this.f130615a;
        }

        /* renamed from: b */
        public final void m141157b(TextView textView) {
            this.f130615a = textView;
        }
    }

    /* renamed from: vf0.e$d */
    /* loaded from: classes5.dex */
    public interface d {
        /* renamed from: a */
        void mo87186a(int i11);
    }

    /* renamed from: vf0.e$e */
    /* loaded from: classes5.dex */
    public static final class e extends C23994e {

        /* renamed from: v0 */
        final /* synthetic */ TextView f130616v0;

        /* renamed from: w0 */
        final /* synthetic */ b f130617w0;

        /* renamed from: x0 */
        final /* synthetic */ C28005e f130618x0;

        /* renamed from: y0 */
        final /* synthetic */ ActionBarMenuItem f130619y0;

        /* renamed from: z0 */
        final /* synthetic */ c f130620z0;

        e(TextView textView, b bVar, C28005e c28005e, ActionBarMenuItem actionBarMenuItem, c cVar) {
            this.f130616v0 = textView;
            this.f130617w0 = bVar;
            this.f130618x0 = c28005e;
            this.f130619y0 = actionBarMenuItem;
            this.f130620z0 = cVar;
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1, reason: merged with bridge method [inline-methods] */
        public void mo1932C(String str, Bitmap bitmap, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c23995f, "status");
            if (bitmap != null && c23995f.m125657h() == 200) {
                int m155453a = AbstractC32232i.m155453a(24.0f);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f130616v0.getResources(), Bitmap.createScaledBitmap(bitmap, m155453a, m155453a, true));
                this.f130616v0.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                if (this.f130617w0.m141154f() == 1) {
                    C28005e c28005e = this.f130618x0;
                    ActionBarMenuItem actionBarMenuItem = this.f130619y0;
                    b bVar = this.f130617w0;
                    AbstractC19074t.m100207e(bVar, "$item");
                    c28005e.m141132u(actionBarMenuItem, bVar, bitmapDrawable, this.f130620z0);
                }
            }
        }
    }

    public C28005e(Context context, C18613b c18613b, d dVar) {
        AbstractC19074t.m100208f(context, "context");
        this.f130592a = context;
        this.f130593b = c18613b;
        this.f130594c = dVar;
        this.f130595d = new Object();
        this.f130596e = new ConcurrentHashMap();
        this.f130598g = new String[]{"action.open.sharesheet", "action.open.postfeed", "action.view.myqr", "action.follow.oa", "action.report.abuse", "action.unfollow.oa", "action.report.ads", "zalo.web.internal.action.copy.url", "zalo.web.internal.action.open.url.outapp", "zalo.web.internal.postfeed", "zalo.web.internal.sharesheet", "zalo.web.internal.report", "zalo.web.internal.save.to.mycloud", "action.report.abuse.v2"};
        this.f130604m = new AtomicBoolean(false);
        this.f130606o = new ArrayList();
        m141133v();
        m141129q();
    }

    /* renamed from: m */
    private final LinearLayout m141125m() {
        if (this.f130600i == null) {
            Object systemService = this.f130592a.getSystemService("layout_inflater");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            ImageButton imageButton = null;
            LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) systemService).inflate(AbstractC7409c0.web_option_menu_header, (ViewGroup) null);
            this.f130600i = linearLayout;
            AbstractC19074t.m100205c(linearLayout);
            View findViewById = linearLayout.findViewById(AbstractC6918a0.web_back);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            ImageButton imageButton2 = (ImageButton) findViewById;
            this.f130601j = imageButton2;
            if (imageButton2 == null) {
                AbstractC19074t.m100223u("btnPrevious");
                imageButton2 = null;
            }
            imageButton2.setEnabled(false);
            ImageButton imageButton3 = this.f130601j;
            if (imageButton3 == null) {
                AbstractC19074t.m100223u("btnPrevious");
                imageButton3 = null;
            }
            imageButton3.setOnClickListener(new View.OnClickListener() { // from class: vf0.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C28005e.m141128p(C28005e.this, view);
                }
            });
            LinearLayout linearLayout2 = this.f130600i;
            AbstractC19074t.m100205c(linearLayout2);
            View findViewById2 = linearLayout2.findViewById(AbstractC6918a0.web_refresh);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            ImageButton imageButton4 = (ImageButton) findViewById2;
            this.f130602k = imageButton4;
            if (imageButton4 == null) {
                AbstractC19074t.m100223u("btnReload");
            } else {
                imageButton = imageButton4;
            }
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: vf0.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C28005e.m141126n(C28005e.this, view);
                }
            });
            LinearLayout linearLayout3 = this.f130600i;
            AbstractC19074t.m100205c(linearLayout3);
            View findViewById3 = linearLayout3.findViewById(AbstractC6918a0.web_forward);
            AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
            m141146x((ImageButton) findViewById3);
            m141140h().setEnabled(false);
            m141140h().setOnClickListener(new View.OnClickListener() { // from class: vf0.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C28005e.m141127o(C28005e.this, view);
                }
            });
        }
        return this.f130600i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m141126n(C28005e c28005e, View view) {
        AbstractC19074t.m100208f(c28005e, "this$0");
        d dVar = c28005e.f130594c;
        if (dVar != null) {
            dVar.mo87186a(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m141127o(C28005e c28005e, View view) {
        AbstractC19074t.m100208f(c28005e, "this$0");
        d dVar = c28005e.f130594c;
        if (dVar != null) {
            dVar.mo87186a(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m141128p(C28005e c28005e, View view) {
        AbstractC19074t.m100208f(c28005e, "this$0");
        d dVar = c28005e.f130594c;
        if (dVar != null) {
            dVar.mo87186a(1);
        }
    }

    /* renamed from: q */
    private final void m141129q() {
        synchronized (this.f130595d) {
            try {
                if (this.f130599h == 0) {
                    this.f130596e.clear();
                    b bVar = new b(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, AbstractC23136l9.m118746s0(AbstractC8020f0.str_save_link_to_my_cloud_option_title, C21373a.f104231a.m110805u()), "zalo.web.internal.save.to.mycloud", "", 0, 0, "", "");
                    this.f130596e.put(Integer.valueOf(bVar.m141152d()), bVar);
                    b bVar2 = new b(ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, AbstractC23136l9.m118743r0(AbstractC8020f0.str_optionM_shareVipAcc), "zalo.web.internal.sharesheet", "", 0, 0, "", "");
                    this.f130596e.put(Integer.valueOf(bVar2.m141152d()), bVar2);
                    b bVar3 = new b(ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE, AbstractC23136l9.m118743r0(AbstractC8020f0.str_optionM_shareVipAccOnTimeLine), "zalo.web.internal.postfeed", "", 0, 0, "", "");
                    this.f130596e.put(Integer.valueOf(bVar3.m141152d()), bVar3);
                    b bVar4 = new b(ZAbstractBase.ZVU_PROCESS_HLS_TO_MP4, AbstractC23136l9.m118743r0(AbstractC8020f0.browser_menu_more_copy_url), "zalo.web.internal.action.copy.url", "", 0, 0, "", "");
                    this.f130596e.put(Integer.valueOf(bVar4.m141152d()), bVar4);
                    b bVar5 = new b(2005, AbstractC23136l9.m118743r0(AbstractC8020f0.browser_menu_more_open_with_browser), "zalo.web.internal.action.open.url.outapp", "", 0, 0, "", "");
                    this.f130596e.put(Integer.valueOf(bVar5.m141152d()), bVar5);
                    b bVar6 = new b(2006, AbstractC23136l9.m118743r0(AbstractC8020f0.str_item_report_link), "zalo.web.internal.report", "", 0, 0, "", "");
                    this.f130596e.put(Integer.valueOf(bVar6.m141152d()), bVar6);
                } else {
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    private final boolean m141130r(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = this.f130598g.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (AbstractC19074t.m100204b(this.f130598g[i11], str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m141131t(C28005e c28005e) {
        AbstractC19074t.m100208f(c28005e, "this$0");
        if (c28005e.f130606o.size() > 0) {
            c28005e.m141135A(c28005e.f130606o);
            c28005e.f130606o.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m141132u(ActionBarMenuItem actionBarMenuItem, b bVar, Drawable drawable, c cVar) {
        synchronized (this.f130595d) {
            try {
                if (actionBarMenuItem.getParentMenu().getChildCount() < 3) {
                    ActionBarMenuItem m92743j = actionBarMenuItem.getParentMenu().m92743j(bVar.m141152d(), drawable, 0);
                    m92743j.setPadding(AbstractC32232i.m155453a(5.0f), m92743j.getPaddingTop(), AbstractC32232i.m155453a(5.0f), m92743j.getPaddingBottom());
                    ViewGroup.LayoutParams layoutParams = m92743j.getLayoutParams();
                    AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.width = AbstractC32232i.m155453a(36.0f);
                    m92743j.setLayoutParams(layoutParams2);
                    actionBarMenuItem.m92781z(cVar.m141156a());
                    if (actionBarMenuItem.getPopupLayout().getItemsCount() == 0) {
                        actionBarMenuItem.setVisibility(8);
                        View childAt = actionBarMenuItem.getParentMenu().getChildAt(actionBarMenuItem.getParentMenu().getChildCount() - 2);
                        AbstractC19074t.m100206d(childAt, "null cannot be cast to non-null type com.zing.zalo.zview.actionbar.ActionBarMenuItem");
                        ActionBarMenuItem actionBarMenuItem2 = (ActionBarMenuItem) childAt;
                        actionBarMenuItem2.setPadding(AbstractC32232i.m155453a(5.0f), m92743j.getPaddingTop(), AbstractC32232i.m155453a(15.0f), m92743j.getPaddingBottom());
                        ViewGroup.LayoutParams layoutParams3 = actionBarMenuItem2.getLayoutParams();
                        AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                        layoutParams4.width = AbstractC32232i.m155453a(46.0f);
                        actionBarMenuItem2.setLayoutParams(layoutParams4);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: v */
    private final void m141133v() {
        this.f130604m.set(false);
        this.f130596e.clear();
        this.f130597f = false;
        C18613b c18613b = this.f130593b;
        if (c18613b != null) {
            int intValue = Integer.valueOf(c18613b.m98348a()).intValue();
            if (intValue != 1) {
                if (intValue != 3) {
                    if (intValue != 4) {
                        this.f130599h = 1;
                    } else {
                        this.f130599h = 2;
                    }
                } else {
                    this.f130599h = 3;
                }
            } else {
                this.f130599h = 0;
                this.f130597f = true;
            }
        }
        m141129q();
    }

    /* renamed from: w */
    private final String m141134w(String str, JSONObject jSONObject) {
        int i11;
        if (str == null || !AbstractC19074t.m100204b(str, "action.report.ads") || jSONObject == null) {
            return null;
        }
        if (jSONObject.optInt("flag") == 1) {
            i11 = AbstractC8020f0.str_report_this_ad;
        } else {
            i11 = AbstractC8020f0.str_hide_this_ad;
        }
        return AbstractC23136l9.m118743r0(i11);
    }

    /* renamed from: A */
    public final void m141135A(List list) {
        AbstractC19074t.m100208f(list, "statuses");
        if (this.f130600i == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ImageButton imageButton = null;
            switch (((Number) it.next()).intValue()) {
                case 1:
                    ImageButton imageButton2 = this.f130602k;
                    if (imageButton2 == null) {
                        AbstractC19074t.m100223u("btnReload");
                    } else {
                        imageButton = imageButton2;
                    }
                    imageButton.setImageResource(AbstractC16803z.btn_stop);
                    break;
                case 2:
                    ImageButton imageButton3 = this.f130602k;
                    if (imageButton3 == null) {
                        AbstractC19074t.m100223u("btnReload");
                    } else {
                        imageButton = imageButton3;
                    }
                    imageButton.setImageResource(AbstractC16803z.icn_browser_refresh);
                    break;
                case 3:
                    ImageButton imageButton4 = this.f130601j;
                    if (imageButton4 == null) {
                        AbstractC19074t.m100223u("btnPrevious");
                    } else {
                        imageButton = imageButton4;
                    }
                    imageButton.setEnabled(true);
                    break;
                case 4:
                    ImageButton imageButton5 = this.f130601j;
                    if (imageButton5 == null) {
                        AbstractC19074t.m100223u("btnPrevious");
                    } else {
                        imageButton = imageButton5;
                    }
                    imageButton.setEnabled(false);
                    break;
                case 5:
                    m141140h().setEnabled(true);
                    break;
                case 6:
                    m141140h().setEnabled(false);
                    break;
            }
        }
    }

    /* renamed from: B */
    public final void m141136B(int... iArr) {
        AbstractC19074t.m100208f(iArr, "statuses");
        if (this.f130600i == null) {
            return;
        }
        for (int i11 : iArr) {
            ImageButton imageButton = null;
            switch (i11) {
                case 1:
                    ImageButton imageButton2 = this.f130602k;
                    if (imageButton2 == null) {
                        AbstractC19074t.m100223u("btnReload");
                    } else {
                        imageButton = imageButton2;
                    }
                    imageButton.setImageResource(AbstractC16803z.btn_stop);
                    break;
                case 2:
                    ImageButton imageButton3 = this.f130602k;
                    if (imageButton3 == null) {
                        AbstractC19074t.m100223u("btnReload");
                    } else {
                        imageButton = imageButton3;
                    }
                    imageButton.setImageResource(AbstractC16803z.icn_browser_refresh);
                    break;
                case 3:
                    ImageButton imageButton4 = this.f130601j;
                    if (imageButton4 == null) {
                        AbstractC19074t.m100223u("btnPrevious");
                    } else {
                        imageButton = imageButton4;
                    }
                    imageButton.setEnabled(true);
                    break;
                case 4:
                    ImageButton imageButton5 = this.f130601j;
                    if (imageButton5 == null) {
                        AbstractC19074t.m100223u("btnPrevious");
                    } else {
                        imageButton = imageButton5;
                    }
                    imageButton.setEnabled(false);
                    break;
                case 5:
                    m141140h().setEnabled(true);
                    break;
                case 6:
                    m141140h().setEnabled(false);
                    break;
            }
        }
    }

    /* renamed from: C */
    public final void m141137C(String str) {
        try {
            this.f130605n = new C16794l(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public final boolean m141138f() {
        if (AbstractC19074t.m100204b(this.f130593b, C18613b.f93601t) || AbstractC19074t.m100204b(this.f130593b, C18613b.f93600s) || this.f130596e.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m141139g(String str) {
        boolean z11;
        String str2;
        JSONArray jSONArray;
        String str3;
        String str4;
        synchronized (this.f130595d) {
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        this.f130604m.set(true);
                        JSONObject jSONObject = new JSONObject(str);
                        int i11 = 0;
                        if (jSONObject.optInt("supportToolBar", 0) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f130597f = z11;
                        if (jSONObject.optInt("reset", 0) == 1) {
                            m141133v();
                            return;
                        }
                        JSONArray jSONArray2 = jSONObject.getJSONArray("menuListItems");
                        if (jSONObject.has("callback")) {
                            str2 = jSONObject.getString("callback");
                        } else {
                            str2 = null;
                        }
                        this.f130596e.clear();
                        int length = jSONArray2.length();
                        if (length > 0) {
                            int i12 = ZAbstractBase.ZVU_PROCESS_FLUSH;
                            while (i11 < length) {
                                Object obj = jSONArray2.get(i11);
                                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                                JSONObject jSONObject2 = (JSONObject) obj;
                                if (jSONObject2.has("action")) {
                                    String string = jSONObject2.getString("action");
                                    AbstractC19074t.m100205c(string);
                                    if (m141130r(string)) {
                                        JSONObject optJSONObject = jSONObject2.optJSONObject("data");
                                        String m141134w = m141134w(string, optJSONObject);
                                        if (TextUtils.isEmpty(m141134w)) {
                                            m141134w = jSONObject2.optString("title");
                                        }
                                        String str5 = m141134w;
                                        if (!TextUtils.isEmpty(str5)) {
                                            int optInt = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                            String optString = jSONObject2.optString("iconUrl");
                                            int optInt2 = jSONObject2.optInt("showAsAction");
                                            ConcurrentHashMap concurrentHashMap = this.f130596e;
                                            i12++;
                                            Integer valueOf = Integer.valueOf(i12);
                                            AbstractC19074t.m100205c(optString);
                                            if (optJSONObject != null) {
                                                str3 = optJSONObject.toString();
                                                if (str3 == null) {
                                                }
                                                String str6 = str3;
                                                AbstractC19074t.m100205c(str6);
                                                if (TextUtils.isEmpty(str2)) {
                                                    str4 = str2;
                                                } else {
                                                    str4 = "";
                                                }
                                                jSONArray = jSONArray2;
                                                concurrentHashMap.put(valueOf, new b(i12, str5, string, optString, optInt2, optInt, str6, str4));
                                                i11++;
                                                jSONArray2 = jSONArray;
                                            }
                                            str3 = "";
                                            String str62 = str3;
                                            AbstractC19074t.m100205c(str62);
                                            if (TextUtils.isEmpty(str2)) {
                                            }
                                            jSONArray = jSONArray2;
                                            concurrentHashMap.put(valueOf, new b(i12, str5, string, optString, optInt2, optInt, str62, str4));
                                            i11++;
                                            jSONArray2 = jSONArray;
                                        }
                                    }
                                }
                                jSONArray = jSONArray2;
                                i11++;
                                jSONArray2 = jSONArray;
                            }
                        }
                        this.f130599h = 4;
                        return;
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
            m141133v();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: h */
    public final ImageButton m141140h() {
        ImageButton imageButton = this.f130603l;
        if (imageButton != null) {
            return imageButton;
        }
        AbstractC19074t.m100223u("btnNext");
        return null;
    }

    /* renamed from: i */
    public final AtomicBoolean m141141i() {
        return this.f130604m;
    }

    /* renamed from: j */
    public final b m141142j(int i11) {
        b bVar;
        synchronized (this.f130595d) {
            bVar = (b) this.f130596e.get(Integer.valueOf(i11));
        }
        return bVar;
    }

    /* renamed from: k */
    public final List m141143k() {
        return this.f130606o;
    }

    /* renamed from: l */
    public final C16794l m141144l() {
        return this.f130605n;
    }

    /* renamed from: s */
    public final void m141145s(ActionBarMenuItem actionBarMenuItem) {
        ViewParent parent;
        AbstractC19074t.m100208f(actionBarMenuItem, "menuItem");
        synchronized (this.f130595d) {
            try {
                try {
                    if (this.f130597f) {
                        LinearLayout m141125m = m141125m();
                        if (m141125m != null && (parent = m141125m.getParent()) != null) {
                            AbstractC19074t.m100205c(parent);
                            ((ViewGroup) parent).removeView(m141125m);
                        }
                        actionBarMenuItem.m92773i(m141125m);
                    }
                    if (this.f130596e.size() > 0) {
                        for (b bVar : this.f130596e.values()) {
                            if (!TextUtils.isEmpty(bVar.m141155g())) {
                                View m92774j = actionBarMenuItem.m92774j(AbstractC23136l9.m118733o(this.f130592a, bVar.m141152d(), bVar.m141155g(), null));
                                if (!TextUtils.isEmpty(bVar.m141153e())) {
                                    c cVar = new c();
                                    AbstractC19074t.m100206d(m92774j, "null cannot be cast to non-null type android.widget.TextView");
                                    cVar.m141157b((TextView) m92774j);
                                    TextView m141156a = cVar.m141156a();
                                    if (m141156a != null) {
                                        new C23528a(m141156a.getContext()).m123596a(bVar.m141153e(), Bitmap.class, 0L, new e(m141156a, bVar, this, actionBarMenuItem, cVar));
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                actionBarMenuItem.setSubMenuDismissListener(new PopupWindow.OnDismissListener() { // from class: vf0.a
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        C28005e.m141131t(C28005e.this);
                    }
                });
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x */
    public final void m141146x(ImageButton imageButton) {
        AbstractC19074t.m100208f(imageButton, "<set-?>");
        this.f130603l = imageButton;
    }

    /* renamed from: y */
    public final void m141147y(C18613b c18613b) {
        if (AbstractC19074t.m100204b(this.f130593b, c18613b)) {
            return;
        }
        this.f130593b = c18613b;
        m141133v();
    }

    /* renamed from: z */
    public final boolean m141148z() {
        LinearLayout linearLayout = this.f130600i;
        if (linearLayout != null) {
            return linearLayout.isShown();
        }
        return false;
    }
}
