package com.adtima.ads;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.adtima.AbstractC3640a;
import com.adtima.AbstractC3841c;
import com.adtima.AbstractC3874e;
import com.adtima.AbstractC3875f;
import com.adtima.Adtima;
import com.adtima.control.CircleImageView;
import java.util.ArrayList;
import java.util.Iterator;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p120e3.C18190a;
import p120e3.C18191b;
import p120e3.C18192c;
import p196h3.InterfaceC19745g;
import p227i3.C20208l;
import p227i3.C20217u;
import p227i3.C20218v;
import p313l3.AbstractC22010c;
import p313l3.AbstractC22011d;

/* loaded from: classes2.dex */
public class ZAdsScenario extends Activity implements View.OnClickListener {
    private static final String TAG = "ZAdsScenario";
    private String mAdClickToUrl;
    private String mAdScenarioUrl;
    private int mAdsTemplate;
    private CircleImageView mIvLogo = null;
    private TextView mTvUrl = null;
    private TextView mButtonEnd = null;
    private LinearLayout mAdsMessageGroup = null;
    private LinearLayout mLoadingLayout = null;
    private InterfaceC19745g mAdsLoadListener = null;
    private C18192c mScenarioEntity = null;
    private String mAdsContentId = null;
    private boolean mIsFinished = false;

    /* renamed from: com.adtima.ads.ZAdsScenario$1 */
    /* loaded from: classes2.dex */
    public class C37271 implements InterfaceC19745g {
        C37271() {
        }

        @Override // p196h3.InterfaceC19745g
        public void onAdsLoadFailed(int i11) {
            try {
                ZAdsScenario.this.redirectAfterFailedOrTimeout();
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsScenario.TAG, "onFailed", e11);
            }
        }

