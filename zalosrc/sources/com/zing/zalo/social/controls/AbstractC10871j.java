package com.zing.zalo.social.controls;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import bp0.AbstractC3102n;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.LikesDialogView;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import com.zing.zalo.p077ui.zviews.FeedCallbackZaloView;
import com.zing.zalo.p077ui.zviews.FeedDetailsView;
import com.zing.zalo.p077ui.zviews.ImageCommentView;
import com.zing.zalo.p077ui.zviews.MyInfoView;
import com.zing.zalo.p077ui.zviews.TagsListView;
import com.zing.zalo.p077ui.zviews.TimelineView;
import com.zing.zalo.p077ui.zviews.UserDetailsView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import p172fy.C19171b;
import p207he.C20011e;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p716zh.C31987k4;
import p716zh.C32002l4;
import tn.C26767v;

/* renamed from: com.zing.zalo.social.controls.j */
/* loaded from: classes5.dex */
public abstract class AbstractC10871j {

    /* renamed from: a */
    private static KeyEventCallbackC17462c f54867a;

    /* renamed from: b */
    private static final ArrayList f54868b = new ArrayList();

    /* renamed from: d */
    public static synchronized void m56415d() {
        synchronized (AbstractC10871j.class) {
            try {
                Iterator it = f54868b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    if (weakReference != null && weakReference.get() != null) {
                        KeyEventCallbackC17462c keyEventCallbackC17462c = (KeyEventCallbackC17462c) weakReference.get();
                        if (keyEventCallbackC17462c.m92868m()) {
                            keyEventCallbackC17462c.dismiss();
                        }
                    }
                }
                f54867a = null;
                f54868b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0409 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:4:0x0004, B:6:0x0011, B:8:0x0019, B:10:0x0020, B:13:0x0063, B:15:0x006c, B:17:0x0070, B:23:0x007a, B:26:0x0085, B:28:0x0091, B:30:0x009b, B:31:0x00d9, B:33:0x0105, B:36:0x010c, B:37:0x00bf, B:38:0x0121, B:41:0x012d, B:42:0x0144, B:44:0x014a, B:45:0x0165, B:47:0x016c, B:49:0x0181, B:50:0x018a, B:51:0x018d, B:53:0x0195, B:56:0x01ab, B:58:0x01bb, B:59:0x01c3, B:62:0x01cd, B:64:0x01d3, B:65:0x01e5, B:66:0x0213, B:67:0x0240, B:69:0x0248, B:71:0x0252, B:72:0x0258, B:74:0x025f, B:76:0x026e, B:77:0x0295, B:78:0x0288, B:79:0x02eb, B:81:0x02f3, B:83:0x0302, B:84:0x0329, B:85:0x031c, B:86:0x037f, B:89:0x0389, B:91:0x039f, B:93:0x03a3, B:94:0x03ba, B:96:0x03be, B:97:0x03d5, B:99:0x03d9, B:100:0x03f0, B:102:0x03f4, B:103:0x0463, B:105:0x046b, B:107:0x046f, B:108:0x0409, B:110:0x0411, B:111:0x043b, B:114:0x0444, B:116:0x044c, B:117:0x002c, B:119:0x003a, B:121:0x0042, B:122:0x004d, B:127:0x0474, B:129:0x047a), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:4:0x0004, B:6:0x0011, B:8:0x0019, B:10:0x0020, B:13:0x0063, B:15:0x006c, B:17:0x0070, B:23:0x007a, B:26:0x0085, B:28:0x0091, B:30:0x009b, B:31:0x00d9, B:33:0x0105, B:36:0x010c, B:37:0x00bf, B:38:0x0121, B:41:0x012d, B:42:0x0144, B:44:0x014a, B:45:0x0165, B:47:0x016c, B:49:0x0181, B:50:0x018a, B:51:0x018d, B:53:0x0195, B:56:0x01ab, B:58:0x01bb, B:59:0x01c3, B:62:0x01cd, B:64:0x01d3, B:65:0x01e5, B:66:0x0213, B:67:0x0240, B:69:0x0248, B:71:0x0252, B:72:0x0258, B:74:0x025f, B:76:0x026e, B:77:0x0295, B:78:0x0288, B:79:0x02eb, B:81:0x02f3, B:83:0x0302, B:84:0x0329, B:85:0x031c, B:86:0x037f, B:89:0x0389, B:91:0x039f, B:93:0x03a3, B:94:0x03ba, B:96:0x03be, B:97:0x03d5, B:99:0x03d9, B:100:0x03f0, B:102:0x03f4, B:103:0x0463, B:105:0x046b, B:107:0x046f, B:108:0x0409, B:110:0x0411, B:111:0x043b, B:114:0x0444, B:116:0x044c, B:117:0x002c, B:119:0x003a, B:121:0x0042, B:122:0x004d, B:127:0x0474, B:129:0x047a), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d A[Catch: Exception -> 0x0029, TRY_ENTER, TryCatch #0 {Exception -> 0x0029, blocks: (B:4:0x0004, B:6:0x0011, B:8:0x0019, B:10:0x0020, B:13:0x0063, B:15:0x006c, B:17:0x0070, B:23:0x007a, B:26:0x0085, B:28:0x0091, B:30:0x009b, B:31:0x00d9, B:33:0x0105, B:36:0x010c, B:37:0x00bf, B:38:0x0121, B:41:0x012d, B:42:0x0144, B:44:0x014a, B:45:0x0165, B:47:0x016c, B:49:0x0181, B:50:0x018a, B:51:0x018d, B:53:0x0195, B:56:0x01ab, B:58:0x01bb, B:59:0x01c3, B:62:0x01cd, B:64:0x01d3, B:65:0x01e5, B:66:0x0213, B:67:0x0240, B:69:0x0248, B:71:0x0252, B:72:0x0258, B:74:0x025f, B:76:0x026e, B:77:0x0295, B:78:0x0288, B:79:0x02eb, B:81:0x02f3, B:83:0x0302, B:84:0x0329, B:85:0x031c, B:86:0x037f, B:89:0x0389, B:91:0x039f, B:93:0x03a3, B:94:0x03ba, B:96:0x03be, B:97:0x03d5, B:99:0x03d9, B:100:0x03f0, B:102:0x03f4, B:103:0x0463, B:105:0x046b, B:107:0x046f, B:108:0x0409, B:110:0x0411, B:111:0x043b, B:114:0x0444, B:116:0x044c, B:117:0x002c, B:119:0x003a, B:121:0x0042, B:122:0x004d, B:127:0x0474, B:129:0x047a), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014a A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:4:0x0004, B:6:0x0011, B:8:0x0019, B:10:0x0020, B:13:0x0063, B:15:0x006c, B:17:0x0070, B:23:0x007a, B:26:0x0085, B:28:0x0091, B:30:0x009b, B:31:0x00d9, B:33:0x0105, B:36:0x010c, B:37:0x00bf, B:38:0x0121, B:41:0x012d, B:42:0x0144, B:44:0x014a, B:45:0x0165, B:47:0x016c, B:49:0x0181, B:50:0x018a, B:51:0x018d, B:53:0x0195, B:56:0x01ab, B:58:0x01bb, B:59:0x01c3, B:62:0x01cd, B:64:0x01d3, B:65:0x01e5, B:66:0x0213, B:67:0x0240, B:69:0x0248, B:71:0x0252, B:72:0x0258, B:74:0x025f, B:76:0x026e, B:77:0x0295, B:78:0x0288, B:79:0x02eb, B:81:0x02f3, B:83:0x0302, B:84:0x0329, B:85:0x031c, B:86:0x037f, B:89:0x0389, B:91:0x039f, B:93:0x03a3, B:94:0x03ba, B:96:0x03be, B:97:0x03d5, B:99:0x03d9, B:100:0x03f0, B:102:0x03f4, B:103:0x0463, B:105:0x046b, B:107:0x046f, B:108:0x0409, B:110:0x0411, B:111:0x043b, B:114:0x0444, B:116:0x044c, B:117:0x002c, B:119:0x003a, B:121:0x0042, B:122:0x004d, B:127:0x0474, B:129:0x047a), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016c A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:4:0x0004, B:6:0x0011, B:8:0x0019, B:10:0x0020, B:13:0x0063, B:15:0x006c, B:17:0x0070, B:23:0x007a, B:26:0x0085, B:28:0x0091, B:30:0x009b, B:31:0x00d9, B:33:0x0105, B:36:0x010c, B:37:0x00bf, B:38:0x0121, B:41:0x012d, B:42:0x0144, B:44:0x014a, B:45:0x0165, B:47:0x016c, B:49:0x0181, B:50:0x018a, B:51:0x018d, B:53:0x0195, B:56:0x01ab, B:58:0x01bb, B:59:0x01c3, B:62:0x01cd, B:64:0x01d3, B:65:0x01e5, B:66:0x0213, B:67:0x0240, B:69:0x0248, B:71:0x0252, B:72:0x0258, B:74:0x025f, B:76:0x026e, B:77:0x0295, B:78:0x0288, B:79:0x02eb, B:81:0x02f3, B:83:0x0302, B:84:0x0329, B:85:0x031c, B:86:0x037f, B:89:0x0389, B:91:0x039f, B:93:0x03a3, B:94:0x03ba, B:96:0x03be, B:97:0x03d5, B:99:0x03d9, B:100:0x03f0, B:102:0x03f4, B:103:0x0463, B:105:0x046b, B:107:0x046f, B:108:0x0409, B:110:0x0411, B:111:0x043b, B:114:0x0444, B:116:0x044c, B:117:0x002c, B:119:0x003a, B:121:0x0042, B:122:0x004d, B:127:0x0474, B:129:0x047a), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:4:0x0004, B:6:0x0011, B:8:0x0019, B:10:0x0020, B:13:0x0063, B:15:0x006c, B:17:0x0070, B:23:0x007a, B:26:0x0085, B:28:0x0091, B:30:0x009b, B:31:0x00d9, B:33:0x0105, B:36:0x010c, B:37:0x00bf, B:38:0x0121, B:41:0x012d, B:42:0x0144, B:44:0x014a, B:45:0x0165, B:47:0x016c, B:49:0x0181, B:50:0x018a, B:51:0x018d, B:53:0x0195, B:56:0x01ab, B:58:0x01bb, B:59:0x01c3, B:62:0x01cd, B:64:0x01d3, B:65:0x01e5, B:66:0x0213, B:67:0x0240, B:69:0x0248, B:71:0x0252, B:72:0x0258, B:74:0x025f, B:76:0x026e, B:77:0x0295, B:78:0x0288, B:79:0x02eb, B:81:0x02f3, B:83:0x0302, B:84:0x0329, B:85:0x031c, B:86:0x037f, B:89:0x0389, B:91:0x039f, B:93:0x03a3, B:94:0x03ba, B:96:0x03be, B:97:0x03d5, B:99:0x03d9, B:100:0x03f0, B:102:0x03f4, B:103:0x0463, B:105:0x046b, B:107:0x046f, B:108:0x0409, B:110:0x0411, B:111:0x043b, B:114:0x0444, B:116:0x044c, B:117:0x002c, B:119:0x003a, B:121:0x0042, B:122:0x004d, B:127:0x0474, B:129:0x047a), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0248 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:4:0x0004, B:6:0x0011, B:8:0x0019, B:10:0x0020, B:13:0x0063, B:15:0x006c, B:17:0x0070, B:23:0x007a, B:26:0x0085, B:28:0x0091, B:30:0x009b, B:31:0x00d9, B:33:0x0105, B:36:0x010c, B:37:0x00bf, B:38:0x0121, B:41:0x012d, B:42:0x0144, B:44:0x014a, B:45:0x0165, B:47:0x016c, B:49:0x0181, B:50:0x018a, B:51:0x018d, B:53:0x0195, B:56:0x01ab, B:58:0x01bb, B:59:0x01c3, B:62:0x01cd, B:64:0x01d3, B:65:0x01e5, B:66:0x0213, B:67:0x0240, B:69:0x0248, B:71:0x0252, B:72:0x0258, B:74:0x025f, B:76:0x026e, B:77:0x0295, B:78:0x0288, B:79:0x02eb, B:81:0x02f3, B:83:0x0302, B:84:0x0329, B:85:0x031c, B:86:0x037f, B:89:0x0389, B:91:0x039f, B:93:0x03a3, B:94:0x03ba, B:96:0x03be, B:97:0x03d5, B:99:0x03d9, B:100:0x03f0, B:102:0x03f4, B:103:0x0463, B:105:0x046b, B:107:0x046f, B:108:0x0409, B:110:0x0411, B:111:0x043b, B:114:0x0444, B:116:0x044c, B:117:0x002c, B:119:0x003a, B:121:0x0042, B:122:0x004d, B:127:0x0474, B:129:0x047a), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025f A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:4:0x0004, B:6:0x0011, B:8:0x0019, B:10:0x0020, B:13:0x0063, B:15:0x006c, B:17:0x0070, B:23:0x007a, B:26:0x0085, B:28:0x0091, B:30:0x009b, B:31:0x00d9, B:33:0x0105, B:36:0x010c, B:37:0x00bf, B:38:0x0121, B:41:0x012d, B:42:0x0144, B:44:0x014a, B:45:0x0165, B:47:0x016c, B:49:0x0181, B:50:0x018a, B:51:0x018d, B:53:0x0195, B:56:0x01ab, B:58:0x01bb, B:59:0x01c3, B:62:0x01cd, B:64:0x01d3, B:65:0x01e5, B:66:0x0213, B:67:0x0240, B:69:0x0248, B:71:0x0252, B:72:0x0258, B:74:0x025f, B:76:0x026e, B:77:0x0295, B:78:0x0288, B:79:0x02eb, B:81:0x02f3, B:83:0x0302, B:84:0x0329, B:85:0x031c, B:86:0x037f, B:89:0x0389, B:91:0x039f, B:93:0x03a3, B:94:0x03ba, B:96:0x03be, B:97:0x03d5, B:99:0x03d9, B:100:0x03f0, B:102:0x03f4, B:103:0x0463, B:105:0x046b, B:107:0x046f, B:108:0x0409, B:110:0x0411, B:111:0x043b, B:114:0x0444, B:116:0x044c, B:117:0x002c, B:119:0x003a, B:121:0x0042, B:122:0x004d, B:127:0x0474, B:129:0x047a), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f3 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:4:0x0004, B:6:0x0011, B:8:0x0019, B:10:0x0020, B:13:0x0063, B:15:0x006c, B:17:0x0070, B:23:0x007a, B:26:0x0085, B:28:0x0091, B:30:0x009b, B:31:0x00d9, B:33:0x0105, B:36:0x010c, B:37:0x00bf, B:38:0x0121, B:41:0x012d, B:42:0x0144, B:44:0x014a, B:45:0x0165, B:47:0x016c, B:49:0x0181, B:50:0x018a, B:51:0x018d, B:53:0x0195, B:56:0x01ab, B:58:0x01bb, B:59:0x01c3, B:62:0x01cd, B:64:0x01d3, B:65:0x01e5, B:66:0x0213, B:67:0x0240, B:69:0x0248, B:71:0x0252, B:72:0x0258, B:74:0x025f, B:76:0x026e, B:77:0x0295, B:78:0x0288, B:79:0x02eb, B:81:0x02f3, B:83:0x0302, B:84:0x0329, B:85:0x031c, B:86:0x037f, B:89:0x0389, B:91:0x039f, B:93:0x03a3, B:94:0x03ba, B:96:0x03be, B:97:0x03d5, B:99:0x03d9, B:100:0x03f0, B:102:0x03f4, B:103:0x0463, B:105:0x046b, B:107:0x046f, B:108:0x0409, B:110:0x0411, B:111:0x043b, B:114:0x0444, B:116:0x044c, B:117:0x002c, B:119:0x003a, B:121:0x0042, B:122:0x004d, B:127:0x0474, B:129:0x047a), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0389 A[Catch: Exception -> 0x0029, TRY_ENTER, TryCatch #0 {Exception -> 0x0029, blocks: (B:4:0x0004, B:6:0x0011, B:8:0x0019, B:10:0x0020, B:13:0x0063, B:15:0x006c, B:17:0x0070, B:23:0x007a, B:26:0x0085, B:28:0x0091, B:30:0x009b, B:31:0x00d9, B:33:0x0105, B:36:0x010c, B:37:0x00bf, B:38:0x0121, B:41:0x012d, B:42:0x0144, B:44:0x014a, B:45:0x0165, B:47:0x016c, B:49:0x0181, B:50:0x018a, B:51:0x018d, B:53:0x0195, B:56:0x01ab, B:58:0x01bb, B:59:0x01c3, B:62:0x01cd, B:64:0x01d3, B:65:0x01e5, B:66:0x0213, B:67:0x0240, B:69:0x0248, B:71:0x0252, B:72:0x0258, B:74:0x025f, B:76:0x026e, B:77:0x0295, B:78:0x0288, B:79:0x02eb, B:81:0x02f3, B:83:0x0302, B:84:0x0329, B:85:0x031c, B:86:0x037f, B:89:0x0389, B:91:0x039f, B:93:0x03a3, B:94:0x03ba, B:96:0x03be, B:97:0x03d5, B:99:0x03d9, B:100:0x03f0, B:102:0x03f4, B:103:0x0463, B:105:0x046b, B:107:0x046f, B:108:0x0409, B:110:0x0411, B:111:0x043b, B:114:0x0444, B:116:0x044c, B:117:0x002c, B:119:0x003a, B:121:0x0042, B:122:0x004d, B:127:0x0474, B:129:0x047a), top: B:3:0x0004 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m56416e(C10866e c10866e, String str, final ZaloView zaloView, InterfaceC27218a interfaceC27218a) {
        String[] strArr;
        if (str != null && interfaceC27218a != null) {
            try {
                Bundle bundle = new Bundle();
                if (c10866e.m56406u() != 0) {
                    if (c10866e.m56406u() != 10) {
                        if (c10866e.m56406u() != 7) {
                            if (c10866e.m56406u() == 111) {
                            }
                            if (c10866e.m56406u() == 110) {
                                KeyEventCallbackC17462c keyEventCallbackC17462c = f54867a;
                                if ((keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) || zaloView == null) {
                                    return;
                                }
                                final String trim = str.trim();
                                if (TextUtils.isEmpty(trim)) {
                                    return;
                                }
                                AbstractC23647d.m123897g("400810");
                                final int m121852e2 = AbstractC23309i.m121852e2();
                                if (m121852e2 == 1 && C20011e.f98374a.m103841b(83)) {
                                    strArr = new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_free_call_via_zalo), AbstractC23136l9.m118743r0(AbstractC8020f0.str_call), AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_phone_num), AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_friend_by_phone_num)};
                                } else {
                                    strArr = new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_call), AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_phone_num), AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_friend_by_phone_num)};
                                }
                                ArrayAdapter arrayAdapter = new ArrayAdapter(zaloView.getContext(), AbstractC7409c0.chat_context_menu_item, AbstractC6918a0.context_item_name, strArr);
                                C8009j.a aVar = new C8009j.a(zaloView.getContext());
                                aVar.m43172u(str.trim());
                                aVar.m43155d(true);
                                aVar.m43153b(arrayAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.social.controls.g
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                    /* renamed from: K8 */
                                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                                        AbstractC10871j.m56417f(m121852e2, zaloView, trim, interfaceC17463d, i11);
                                    }
                                });
                                KeyEventCallbackC17462c keyEventCallbackC17462c2 = f54867a;
                                if (keyEventCallbackC17462c2 != null && keyEventCallbackC17462c2.m92868m()) {
                                    return;
                                }
                                C8009j m43152a = aVar.m43152a();
                                f54867a = m43152a;
                                m43152a.mo13822K();
                                f54868b.add(new WeakReference(f54867a));
                            }
                            if (c10866e.m56406u() == 1) {
                                String[] split = str.split("/");
                                String str2 = split[0];
                                bundle.putString("fid", split[1]);
                                bundle.putString("ownerId", str2);
                                interfaceC27218a.mo35579p().m93069k2(FeedDetailsView.class, bundle, 1, true);
                            }
                            if (c10866e.m56406u() == 2) {
                                String[] split2 = str.split("/");
                                String str3 = split2[0];
                                String str4 = split2[1];
                                bundle.putString("userId", str3);
                                bundle.putString("picid", str4);
                                interfaceC27218a.mo35579p().m93069k2(ImageCommentView.class, bundle, 1, true);
                            }
                            if (c10866e.m56406u() == 5) {
                                Bundle m87089QR = ZaloWebView.m87089QR(str);
                                m87089QR.putInt("EXTRA_SOURCE_LINK", c10866e.f54832J);
                                if (!TextUtils.isEmpty(c10866e.m56401p())) {
                                    m87089QR.putString("EXTRA_SOURCE_PARAM", c10866e.m56401p());
                                }
                                ZaloWebView.m87105iS(interfaceC27218a, str, m87089QR);
                            }
                            if (c10866e.m56406u() == 102) {
                                String[] split3 = str.split("/");
                                String str5 = split3[0];
                                String str6 = split3[1];
                                bundle.putString("fid", str6);
                                if (C26767v.m137782d().m137785c(str6) != null) {
                                    return;
                                }
                                bundle.putString("ownerId", str5);
                                bundle.putBoolean("extra_from_timeline", c10866e.m56410y());
                                if (zaloView instanceof ProfileAlbumDetailView) {
                                    ((ProfileAlbumDetailView) zaloView).m46023KM();
                                } else if (zaloView instanceof TimelineView) {
                                    if (c10866e.m56396k() == 1) {
                                        bundle.putInt("feedCate", c10866e.m56396k());
                                        bundle.putInt("ftype", c10866e.m56398m());
                                    }
                                    C31987k4 c31987k4 = new C31987k4(10002);
                                    C32002l4 m154266i = C32002l4.m154266i(c31987k4);
                                    c31987k4.m154202a("feedid", str6);
                                    c31987k4.m154202a("feedtype", Integer.valueOf(c10866e.m56398m()));
                                    bundle.putString("extra_entry_point_flow", m154266i.m154277l());
                                    interfaceC27218a.mo35579p().m93066i2(FeedDetailsView.class, bundle, 68, 1, true);
                                } else {
                                    C31987k4 c31987k42 = new C31987k4(10001);
                                    C32002l4 m154266i2 = C32002l4.m154266i(c31987k42);
                                    c31987k42.m154202a("feedid", str6);
                                    c31987k42.m154202a("feedtype", Integer.valueOf(c10866e.m56398m()));
                                    bundle.putString("extra_entry_point_flow", m154266i2.m154277l());
                                    interfaceC27218a.mo35579p().m93066i2(FeedDetailsView.class, bundle, 68, 1, true);
                                }
                            }
                            if (c10866e.m56406u() == 103) {
                                String str7 = str.split("/")[0];
                                if (zaloView instanceof FeedDetailsView) {
                                    ((FeedDetailsView) zaloView).m79646oO(str7);
                                }
                            }
                            if (c10866e.m56406u() == 6) {
                                LikesDialogView.C7989c c7989c = new LikesDialogView.C7989c(interfaceC27218a.getContext());
                                if (c10866e.m56403r() > 0) {
                                    c7989c.m43007h(interfaceC27218a.getContext().getString(AbstractC8020f0.str_titleLikeCount, Integer.valueOf(c10866e.m56403r())));
                                } else {
                                    c7989c.m43007h(interfaceC27218a.getContext().getString(AbstractC8020f0.str_titleLike));
                                }
                                c7989c.m43008i(c10866e.m56405t()).m43005f(interfaceC27218a.getContext().getString(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43001b(c10866e.m56397l()).m43003d(c10866e.m56407v()).m43002c(0).m43006g(ZAbstractBase.ZVU_BLEND_PERCENTAGE).m43000a(new LikesDialogView.InterfaceC7990d() { // from class: com.zing.zalo.social.controls.h
                                    @Override // com.zing.zalo.dialog.LikesDialogView.InterfaceC7990d
                                    /* renamed from: a */
                                    public final boolean mo43009a(String str8) {
                                        boolean m56418g;
                                        m56418g = AbstractC10871j.m56418g(str8);
                                        return m56418g;
                                    }
                                });
                                LikesDialogView m42991YK = LikesDialogView.m42991YK(c7989c);
                                m42991YK.mo83093TK(interfaceC27218a.mo35579p());
                                f54868b.add(new WeakReference(m42991YK.m92594JK()));
                            }
                            if (c10866e.m56406u() == 8) {
                                LikesDialogView.C7989c c7989c2 = new LikesDialogView.C7989c(interfaceC27218a.getContext());
                                if (c10866e.m56403r() > 0) {
                                    c7989c2.m43007h(interfaceC27218a.getContext().getString(AbstractC8020f0.str_titleLikeCount, Integer.valueOf(c10866e.m56403r())));
                                } else {
                                    c7989c2.m43007h(interfaceC27218a.getContext().getString(AbstractC8020f0.str_titleLike));
                                }
                                c7989c2.m43008i(c10866e.m56405t()).m43005f(interfaceC27218a.getContext().getString(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43004e(c10866e.m56400o()).m43003d(c10866e.m56407v()).m43002c(1).m43006g(ZAbstractBase.ZVU_BLEND_GEN_THUMB).m43000a(new LikesDialogView.InterfaceC7990d() { // from class: com.zing.zalo.social.controls.i
                                    @Override // com.zing.zalo.dialog.LikesDialogView.InterfaceC7990d
                                    /* renamed from: a */
                                    public final boolean mo43009a(String str8) {
                                        boolean m56419h;
                                        m56419h = AbstractC10871j.m56419h(str8);
                                        return m56419h;
                                    }
                                });
                                LikesDialogView m42991YK2 = LikesDialogView.m42991YK(c7989c2);
                                m42991YK2.mo83093TK(interfaceC27218a.mo35579p());
                                f54868b.add(new WeakReference(m42991YK2.m92594JK()));
                            }
                            if (c10866e.m56406u() != 100) {
                                Intent m84986jM = TagsListView.m84986jM(c10866e.m56397l(), c10866e.m56398m(), c10866e.m56407v(), c10866e.m56404s(), false);
                                if (zaloView != null) {
                                    if (zaloView instanceof FeedDetailsView) {
                                        zaloView.m92676n2().mo35579p().m93066i2(TagsListView.class, m84986jM.getExtras(), 10, 1, true);
                                    } else if (zaloView instanceof MyInfoView) {
                                        zaloView.m92676n2().mo35579p().m93066i2(TagsListView.class, m84986jM.getExtras(), 10, 1, true);
                                    } else if (zaloView instanceof UserDetailsView) {
                                        zaloView.m92676n2().mo35579p().m93066i2(TagsListView.class, m84986jM.getExtras(), 10, 1, true);
                                    } else if (zaloView instanceof TimelineView) {
                                        m84986jM.putExtra("extra_update_offline_tag", true);
                                        zaloView.m92676n2().mo35579p().m93069k2(TagsListView.class, m84986jM.getExtras(), 1, true);
                                    }
                                }
                            } else if (c10866e.m56406u() == 101) {
                                zaloView.m92676n2().mo35579p().m93066i2(TagsListView.class, TagsListView.m84987kM(c10866e.m56400o(), c10866e.m56407v(), c10866e.m56397l(), c10866e.m56404s()).getExtras(), 10, 1, true);
                            } else if (c10866e.m56406u() != 104 && c10866e.m56406u() == 105) {
                                interfaceC27218a.mo35579p().m93069k2(TagsListView.class, TagsListView.m84988lM(c10866e.m56397l(), c10866e.m56404s()).getExtras(), 1, true);
                            }
                            if (c10866e.m56406u() == 112 && (zaloView instanceof FeedCallbackZaloView)) {
                                ((FeedCallbackZaloView) zaloView).mo79524mM();
                            }
                        }
                    }
                }
                C32002l4 m154265h = C32002l4.m154265h(10000, 88);
                if (c10866e.m56405t() != null && !str.equals(CoreUtility.f89233i)) {
                    C21927m.m114302u().m114330e0(str, c10866e.m56405t());
                }
                new C19171b().m101508a(new C19171b.a(interfaceC27218a, new C26365a.b(str, m154265h).m135743b(), 0, 1));
                if (c10866e.m56406u() == 110) {
                }
                if (c10866e.m56406u() == 1) {
                }
                if (c10866e.m56406u() == 2) {
                }
                if (c10866e.m56406u() == 5) {
                }
                if (c10866e.m56406u() == 102) {
                }
                if (c10866e.m56406u() == 103) {
                }
                if (c10866e.m56406u() == 6) {
                }
                if (c10866e.m56406u() == 8) {
                }
                if (c10866e.m56406u() != 100) {
                }
                if (c10866e.m56406u() == 112) {
                    ((FeedCallbackZaloView) zaloView).mo79524mM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (c10866e.m56399n() != null) {
            c10866e.m56399n().mo44545a(c10866e.m56406u());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m56417f(int i11, ZaloView zaloView, String str, InterfaceC17463d interfaceC17463d, int i12) {
        if (i11 == 1) {
            try {
                if (C20011e.f98374a.m103841b(83)) {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 == 3) {
                                    AbstractC23647d.m123897g("400808");
                                    AbstractC3102n.m15604w(zaloView.m92676n2(), str);
                                }
                            } else {
                                AbstractC23647d.m123897g("400807");
                                ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(zaloView.getContext(), str, new SensitiveData("clipboard_copy_phone_number_from_social_popup", "social_timeline"));
                            }
                        } else {
                            AbstractC23647d.m123897g("400806");
                            AbstractC3102n.m15606y(str, zaloView.getContext());
                        }
                    } else {
                        AbstractC23647d.m123897g("400805");
                        AbstractC3102n.m15605x(zaloView.m92676n2(), str);
                    }
                    interfaceC17463d.dismiss();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    AbstractC23647d.m123897g("400808");
                    AbstractC3102n.m15604w(zaloView.m92676n2(), str);
                }
            } else {
                AbstractC23647d.m123897g("400807");
                ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(zaloView.getContext(), str, new SensitiveData("clipboard_copy_phone_number_from_social_popup", "social_timeline"));
            }
        } else {
            AbstractC23647d.m123897g("400806");
            AbstractC3102n.m15606y(str, zaloView.getContext());
        }
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ boolean m56418g(String str) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ boolean m56419h(String str) {
        return false;
    }
}
