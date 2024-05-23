package com.zing.zalo.p077ui.picker;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.common.customviews.CameraLivePickerView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.camera.common.models.inputparams.SendInputParams;
import com.zing.zalo.p077ui.picker.QuickPickerView;
import java.util.ArrayList;
import m90.EnumC22962a;
import m90.EnumC22963b;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import p266jg.C21243a;
import p322lf.AbstractC22470k;
import th.AbstractC26689j;
import wh0.C29046a;

/* renamed from: com.zing.zalo.ui.picker.b */
/* loaded from: classes6.dex */
public class C12667b {

    /* renamed from: a */
    private final QuickPickerView f66001a;

    /* renamed from: b */
    private final QuickPickerView.InterfaceC12657s f66002b;

    /* renamed from: c */
    private final QuickPickerView.InterfaceC12656r f66003c;

    /* renamed from: d */
    private CameraLivePickerView f66004d;

    /* renamed from: f */
    private final int f66006f;

    /* renamed from: g */
    private final FrameLayout f66007g;

    /* renamed from: e */
    private int[] f66005e = {0, 0};

    /* renamed from: h */
    boolean f66008h = false;

    /* renamed from: com.zing.zalo.ui.picker.b$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f66009a;

        static {
            int[] iArr = new int[EnumC22962a.values().length];
            f66009a = iArr;
            try {
                iArr[EnumC22962a.f111694r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66009a[EnumC22962a.f111693q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66009a[EnumC22962a.f111695s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66009a[EnumC22962a.f111696t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C12667b(QuickPickerView quickPickerView, QuickPickerView.InterfaceC12657s interfaceC12657s, QuickPickerView.InterfaceC12656r interfaceC12656r) {
        this.f66001a = quickPickerView;
        this.f66002b = interfaceC12657s;
        this.f66003c = interfaceC12656r;
        FrameLayout frameLayout = new FrameLayout(quickPickerView.m92648SI());
        this.f66007g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        View frameLayout2 = new FrameLayout(quickPickerView.m92648SI());
        frameLayout2.setId(AbstractC6918a0.camera_picker_container);
        ImageView imageView = new ImageView(quickPickerView.m92648SI());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 83);
        int i11 = AbstractC23222t7.f112562h;
        layoutParams.leftMargin = i11;
        layoutParams.bottomMargin = i11;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(AbstractC16803z.icn_gallery_camera_mini);
        frameLayout.addView(frameLayout2);
        frameLayout.addView(imageView);
        this.f66006f = AbstractC23136l9.m118659K(AbstractC16802y.multi_picker_spacing);
    }

    /* renamed from: c */
    private boolean m71347c(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (AbstractC23034c6.m118165m(this.f66001a.m92648SI(), str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractC23034c6.m118184v0(this.f66001a, (String[]) arrayList.toArray(new String[0]), 114);
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private int m71348d() {
        QuickPickerView quickPickerView = this.f66001a;
        if (quickPickerView != null && quickPickerView.f65928Q0 == EnumC22963b.f111701q) {
            return 2;
        }
        return 0;
    }

    /* renamed from: g */
    public /* synthetic */ void m71349g() {
        m71351e().setTranslationX(this.f66005e[0]);
        m71351e().setTranslationY(this.f66005e[1]);
    }

    /* renamed from: b */
    public void m71350b() {
        this.f66004d = null;
    }

    /* renamed from: e */
    public View m71351e() {
        return this.f66007g;
    }

    /* renamed from: f */
    public void m71352f() {
        try {
            if (this.f66004d == null) {
                this.f66001a.m92646QI().bringToFront();
                this.f66004d = new CameraLivePickerView();
                this.f66001a.m92662fJ().m93060e2(AbstractC6918a0.camera_picker_container, this.f66004d, "CameraPicker", 1, true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: h */
    public void m71353h() {
        boolean z11;
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.CAMERA");
            QuickPickerView quickPickerView = this.f66001a;
            if (quickPickerView.f65942X0 == 100) {
                if (quickPickerView.f65926P0 == EnumC22962a.f111694r) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                }
            } else {
                arrayList.add("android.permission.RECORD_AUDIO");
            }
            if (m71347c((String[]) arrayList.toArray(new String[arrayList.size()]))) {
                CameraInputParams cameraInputParams = new CameraInputParams();
                Bundle bundle = new Bundle();
                int i11 = a.f66009a[this.f66001a.f65926P0.ordinal()];
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        str = "7";
                    } else {
                        cameraInputParams.f41133u = 2;
                        cameraInputParams.f41138w0 = new SensitiveData("timeline_post_feed", "social_timeline");
                        str = "6";
                        cameraInputParams.f41135v = m71348d();
                    }
                } else {
                    cameraInputParams.f41133u = AbstractC26689j.m137086M() ? 1 : 0;
                    bundle.putParcelable("extra_input_contact_profile", this.f66001a.m71278oM());
                    cameraInputParams.f41107Z = 2;
                    if (this.f66001a.m92676n2() != null && this.f66001a.m92676n2().mo35586v2()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraInputParams.f41121n0 = z11;
                    cameraInputParams.f41138w0 = new SensitiveData("csc_input_gallery_camera", "comm_csc");
                    str = "1";
                }
                cameraInputParams.f41105X = str;
                QuickPickerView quickPickerView2 = this.f66001a;
                if (quickPickerView2.f65942X0 == 100) {
                    if (quickPickerView2.f65926P0 != EnumC22962a.f111694r) {
                        cameraInputParams.f41129s = 3;
                        cameraInputParams.f41090I = true;
                        cameraInputParams.f41119l0 = new SendInputParams(2);
                        C29046a.f134547b = "QuickPickerView_FEED_MODE_LIVE_PREVIEW_PHOTO";
                        i12 = 11111;
                    } else {
                        cameraInputParams.f41129s = 3;
                        C29046a.f134547b = "QuickPickerView_CHAT_MODE_LIVE_PREVIEW_PHOTO";
                    }
                } else if (quickPickerView2.f65926P0 != EnumC22962a.f111694r) {
                    cameraInputParams.f41129s = 2;
                    cameraInputParams.f41091J = true;
                    cameraInputParams.f41108a0 = false;
                    cameraInputParams.f41093L = true;
                    cameraInputParams.f41119l0 = new SendInputParams(2);
                    if (this.f66001a.f65926P0 == EnumC22962a.f111693q) {
                        cameraInputParams.f41109b0 = AbstractC26689j.m137074A(2) * 1000;
                    }
                    C29046a.f134547b = "QuickPickerView_FEED_MODE_LIVE_PREVIEW_VIDEO";
                    i12 = 11113;
                } else if (quickPickerView2.f65951c1.m72184HN()) {
                    cameraInputParams.f41129s = 1;
                    cameraInputParams.f41093L = true;
                    C29046a.f134547b = "QuickPickerView_MODE_MINI";
                    i12 = 11115;
                } else {
                    cameraInputParams.f41129s = 2;
                    C29046a.f134547b = "QuickPickerView_CHAT_MODE_LIVE_PREVIEW_VIDEO";
                }
                ZaloCameraView m116168t = AbstractC22470k.m116168t(this.f66001a.m92676n2(), i12, 1, cameraInputParams, bundle);
                if (m116168t != null) {
                    m116168t.f40833A1 = true;
                    QuickPickerView quickPickerView3 = this.f66001a;
                    if (quickPickerView3.f65909G1 != null) {
                        quickPickerView3.f65909G1 = null;
                    } else {
                        m116168t.m39088zT(quickPickerView3.f65977z0.getHeight());
                        m116168t.m39049gT(true);
                    }
                    this.f66001a.m92646QI().bringToFront();
                    this.f66001a.m71287vM();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: i */
    public void m71354i(int[] iArr) {
        if (!this.f66001a.m71237TM() || iArr == null || !this.f66001a.m71240UM()) {
            return;
        }
        this.f66008h = false;
        this.f66005e = iArr;
        if (this.f66001a.m92676n2().mo35576n3()) {
            int[] iArr2 = this.f66005e;
            iArr2[1] = iArr2[1] - ((C21243a.f103539n + AbstractC23136l9.m118737p0()) + this.f66006f);
        }
        if (this.f66001a.m92648SI() != null) {
            this.f66001a.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.picker.a
                public /* synthetic */ RunnableC12665a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C12667b.this.m71349g();
                }
            });
        }
    }

    /* renamed from: j */
    public void m71355j() {
        try {
            QuickPickerView quickPickerView = this.f66001a;
            if (quickPickerView.f65951c1 != null && quickPickerView.m71237TM() && this.f66001a.m71240UM() && !this.f66008h) {
                if (m71351e().getVisibility() != 0) {
                    m71351e().setVisibility(0);
                }
                this.f66001a.f65951c1.m72228fN(this.f66005e);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
