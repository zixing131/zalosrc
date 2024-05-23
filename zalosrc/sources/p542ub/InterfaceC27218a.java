package p542ub;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.animation.AnimationTarget;
import xl0.InterfaceC30162c;

/* renamed from: ub.a */
/* loaded from: classes.dex */
public interface InterfaceC27218a extends InterfaceC27219b {
    /* renamed from: H2 */
    void mo35551H2(AnimationTarget animationTarget, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11);

    /* renamed from: K0 */
    int mo35552K0();

    /* renamed from: O */
    void mo35554O(int i11);

    /* renamed from: V */
    void mo35556V(ImageView imageView, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11);

    /* renamed from: a */
    boolean mo35559a();

    /* renamed from: d1 */
    boolean mo35567d1();

    View findViewById(int i11);

    void finish();

    /* renamed from: g0 */
    View mo35570g0();

    AssetManager getAssets();

    Context getContext();

    View getCurrentFocus();

    Intent getIntent();

    LayoutInflater getLayoutInflater();

    int getRequestedOrientation();

    Resources getResources();

    String getString(int i11);

    Window getWindow();

    /* renamed from: i0 */
    boolean mo35572i0();

    boolean isDestroyed();

    boolean isFinishing();

    /* renamed from: l4 */
    void mo35573l4(Class cls, Bundle bundle, int i11, boolean z11);

    /* renamed from: n3 */
    boolean mo35576n3();

    /* renamed from: o */
    boolean mo35577o();

    void onActivityResult(int i11, int i12, Intent intent);

    /* renamed from: p */
    C17487o0 mo35579p();

    /* renamed from: q */
    void mo35581q(Class cls, Bundle bundle, int i11, int i12, boolean z11);

    void runOnUiThread(Runnable runnable);

    void setRequestedOrientation(int i11);

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i11);

    /* renamed from: v */
    View mo35585v();

    /* renamed from: v2 */
    boolean mo35586v2();
}
