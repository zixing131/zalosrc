package lv;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import en0.InterfaceC18509p;

/* renamed from: lv.a */
/* loaded from: classes4.dex */
public interface InterfaceC22653a {
    /* renamed from: Fs */
    View mo86725Fs();

    /* renamed from: Ow */
    boolean mo86736Ow(String str);

    /* renamed from: Sc */
    void mo81379Sc(String str, String str2);

    /* renamed from: W7 */
    Context mo86746W7();

    /* renamed from: X7 */
    boolean mo86749X7(String[] strArr);

    /* renamed from: g8 */
    Bitmap mo86771g8();

    int getRequestedOrientation();

    Window getWindow();

    /* renamed from: oI */
    void mo86784oI(WebView webView, ValueCallback valueCallback, int i11);

    /* renamed from: ow */
    void mo81391ow(String str, InterfaceC18509p interfaceC18509p);

    void setRequestedOrientation(int i11);

    void startActivityForResult(Intent intent, int i11);
}
