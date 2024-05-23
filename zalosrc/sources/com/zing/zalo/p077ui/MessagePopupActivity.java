package com.zing.zalo.p077ui;

import ac.C0697c0;
import ae.C0766k;
import ag0.AbstractC0837p0;
import am.C0943w;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.Editable;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import au.AbstractC2351i;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.adapters.C7063f5;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ContentMessagePopup;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.MessagePopupActivity;
import com.zing.zalo.p077ui.widget.SlidingTabLayout;
import com.zing.zalo.p077ui.widget.ViewPagerFakeDragFixed;
import com.zing.zalo.stickers.StickerQuickItem;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p588vw.C28644j;
import p716zh.C31973j5;
import p716zh.C31986k3;
import vg.C28023b6;
import vg.C28203u6;
import xd0.C29599o;

/* loaded from: classes5.dex */
public class MessagePopupActivity extends BaseZaloActivity implements View.OnClickListener, View.OnFocusChangeListener, C28644j.o {

    /* renamed from: D0 */
    static ArrayList f55297D0 = new ArrayList();

    /* renamed from: E0 */
    private static MessagePopupActivity f55298E0 = null;

    /* renamed from: F0 */
    private static boolean f55299F0 = false;

    /* renamed from: i0 */
    EditText f55303i0;

    /* renamed from: j0 */
    ImageButton f55304j0;

    /* renamed from: k0 */
    AppCompatImageView f55305k0;

    /* renamed from: l0 */
    C23528a f55306l0;

    /* renamed from: m0 */
    C10951e f55307m0;

    /* renamed from: n0 */
    ViewPagerFakeDragFixed f55308n0;

    /* renamed from: o0 */
    SlidingTabLayout f55309o0;

    /* renamed from: p0 */
    FrameLayout f55310p0;

    /* renamed from: q0 */
    LinearLayout f55311q0;

    /* renamed from: r0 */
    TextView f55312r0;

    /* renamed from: v0 */
    C7063f5 f55316v0;

    /* renamed from: x0 */
    GestureDetector f55318x0;

    /* renamed from: s0 */
    boolean f55313s0 = false;

    /* renamed from: t0 */
    int f55314t0 = 0;

    /* renamed from: u0 */
    int f55315u0 = 0;

    /* renamed from: w0 */
    int f55317w0 = 1;

    /* renamed from: y0 */
    boolean f55319y0 = false;

    /* renamed from: z0 */
    boolean f55320z0 = false;

    /* renamed from: A0 */
    private final C29599o f55300A0 = AbstractC23306f.m120694n1();

    /* renamed from: B0 */
    long f55301B0 = 0;

