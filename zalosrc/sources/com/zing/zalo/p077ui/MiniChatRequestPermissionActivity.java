package com.zing.zalo.p077ui;

import android.os.Bundle;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.MiniChatRequestPermissionActivity;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.widget.InsetsLayout;
import d60.C17799h;
import me0.AbstractC23034c6;
import me0.C23212s8;
import p161fg.C18922m;
import p363nh.C23744a;

/* loaded from: classes5.dex */
public class MiniChatRequestPermissionActivity extends ZaloActivity {
    /* renamed from: Q2 */
    private void m56928Q2(final int i11) {
        if (i11 != 113) {
            if (i11 != 117) {
                if (i11 != 133) {
                    if (i11 != 125 && i11 != 126 && i11 != 135) {
                        if (i11 != 136) {
                            if (i11 != 148) {
                                if (i11 != 149) {
                                    finish();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            AbstractC23034c6.m118164l0(this, new InterfaceC17463d.d() { // from class: h40.i1
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    MiniChatRequestPermissionActivity.this.m56929T2(interfaceC17463d, i12);
                }
            }, new InterfaceC17463d.d() { // from class: h40.j1
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    MiniChatRequestPermissionActivity.this.m56930V2(i11, interfaceC17463d, i12);
                }
            }, new InterfaceC17463d.c() { // from class: h40.k1
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    MiniChatRequestPermissionActivity.this.m56931W2(interfaceC17463d);
                }
            });
            return;
        }
        AbstractC23034c6.m118170o0(this, new InterfaceC17463d.d() { // from class: h40.l1
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                MiniChatRequestPermissionActivity.this.m56932X2(interfaceC17463d, i12);
            }
        }, new InterfaceC17463d.d() { // from class: h40.m1
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                MiniChatRequestPermissionActivity.this.m56933Y2(i11, interfaceC17463d, i12);
            }
        }, new InterfaceC17463d.c() { // from class: h40.n1
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                MiniChatRequestPermissionActivity.this.m56934b3(interfaceC17463d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void m56929T2(InterfaceC17463d interfaceC17463d, int i11) {
        C18922m.m99141t().m99147Q(true);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void m56930V2(int i11, InterfaceC17463d interfaceC17463d, int i12) {
        requestPermissions(AbstractC23034c6.f112030g, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W2 */
    public /* synthetic */ void m56931W2(InterfaceC17463d interfaceC17463d) {
        C18922m.m99141t().m99147Q(true);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void m56932X2(InterfaceC17463d interfaceC17463d, int i11) {
        C18922m.m99141t().m99147Q(true);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y2 */
    public /* synthetic */ void m56933Y2(int i11, InterfaceC17463d interfaceC17463d, int i12) {
        requestPermissions(AbstractC23034c6.f112033j, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b3 */
    public /* synthetic */ void m56934b3(InterfaceC17463d interfaceC17463d) {
        C18922m.m99141t().m99147Q(true);
        finish();
    }

    @Override // com.zing.zalo.activity.ZaloActivity, p542ub.InterfaceC27218a
    /* renamed from: K0 */
    public int mo35552K0() {
        return C23212s8.m119601h();
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C23212s8.m119599f(this, true, AbstractC8915g0.ThemeDefault_TranslucentDark, AbstractC8915g0.ThemeDefault_TranslucentLight);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("EXTRA_BUNDLE");
        if (bundleExtra != null && bundleExtra.containsKey("EXTRA_PERMISSION") && bundleExtra.containsKey("EXTRA_REQUEST_CODE")) {
            String[] stringArray = bundleExtra.getStringArray("EXTRA_PERMISSION");
            int i11 = bundleExtra.getInt("EXTRA_REQUEST_CODE", 0);
            if (stringArray != null && stringArray.length != 0) {
                if (AbstractC23034c6.m118167n(this, stringArray) != 0) {
                    InsetsLayout insetsLayout = new InsetsLayout(this);
                    insetsLayout.setApplyWindowInsetsListener(this);
                    insetsLayout.setId(AbstractC6918a0.zalo_view_container);
                    setContentView(insetsLayout, new ViewGroup.LayoutParams(-1, -1));
                    AbstractC23034c6.m118186w0(this, stringArray, i11);
                    return;
                }
                finish();
                return;
            }
            finish();
            return;
        }
        finish();
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        boolean z11;
        super.onRequestPermissionsResult(i11, strArr, iArr);
        boolean m118160j0 = AbstractC23034c6.m118160j0(this, i11, strArr, iArr);
        if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(this, strArr) == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AbstractC23034c6.m118122H(i11) && !z11) {
            m56928Q2(i11);
        } else if (!m118160j0) {
            C23744a.m124114c().m124116d(91, Integer.valueOf(i11), strArr, iArr);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        C17799h.m94029a().f90038m = 2;
        C18922m.m99141t().m99147Q(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        C17799h.m94029a().f90038m = 3;
        C18922m.m99141t().m99147Q(true);
        finish();
    }
}