        @Override // p196h3.InterfaceC19745g
        public void onAdsLoadFinished(boolean z11) {
            try {
                ZAdsScenario.this.mLoadingLayout.setVisibility(8);
                ZAdsScenario.this.mScenarioEntity = C20217u.m105538N0().m105588P0();
                if (ZAdsScenario.this.mScenarioEntity != null) {
                    ZAdsScenario.this.buildMessageLayout();
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsScenario.TAG, "onLoaded", e11);
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsScenario$2 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC37282 implements View.OnClickListener {
        final /* synthetic */ C18191b val$message;

        ViewOnClickListenerC37282(C18191b c18191b) {
            r2 = c18191b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C20218v.m105636a().m105643h(r2.m96952b());
        }
    }

    /* renamed from: com.adtima.ads.ZAdsScenario$3 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC37293 implements View.OnClickListener {
        final /* synthetic */ C18191b val$message;

        ViewOnClickListenerC37293(C18191b c18191b) {
            r2 = c18191b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C20218v.m105636a().m105643h(r2.m96952b());
        }
    }

    /* renamed from: com.adtima.ads.ZAdsScenario$4 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC37304 implements View.OnClickListener {
        final /* synthetic */ C18190a val$buttonEntity;

        ViewOnClickListenerC37304(C18190a c18190a) {
            r2 = c18190a;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C20218v m105636a;
            String m96946a;
            if (r2.m96950e().equals("message")) {
                m105636a = C20218v.m105636a();
                m96946a = r2.m96947b();
            } else {
                if (!r2.m96950e().equals("link")) {
                    C20217u.m105538N0().m105584N(r2.m96949d(), ZAdsScenario.this.mAdsContentId, ZAdsScenario.this.mAdsTemplate);
                    ZAdsScenario.this.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + r2.m96946a())));
                    return;
                }
                C20217u.m105538N0().m105584N(r2.m96949d(), ZAdsScenario.this.mAdsContentId, ZAdsScenario.this.mAdsTemplate);
                m105636a = C20218v.m105636a();
                m96946a = r2.m96946a();
            }
            m105636a.m105643h(m96946a);
        }
    }

    /* renamed from: com.adtima.ads.ZAdsScenario$5 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC37315 implements View.OnClickListener {
        final /* synthetic */ C18190a val$buttonEntity;

        ViewOnClickListenerC37315(C18190a c18190a) {
            r2 = c18190a;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C20218v m105636a;
            String m96946a;
            if (r2.m96950e().equals("message")) {
                m105636a = C20218v.m105636a();
                m96946a = r2.m96947b();
            } else {
                if (!r2.m96950e().equals("link")) {
                    C20217u.m105538N0().m105584N(r2.m96949d(), ZAdsScenario.this.mAdsContentId, ZAdsScenario.this.mAdsTemplate);
                    ZAdsScenario.this.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + r2.m96946a())));
                    return;
                }
                C20217u.m105538N0().m105584N(r2.m96949d(), ZAdsScenario.this.mAdsContentId, ZAdsScenario.this.mAdsTemplate);
                m105636a = C20218v.m105636a();
                m96946a = r2.m96946a();
            }
            m105636a.m105643h(m96946a);
        }
    }

    /* renamed from: com.adtima.ads.ZAdsScenario$6 */
    /* loaded from: classes2.dex */
    public class RunnableC37326 implements Runnable {
        RunnableC37326() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ZAdsScenario.this.finish();
        }
    }

    /* renamed from: com.adtima.ads.ZAdsScenario$7 */
    /* loaded from: classes2.dex */
    public class C37337 extends AbstractRunnableC0008c {
        Bitmap thumbBitmap;
        final /* synthetic */ ImageView val$thumbnail;
        final /* synthetic */ String val$url;

        C37337(String str, ImageView imageView) {
            r2 = str;
            r3 = imageView;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Void doInBackground() {
            try {
                String str = r2;
                if (str == null || str.length() == 0) {
                    return null;
                }
                this.thumbBitmap = C20208l.m105404b().m105406a(r2);
                return null;
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsScenario.TAG, "doInBackground", e11);
                return null;
            }
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Void r42) {
            try {
                if (this.thumbBitmap != null) {
                    int dimensionPixelSize = ZAdsScenario.this.getResources().getDimensionPixelSize(AbstractC3841c.zad__iab_msg_ad_corner_radius);
                    r3.setImageBitmap(AbstractC22011d.m114903d(this.thumbBitmap, dimensionPixelSize, dimensionPixelSize, 0, 0));
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsScenario.TAG, "onPostExecute", e11);
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsScenario$8 */
    /* loaded from: classes2.dex */
    public class C37348 extends AbstractRunnableC0008c {
        Bitmap thumbBitmap;
        final /* synthetic */ CircleImageView val$thumbnail;
        final /* synthetic */ String val$url;

        C37348(String str, CircleImageView circleImageView) {
            r2 = str;
            r3 = circleImageView;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Void doInBackground() {
            try {
                String str = r2;
                if (str == null || str.length() == 0) {
                    return null;
                }
                this.thumbBitmap = C20208l.m105404b().m105406a(r2);
                return null;
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsScenario.TAG, "doInBackground", e11);
                return null;
            }
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Void r32) {
            try {
                Bitmap bitmap = this.thumbBitmap;
                if (bitmap != null) {
                    r3.setImageBitmap(bitmap);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsScenario.TAG, "onPostExecute", e11);
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsScenario$9 */
    /* loaded from: classes2.dex */
    public class RunnableC37359 implements Runnable {
        RunnableC37359() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ZAdsScenario.this.mScenarioEntity == null) {
                    ZAdsScenario.this.redirectAfterFailedOrTimeout();
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsScenario.TAG, "checkTimeoutNetwork", e11);
            }
        }
    }

    public void buildMessageLayout() {
        try {
            this.mButtonEnd.setText(this.mScenarioEntity.f92367c);
            this.mTvUrl.setText(this.mScenarioEntity.f92366b);
            doDownloadLogoTask(this.mScenarioEntity.f92365a, this.mIvLogo);
            C20217u.m105538N0().m105584N(this.mScenarioEntity.f92370f, this.mAdsContentId, this.mAdsTemplate);
            ArrayList arrayList = this.mScenarioEntity.f92371g;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C18191b c18191b = (C18191b) it.next();
                if (c18191b != null) {
                    View inflate = LayoutInflater.from(this).inflate(AbstractC3875f.zad__message_text_layout, (ViewGroup) null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
                    if (c18191b.m96954d().equals("image")) {
                        ImageView imageView = (ImageView) inflate.findViewById(AbstractC3874e.zad__message_img_iv);
                        if (c18191b.m96951a() != null) {
                            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsScenario.2
                                final /* synthetic */ C18191b val$message;

                                ViewOnClickListenerC37282(C18191b c18191b2) {
                                    r2 = c18191b2;
                                }

                                @Override // android.view.View.OnClickListener
                                public void onClick(View view) {
                                    C20218v.m105636a().m105643h(r2.m96952b());
                                }
                            });
                            imageView.setVisibility(0);
                            doDownloadImageTask(c18191b2.m96951a(), imageView);
                        }
                    }
                    TextView textView = (TextView) inflate.findViewById(AbstractC3874e.zad__message_text_tv);
                    if (c18191b2.m96953c() != null) {
                        textView.setText(c18191b2.m96953c());
                        textView.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsScenario.3
                            final /* synthetic */ C18191b val$message;

                            ViewOnClickListenerC37293(C18191b c18191b2) {
                                r2 = c18191b2;
                            }

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                C20218v.m105636a().m105643h(r2.m96952b());
                            }
                        });
                    } else {
                        textView.setVisibility(8);
                    }
                    ArrayList m96955e = c18191b2.m96955e();
                    if (m96955e.size() == 1) {
                        C18190a c18190a = (C18190a) m96955e.get(0);
                        TextView textView2 = (TextView) inflate.findViewById(AbstractC3874e.zad__message_text_btn_single);
                        textView2.setVisibility(0);
                        textView2.setText(c18190a.m96948c());
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsScenario.4
                            final /* synthetic */ C18190a val$buttonEntity;

                            ViewOnClickListenerC37304(C18190a c18190a2) {
                                r2 = c18190a2;
                            }

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                C20218v m105636a;
                                String m96946a;
                                if (r2.m96950e().equals("message")) {
                                    m105636a = C20218v.m105636a();
                                    m96946a = r2.m96947b();
                                } else {
                                    if (!r2.m96950e().equals("link")) {
                                        C20217u.m105538N0().m105584N(r2.m96949d(), ZAdsScenario.this.mAdsContentId, ZAdsScenario.this.mAdsTemplate);
                                        ZAdsScenario.this.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + r2.m96946a())));
                                        return;
                                    }
                                    C20217u.m105538N0().m105584N(r2.m96949d(), ZAdsScenario.this.mAdsContentId, ZAdsScenario.this.mAdsTemplate);
                                    m105636a = C20218v.m105636a();
                                    m96946a = r2.m96946a();
                                }
                                m105636a.m105643h(m96946a);
                            }
                        });
                    } else {
                        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(AbstractC3874e.zad__message_text_btn);
                        linearLayout.setVisibility(0);
                        for (int i11 = 0; i11 < m96955e.size(); i11++) {
                            C18190a c18190a2 = (C18190a) m96955e.get(i11);
                            if (c18190a2 != null) {
                                View inflate2 = LayoutInflater.from(this).inflate(AbstractC3875f.zad__message_button_layout, (ViewGroup) null);
                                int i12 = AbstractC22010c.f108379b;
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i12, i12);
                                ((TextView) inflate2.findViewById(AbstractC3874e.zad__message_button_text)).setText(c18190a2.m96948c());
                                inflate2.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsScenario.5
                                    final /* synthetic */ C18190a val$buttonEntity;

                                    ViewOnClickListenerC37315(C18190a c18190a22) {
                                        r2 = c18190a22;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public void onClick(View view) {
                                        C20218v m105636a;
                                        String m96946a;
                                        if (r2.m96950e().equals("message")) {
                                            m105636a = C20218v.m105636a();
                                            m96946a = r2.m96947b();
                                        } else {
                                            if (!r2.m96950e().equals("link")) {
                                                C20217u.m105538N0().m105584N(r2.m96949d(), ZAdsScenario.this.mAdsContentId, ZAdsScenario.this.mAdsTemplate);
                                                ZAdsScenario.this.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + r2.m96946a())));
                                                return;
                                            }
                                            C20217u.m105538N0().m105584N(r2.m96949d(), ZAdsScenario.this.mAdsContentId, ZAdsScenario.this.mAdsTemplate);
                                            m105636a = C20218v.m105636a();
                                            m96946a = r2.m96946a();
                                        }
                                        m105636a.m105643h(m96946a);
                                    }
                                });
                                if (i11 == 0) {
                                    inflate2.findViewById(AbstractC3874e.zad__message_button_line).setVisibility(8);
                                }
                                linearLayout.addView(inflate2, layoutParams2);
                            }
                        }
                    }
                    this.mAdsMessageGroup.addView(inflate, layoutParams);
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "buildMessageLayout", e11);
        }
    }

    private void checkTimeoutNetwork() {
        try {
            new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsScenario.9
                RunnableC37359() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ZAdsScenario.this.mScenarioEntity == null) {
                            ZAdsScenario.this.redirectAfterFailedOrTimeout();
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsScenario.TAG, "checkTimeoutNetwork", e11);
                    }
                }
            }, 2000L);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkTimeoutNetwork", e11);
        }
    }

    private void doDownloadImageTask(String str, ImageView imageView) {
        try {
            C0009d.m11g(new AbstractRunnableC0008c() { // from class: com.adtima.ads.ZAdsScenario.7
                Bitmap thumbBitmap;
                final /* synthetic */ ImageView val$thumbnail;
                final /* synthetic */ String val$url;

                C37337(String str2, ImageView imageView2) {
                    r2 = str2;
                    r3 = imageView2;
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public Void doInBackground() {
                    try {
                        String str2 = r2;
                        if (str2 == null || str2.length() == 0) {
                            return null;
                        }
                        this.thumbBitmap = C20208l.m105404b().m105406a(r2);
                        return null;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsScenario.TAG, "doInBackground", e11);
                        return null;
                    }
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public void onPostExecute(Void r42) {
                    try {
                        if (this.thumbBitmap != null) {
                            int dimensionPixelSize = ZAdsScenario.this.getResources().getDimensionPixelSize(AbstractC3841c.zad__iab_msg_ad_corner_radius);
                            r3.setImageBitmap(AbstractC22011d.m114903d(this.thumbBitmap, dimensionPixelSize, dimensionPixelSize, 0, 0));
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsScenario.TAG, "onPostExecute", e11);
                    }
                }
            });
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doDownloadImageTask", e11);
        }
    }

    private void doDownloadLogoTask(String str, CircleImageView circleImageView) {
        try {
            C0009d.m11g(new AbstractRunnableC0008c() { // from class: com.adtima.ads.ZAdsScenario.8
                Bitmap thumbBitmap;
                final /* synthetic */ CircleImageView val$thumbnail;
                final /* synthetic */ String val$url;

                C37348(String str2, CircleImageView circleImageView2) {
                    r2 = str2;
                    r3 = circleImageView2;
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public Void doInBackground() {
                    try {
                        String str2 = r2;
                        if (str2 == null || str2.length() == 0) {
                            return null;
                        }
                        this.thumbBitmap = C20208l.m105404b().m105406a(r2);
                        return null;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsScenario.TAG, "doInBackground", e11);
                        return null;
                    }
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public void onPostExecute(Void r32) {
                    try {
                        Bitmap bitmap = this.thumbBitmap;
                        if (bitmap != null) {
                            r3.setImageBitmap(bitmap);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsScenario.TAG, "onPostExecute", e11);
                    }
                }
            });
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doDownloadImageTask", e11);
        }
    }

    private void initData() {
        try {
            C20217u.m105538N0().m105581L(this.mAdScenarioUrl, this.mAdsLoadListener);
            checkTimeoutNetwork();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "initData", e11);
        }
    }

    private void initView() {
        try {
            this.mLoadingLayout = (LinearLayout) findViewById(AbstractC3874e.zad__sce_loading);
            findViewById(AbstractC3874e.zad__sce_close).setOnClickListener(this);
            this.mAdsMessageGroup = (LinearLayout) findViewById(AbstractC3874e.zad__landing_scenario_layout);
            TextView textView = (TextView) findViewById(AbstractC3874e.zad__scr_url);
            this.mTvUrl = textView;
            textView.setOnClickListener(this);
            CircleImageView circleImageView = (CircleImageView) findViewById(AbstractC3874e.zad__scr_circle_logo);
            this.mIvLogo = circleImageView;
            circleImageView.setOnClickListener(this);
            TextView textView2 = (TextView) findViewById(AbstractC3874e.zad__iab_msg_ad_btn_end);
            this.mButtonEnd = textView2;
            textView2.setOnClickListener(this);
            this.mAdsLoadListener = new InterfaceC19745g() { // from class: com.adtima.ads.ZAdsScenario.1
                C37271() {
                }

                @Override // p196h3.InterfaceC19745g
                public void onAdsLoadFailed(int i11) {
                    try {
                        ZAdsScenario.this.redirectAfterFailedOrTimeout();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsScenario.TAG, "onFailed", e11);
                    }
                }

                @Override // p196h3.InterfaceC19745g
                public void onAdsLoadFinished(boolean z11) {
                    try {
                        ZAdsScenario.this.mLoadingLayout.setVisibility(8);
                        ZAdsScenario.this.mScenarioEntity = C20217u.m105538N0().m105588P0();
                        if (ZAdsScenario.this.mScenarioEntity != null) {
                            ZAdsScenario.this.buildMessageLayout();
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsScenario.TAG, "onLoaded", e11);
                    }
                }
            };
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "initView", e11);
        }
    }

    public void redirectAfterFailedOrTimeout() {
        try {
            if (this.mIsFinished) {
                return;
            }
            this.mIsFinished = true;
            C20218v.m105636a().m105643h(this.mAdClickToUrl);
            new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsScenario.6
                RunnableC37326() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    ZAdsScenario.this.finish();
                }
            }, 1000L);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "redirectAfterFailedOrTimeout", e11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C20218v m105636a;
        String str;
        try {
            int id2 = view.getId();
            if (id2 != AbstractC3874e.zad__scr_circle_logo && id2 != AbstractC3874e.zad__scr_url) {
                if (id2 != AbstractC3874e.zad__iab_msg_ad_btn_end) {
                    if (id2 == AbstractC3874e.zad__sce_close) {
                        finish();
                        return;
                    }
                    return;
                } else {
                    if (this.mScenarioEntity.f92368d != null) {
                        m105636a = C20218v.m105636a();
                        str = this.mScenarioEntity.f92368d;
                        m105636a.m105643h(str);
                    }
                    return;
                }
            }
            if (this.mScenarioEntity.f92369e != null) {
                m105636a = C20218v.m105636a();
                str = this.mScenarioEntity.f92369e;
                m105636a.m105643h(str);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onClick", e11);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.mAdScenarioUrl = extras.getString("adsScenario");
                this.mAdClickToUrl = extras.getString("adsClickTo");
                this.mAdsTemplate = extras.getInt("adsTemplate");
                this.mAdsContentId = extras.getString("adsContentId");
            } else {
                finish();
            }
            requestWindowFeature(1);
            overridePendingTransition(AbstractC3640a.zad__slide_in_left, AbstractC3640a.zad__slide_out_left);
            setContentView(AbstractC3875f.zad__activity_scenario);
            initView();
            initData();
        } catch (Exception e11) {
            Toast.makeText(this, "Có lỗi xảy ra, vui lòng thử lại!", 0).show();
            finish();
            Adtima.m18329e(TAG, "onCreate", e11);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }
}