    /* renamed from: C0 */
    long f55302C0 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.MessagePopupActivity$a */
    /* loaded from: classes5.dex */
    public class C10947a extends AbstractC18391a {
        C10947a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (!MessagePopupActivity.this.f55303i0.getText().toString().trim().equals("")) {
                    MessagePopupActivity.this.m56891e5(0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            try {
                if (TextUtils.isEmpty(charSequence)) {
                    MessagePopupActivity.this.m56893oi();
                    return;
                }
                MessagePopupActivity.this.m56889Vf();
                if (charSequence.length() >= 300) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_text));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.MessagePopupActivity$b */
    /* loaded from: classes5.dex */
    public class C10948b extends ViewPager.C6879n {
        C10948b() {
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            MessagePopupActivity.this.f55315u0 = i11;
            try {
                AbstractC23647d.m123907q("16400", "");
                ArrayList arrayList = MessagePopupActivity.f55297D0;
                if (arrayList != null) {
                }
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.MessagePopupActivity$c */
    /* loaded from: classes5.dex */
    public class C10949c extends GestureDetector.SimpleOnGestureListener {
        C10949c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            AbstractC23647d.m123907q("16601", "");
            TextView textView = MessagePopupActivity.this.f55312r0;
            if (textView != null) {
                textView.setVisibility(8);
                MessagePopupActivity.this.f55313s0 = true;
            }
            AbstractC23647d.m123893c();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.MessagePopupActivity$d */
    /* loaded from: classes5.dex */
    public class C10950d implements InterfaceC20094a {
        C10950d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ArrayList arrayList = MessagePopupActivity.f55297D0;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ArrayList arrayList = MessagePopupActivity.f55297D0;
        }
    }

    /* renamed from: com.zing.zalo.ui.MessagePopupActivity$e */
    /* loaded from: classes5.dex */
    private class C10951e extends BroadcastReceiver {
        public C10951e(MessagePopupActivity messagePopupActivity) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.zing.zalo.ui.MessagePopupActivityIntent");
            AbstractC2351i.m12327a(messagePopupActivity, this, intentFilter, true);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && !TextUtils.isEmpty(intent.getAction()) && intent.getAction().equals("com.zing.zalo.ui.MessagePopupActivityIntent")) {
                try {
                    ArrayList arrayList = MessagePopupActivity.f55297D0;
                    if (arrayList != null && arrayList.size() > 0) {
                        MessagePopupActivity.this.f55314t0 = MessagePopupActivity.f55297D0.size();
                        MessagePopupActivity messagePopupActivity = MessagePopupActivity.this;
                        if (!messagePopupActivity.f55319y0) {
                            messagePopupActivity.f55315u0 = messagePopupActivity.f55314t0 - 1;
                        }
                        messagePopupActivity.f55316v0.m36067z(MessagePopupActivity.f55297D0);
                        MessagePopupActivity messagePopupActivity2 = MessagePopupActivity.this;
                        messagePopupActivity2.f55308n0.setAdapter(messagePopupActivity2.f55316v0);
                        MessagePopupActivity messagePopupActivity3 = MessagePopupActivity.this;
                        messagePopupActivity3.f55308n0.setCurrentItem(messagePopupActivity3.f55315u0);
                        MessagePopupActivity.this.f55309o0.m75891d();
                        MessagePopupActivity.this.f55309o0.getTabStrip().m75896b(MessagePopupActivity.this.f55315u0);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F4 */
    public /* synthetic */ void m56873F4() {
        try {
            Rect rect = new Rect();
            AppCompatImageView appCompatImageView = this.f55305k0;
            appCompatImageView.getHitRect(rect);
            rect.top -= 20;
            rect.bottom += 20;
            rect.left -= 20;
            rect.right += 20;
            TouchDelegate touchDelegate = new TouchDelegate(rect, appCompatImageView);
            if (View.class.isInstance(appCompatImageView.getParent())) {
                ((View) appCompatImageView.getParent()).setTouchDelegate(touchDelegate);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H4 */
    public /* synthetic */ boolean m56874H4(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f55318x0;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N4 */
    public /* synthetic */ void m56875N4(C25630b c25630b, View view) {
        AbstractC23647d.m123907q("16602", "");
        m56892i5(c25630b);
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O4 */
    public /* synthetic */ void m56876O4(LinkedHashMap linkedHashMap) {
        int i11;
        int i12 = 8;
        if (linkedHashMap != null && linkedHashMap.size() > 0) {
            if (AbstractC23136l9.m118654H0(this)) {
                i11 = 4;
            } else {
                i11 = 5;
            }
            int i13 = (int) ((getResources().getDisplayMetrics().densityDpi * 60) / 160.0f);
            this.f55310p0.setVisibility(0);
            TextView textView = this.f55312r0;
            if (!this.f55313s0) {
                i12 = 0;
            }
            textView.setVisibility(i12);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (this.f55311q0.getChildCount() != i11) {
                    final C25630b m143290W = C28644j.m143233Y().m143290W((String) entry.getKey());
                    String str = m143290W.m132429g() + "";
                    StickerQuickItem stickerQuickItem = new StickerQuickItem(this);
                    stickerQuickItem.setEmoticon(str);
                    stickerQuickItem.setGifInfo(m143290W);
                    stickerQuickItem.setOnClickListener(new View.OnClickListener() { // from class: h40.c1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MessagePopupActivity.this.m56875N4(m143290W, view);
                        }
                    });
                    this.f55311q0.addView(stickerQuickItem, new LinearLayout.LayoutParams(i13, i13, 1.0f));
                } else {
                    return;
                }
            }
            return;
        }
        this.f55310p0.setVisibility(8);
        this.f55312r0.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V4 */
    public /* synthetic */ void m56878V4(int i11) {
        int i12;
        try {
            String str = ((ContentMessagePopup) f55297D0.get(this.f55315u0)).f42518p;
            if (!AbstractC25495a.m132079d(str) && System.currentTimeMillis() - this.f55301B0 >= 12000 && System.currentTimeMillis() - this.f55302C0 >= 3000) {
                this.f55301B0 = System.currentTimeMillis();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C10950d());
                if (AbstractC21935u.m114518H(str)) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                c0766k.mo1573X7(str, i11, i12, C31986k3.f147083a.m154105P1(str));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: d5 */
    private void m56881d5() {
        String str;
        ArrayList arrayList;
        int i11;
        ContactProfile m141809c;
        try {
            EditText editText = this.f55303i0;
            if (editText == null) {
                str = "";
            } else {
                str = editText.getText().toString().trim();
            }
            if (!TextUtils.isEmpty(str) && (arrayList = f55297D0) != null && !arrayList.isEmpty() && (i11 = this.f55315u0) >= 0 && i11 < f55297D0.size()) {
                String str2 = ((ContentMessagePopup) f55297D0.get(this.f55315u0)).f42518p;
                C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str2, CoreUtility.f89233i), 0).m95382r(str).m95365a();
                m95365a.m94951M9();
                if (AbstractC25495a.m132079d(str2)) {
                    C31973j5 m4472f = C0943w.m4462l().m4472f(AbstractC25495a.m132088m(str2));
                    if (m4472f != null) {
                        m141809c = new ContactProfile(str2);
                        m141809c.f42437s = m4472f.m153793y();
                        m141809c.f42446v = m4472f.m153756e();
                    } else {
                        m141809c = null;
                    }
                } else {
                    m141809c = C28203u6.f131407a.m141809c(str2);
                }
                if (m141809c != null) {
                    this.f55300A0.m101500a(new C29599o.a(m141809c.mo2478b(), m95365a));
                    C28023b6.m141250h0().m141293J(str2);
                    m56894t4(false);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o5 */
    public static void m56884o5(boolean z11) {
        f55299F0 = z11;
    }

    /* renamed from: s5 */
    public static void m56885s5(ArrayList arrayList) {
        f55297D0 = arrayList;
    }

    /* renamed from: u4 */
    public static MessagePopupActivity m56886u4() {
        return f55298E0;
    }

    /* renamed from: v4 */
    public static ArrayList m56887v4() {
        return f55297D0;
    }

    /* renamed from: z4 */
    public static boolean m56888z4() {
        return f55299F0;
    }

    /* renamed from: Vf */
    void m56889Vf() {
        try {
            this.f55303i0.setVisibility(0);
            this.f55303i0.requestFocus();
            this.f55317w0 = 2;
            this.f55304j0.setImageResource(AbstractC16803z.btn_send_normal);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a5 */
    void m56890a5() {
        this.f55301B0 = 0L;
        this.f55302C0 = System.currentTimeMillis();
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity
    /* renamed from: d3 */
    protected void mo56688d3() {
        C23212s8.m119599f(getContext(), true, AbstractC8915g0.ThemeDefault_TranslucentDark, AbstractC8915g0.ThemeDefault_TranslucentLight);
    }

    /* renamed from: e5 */
    void m56891e5(final int i11) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: h40.a1
            @Override // java.lang.Runnable
            public final void run() {
                MessagePopupActivity.this.m56878V4(i11);
            }
        });
    }

    @Override // p588vw.C28644j.o
    /* renamed from: f1 */
    public void mo16628f1(List list, List list2) {
        int intValue = ((Integer) list.get(0)).intValue();
        final LinkedHashMap linkedHashMap = (LinkedHashMap) list2.get(0);
        if (intValue != 39) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: h40.b1
            @Override // java.lang.Runnable
            public final void run() {
                MessagePopupActivity.this.m56876O4(linkedHashMap);
            }
        });
    }

    /* renamed from: i5 */
    public void m56892i5(C25630b c25630b) {
        ArrayList arrayList;
        int i11;
        if (c25630b != null) {
            try {
                if (c25630b.m132400H() && (arrayList = f55297D0) != null && !arrayList.isEmpty() && (i11 = this.f55315u0) >= 0 && i11 < f55297D0.size()) {
                    String str = ((ContentMessagePopup) f55297D0.get(this.f55315u0)).f42518p;
                    String str2 = CoreUtility.f89233i;
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        m56890a5();
                        if (C28203u6.f131407a.m141809c(str) != null) {
                            AbstractC23112j7.m118530g0(str, c25630b, null, "chat_send");
                            C28023b6.m141250h0().m141293J(str);
                            m56894t4(false);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: oi */
    void m56893oi() {
        try {
            this.f55303i0.setVisibility(0);
            this.f55303i0.requestFocus();
            this.f55317w0 = 1;
            this.f55304j0.setImageResource(AbstractC16803z.btn_send_disable);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_close_dialog) {
            AbstractC23647d.m123907q("16200", "");
            m56894t4(true);
            AbstractC23647d.m123893c();
        } else if (id2 == AbstractC6918a0.chatinput_send) {
            try {
                AbstractC23647d.m123907q("16300", "");
                int i11 = this.f55317w0;
                if (i11 == 2) {
                    m56881d5();
                } else if (i11 == 1) {
                    this.f55310p0.setVisibility(0);
                    if (!this.f55313s0) {
                        this.f55312r0.setVisibility(0);
                    }
                }
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        if (bundle == null) {
            try {
                AbstractC23647d.m123907q("16100", "");
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        setContentView(LayoutInflater.from(this).inflate(AbstractC7409c0.popup, (ViewGroup) null));
        this.f55320z0 = true;
        try {
            this.f55306l0 = new C23528a((Activity) this);
            f55298E0 = this;
            if (f55297D0 == null) {
                f55297D0 = new ArrayList();
            }
            onNewIntent(getIntent());
            if (AbstractC23309i.m121564Wd()) {
                Window window = getWindow();
                window.addFlags(4718592);
                if (!((PowerManager) getSystemService("power")).isScreenOn()) {
                    window.addFlags(2097152);
                }
            }
        } catch (Exception unused) {
            m56894t4(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f55299F0 = false;
        ArrayList arrayList = f55297D0;
        if (arrayList != null) {
            arrayList.clear();
            f55297D0 = null;
        }
        f55298E0 = null;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z11) {
        this.f55319y0 = z11;
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m56894t4(true);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        try {
            if (f55297D0 == null) {
                f55297D0 = new ArrayList();
            }
            int size = f55297D0.size();
            this.f55314t0 = size;
            if (size > 0 && !TextUtils.isEmpty(((ContentMessagePopup) f55297D0.get(size - 1)).f42518p)) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(AbstractC6918a0.btn_close_dialog);
                this.f55305k0 = appCompatImageView;
                appCompatImageView.setOnClickListener(this);
                ((LinearLayout) findViewById(AbstractC6918a0.msgpop_top)).post(new Runnable() { // from class: h40.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessagePopupActivity.this.m56873F4();
                    }
                });
                EditText editText = (EditText) findViewById(AbstractC6918a0.chatinput_text);
                this.f55303i0 = editText;
                editText.addTextChangedListener(new C10947a());
                this.f55303i0.setOnFocusChangeListener(this);
                ImageButton imageButton = (ImageButton) findViewById(AbstractC6918a0.chatinput_send);
                this.f55304j0 = imageButton;
                imageButton.setOnClickListener(this);
                m56895u5();
                ViewPagerFakeDragFixed viewPagerFakeDragFixed = (ViewPagerFakeDragFixed) findViewById(AbstractC6918a0.viewpager);
                this.f55308n0 = viewPagerFakeDragFixed;
                viewPagerFakeDragFixed.setDrawingCacheEnabled(true);
                this.f55308n0.setAlwaysDrawnWithCacheEnabled(true);
                this.f55308n0.setDrawingCacheQuality(ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
                int m119607o = C23212s8.m119607o(this, AbstractC16781w.AppPrimaryColor);
                this.f55316v0 = new C7063f5(this, f55297D0, this.f55306l0);
                if (this.f55308n0.getAdapter() == null) {
                    this.f55308n0.setAdapter(this.f55316v0);
                    this.f55308n0.setCurrentItem(f55297D0.size() - 1);
                } else {
                    int i11 = this.f55315u0;
                    if (i11 >= 0 && i11 < f55297D0.size()) {
                        this.f55308n0.setAdapter(this.f55316v0);
                        this.f55308n0.setCurrentItem(this.f55315u0);
                    }
                }
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) findViewById(AbstractC6918a0.sliding_tabs);
                this.f55309o0 = slidingTabLayout;
                slidingTabLayout.setViewPager(this.f55308n0);
                this.f55309o0.setSelectedIndicatorColors(m119607o);
                this.f55309o0.setEnableDivider(true);
                this.f55309o0.setDividerColors(0);
                this.f55309o0.setOnPageChangeListener(new C10948b());
                if (this.f55320z0) {
                    this.f55320z0 = false;
                    int i12 = this.f55314t0;
                    if (i12 > 0) {
                        this.f55315u0 = i12 - 1;
                    }
                } else {
                    int i13 = this.f55314t0;
                    if (i13 > 0 && !this.f55319y0) {
                        this.f55315u0 = i13 - 1;
                    }
                }
                this.f55310p0 = (FrameLayout) findViewById(AbstractC6918a0.layoutQuickStickerContainer);
                this.f55311q0 = (LinearLayout) findViewById(AbstractC6918a0.layoutQuickSticker);
                TextView textView = (TextView) findViewById(AbstractC6918a0.tvQuickStickerCover);
                this.f55312r0 = textView;
                textView.setVisibility(8);
                this.f55318x0 = new GestureDetector(this, new C10949c());
                this.f55312r0.setOnTouchListener(new View.OnTouchListener() { // from class: h40.z0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean m56874H4;
                        m56874H4 = MessagePopupActivity.this.m56874H4(view, motionEvent);
                        return m56874H4;
                    }
                });
                m56896y4();
                return;
            }
            m56894t4(false);
        } catch (Exception e11) {
            e11.printStackTrace();
            m56894t4(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onPause() {
        C10951e c10951e = this.f55307m0;
        if (c10951e != null) {
            unregisterReceiver(c10951e);
            this.f55307m0 = null;
        }
        f55299F0 = false;
        C0697c0.Companion.m1048b().m1035h("MessagePopupView");
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onResume() {
        try {
            f55298E0 = this;
            f55299F0 = true;
            ArrayList arrayList = f55297D0;
            if (arrayList != null) {
                int size = arrayList.size();
                this.f55314t0 = size;
                if (size > 0 && this.f55316v0 != null) {
                    if (!this.f55319y0) {
                        this.f55315u0 = size - 1;
                    }
                    ViewPagerFakeDragFixed viewPagerFakeDragFixed = this.f55308n0;
                    if (viewPagerFakeDragFixed != null && viewPagerFakeDragFixed.getCurrentItem() != this.f55315u0) {
                        this.f55316v0.m36067z(f55297D0);
                        this.f55316v0.mo35341m();
                        this.f55308n0.setAdapter(this.f55316v0);
                        this.f55308n0.setCurrentItem(this.f55315u0);
                    }
                }
            }
            if (this.f55307m0 == null) {
                this.f55307m0 = new C10951e(this);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        C0697c0.Companion.m1048b().m1043u("MessagePopupView");
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        f55299F0 = false;
        C0697c0.Companion.m1048b().m1035h("MessagePopupView");
    }

    @Override // com.zing.zalo.analytics.ZaloTrackingActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onTopResumedActivityChanged(boolean z11) {
        super.onTopResumedActivityChanged(z11);
        if (z11) {
            C0697c0.Companion.m1048b().m1043u("MessagePopupView");
        }
    }

    /* renamed from: t4 */
    public void m56894t4(boolean z11) {
        ArrayList arrayList = f55297D0;
        if (arrayList != null) {
            arrayList.clear();
        }
        f55299F0 = false;
        AbstractC23304d.f113350Y0 = System.currentTimeMillis();
        finish();
    }

    /* renamed from: u5 */
    void m56895u5() {
        if (this.f55303i0 != null) {
            try {
                int i11 = this.f55317w0;
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f55304j0.setImageResource(AbstractC16803z.btn_send_normal);
                    }
                } else {
                    this.f55304j0.setImageResource(AbstractC16803z.btn_send_disable);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: y4 */
    void m56896y4() {
        try {
            C28644j.m143233Y().m143300e0(new ArrayList(39), this, this);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
