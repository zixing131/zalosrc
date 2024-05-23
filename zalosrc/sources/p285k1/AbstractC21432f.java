package p285k1;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.util.AbstractC1482d;
import androidx.core.util.AbstractC1487i;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1538d;

/* renamed from: k1.f */
/* loaded from: classes2.dex */
public abstract class AbstractC21432f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.f$a */
    /* loaded from: classes2.dex */
    public class a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ c f104420a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z11, c cVar) {
            super(inputConnection, z11);
            this.f104420a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
            if (this.f104420a.mo110938a(C21433g.m110945f(inputContentInfo), i11, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i11, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.f$b */
    /* loaded from: classes2.dex */
    public class b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ c f104421a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z11, c cVar) {
            super(inputConnection, z11);
            this.f104421a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (AbstractC21432f.m110943e(str, bundle, this.f104421a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: k1.f$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        boolean mo110938a(C21433g c21433g, int i11, Bundle bundle);
    }

    /* renamed from: b */
    private static c m110940b(final View view) {
        AbstractC1487i.m7492g(view);
        return new c() { // from class: k1.e
            @Override // p285k1.AbstractC21432f.c
            /* renamed from: a */
            public final boolean mo110938a(C21433g c21433g, int i11, Bundle bundle) {
                boolean m110944f;
                m110944f = AbstractC21432f.m110944f(view, c21433g, i11, bundle);
                return m110944f;
            }
        };
    }

    /* renamed from: c */
    public static InputConnection m110941c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m110942d(inputConnection, editorInfo, m110940b(view));
    }

    /* renamed from: d */
    public static InputConnection m110942d(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        AbstractC1482d.m7478d(inputConnection, "inputConnection must be non-null");
        AbstractC1482d.m7478d(editorInfo, "editorInfo must be non-null");
        AbstractC1482d.m7478d(cVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new a(inputConnection, false, cVar);
        }
        if (AbstractC21429c.m110935a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new b(inputConnection, false, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: e */
    static boolean m110943e(String str, Bundle bundle, c cVar) {
        boolean z11;
        String str2;
        ResultReceiver resultReceiver;
        ResultReceiver resultReceiver2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ?? r02 = 0;
        r02 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z11 = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z11 = true;
        }
        if (z11) {
            str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        } else {
            str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        }
        try {
            resultReceiver2 = (ResultReceiver) bundle.getParcelable(str2);
            if (z11) {
                str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            } else {
                str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = null;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(str3);
            if (z11) {
                str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
            } else {
                str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
            }
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
            if (z11) {
                str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
            } else {
                str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
            }
            Uri uri2 = (Uri) bundle.getParcelable(str5);
            if (z11) {
                str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
            } else {
                str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
            }
            int i11 = bundle.getInt(str6);
            if (z11) {
                str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
            } else {
                str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
            }
            Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
            if (uri != null && clipDescription != null) {
                r02 = cVar.mo110938a(new C21433g(uri, clipDescription, uri2), i11, bundle2);
            }
            if (resultReceiver2 != 0) {
                resultReceiver2.send(r02, null);
            }
            return r02;
        } catch (Throwable th3) {
            th = th3;
            resultReceiver = resultReceiver2;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ boolean m110944f(View view, C21433g c21433g, int i11, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i11 & 1) != 0) {
            try {
                c21433g.m110949d();
                InputContentInfo m110937a = AbstractC21430d.m110937a(c21433g.m110950e());
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", m110937a);
            } catch (Exception unused) {
                return false;
            }
        }
        if (AbstractC1579n0.m7896q0(view, new C1538d.a(new ClipData(c21433g.m110947b(), new ClipData.Item(c21433g.m110946a())), 2).m7746d(c21433g.m110948c()).m7745c(bundle).m7743a()) != null) {
            return false;
        }
        return true;
    }
}
