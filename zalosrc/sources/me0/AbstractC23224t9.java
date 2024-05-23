package me0;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import gm0.AbstractC19509c;
import java.security.MessageDigest;
import java.util.UUID;
import mm0.AbstractC23356k;

/* renamed from: me0.t9 */
/* loaded from: classes4.dex */
public abstract class AbstractC23224t9 {
    /* renamed from: a */
    public static String m119686a(Intent intent) {
        try {
            String str = "--Zalo--" + intent.getAction() + intent.getDataString() + CoreUtility.f89227c + "--Zalo--";
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return AbstractC23356k.m122799e(messageDigest.digest());
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static String m119687b(Bundle bundle) {
        try {
            String str = "--Zalo--" + bundle.getString("avatar") + bundle.getString("displayname") + bundle.getString("userId") + bundle.getBoolean("fromDirectShare") + bundle.getString("tgsignsalt") + CoreUtility.f89227c + "--Zalo--";
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return AbstractC23356k.m122799e(messageDigest.digest());
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static String m119688c(PersistableBundle persistableBundle) {
        boolean z11;
        try {
            StringBuilder sb2 = new StringBuilder("--Zalo--");
            sb2.append(persistableBundle.getString("avatar"));
            sb2.append(persistableBundle.getString("displayname"));
            sb2.append(persistableBundle.getString("userId"));
            z11 = persistableBundle.getBoolean("fromDirectShare");
            sb2.append(z11);
            sb2.append(persistableBundle.getString("tgsignsalt"));
            sb2.append(CoreUtility.f89227c);
            sb2.append("--Zalo--");
            String sb3 = sb2.toString();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(sb3.getBytes());
            return AbstractC23356k.m122799e(messageDigest.digest());
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static String m119689d(Intent intent) {
        byte[] m118633a;
        try {
            StringBuilder sb2 = new StringBuilder("--Zalo--");
            sb2.append(intent.getComponent());
            sb2.append(intent.getAction());
            sb2.append(intent.getSerializableExtra("zalo_view_class"));
            sb2.append(intent.getBooleanExtra("zalo_view_show_main", true));
            sb2.append(intent.getStringExtra("zalo_view_sign_salt"));
            Bundle bundleExtra = intent.getBundleExtra("zalo_view_bundle");
            if (bundleExtra == null) {
                m118633a = "null".getBytes();
            } else {
                m118633a = AbstractC23132l5.m118633a(bundleExtra);
            }
            sb2.append(CoreUtility.f89227c);
            sb2.append("--Zalo--");
            String sb3 = sb2.toString();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(sb3.getBytes());
            messageDigest.update(m118633a);
            return AbstractC23356k.m122799e(messageDigest.digest());
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static Bundle m119690e(Bundle bundle) {
        try {
            bundle.putString("tgsignsalt", UUID.randomUUID().toString());
            String m119687b = m119687b(bundle);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("signDirectShareIntent: ");
            sb2.append(m119687b);
            bundle.putString("tgsign", m119687b);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return bundle;
    }

    /* renamed from: f */
    public static PersistableBundle m119691f(PersistableBundle persistableBundle) {
        try {
            persistableBundle.putString("tgsignsalt", UUID.randomUUID().toString());
            String m119688c = m119688c(persistableBundle);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("signDirectShareIntent: ");
            sb2.append(m119688c);
            persistableBundle.putString("tgsign", m119688c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return persistableBundle;
    }

    /* renamed from: g */
    public static Intent m119692g(Intent intent) {
        String str;
        try {
            String uuid = UUID.randomUUID().toString();
            intent.putExtra("handle_zalo_ui_event_sign_salt", uuid);
            Bundle bundleExtra = intent.getBundleExtra("handle_zalo_ui_event_bundle");
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            byte[] m118633a = AbstractC23132l5.m118633a(bundleExtra);
            byte[] m118631b = AbstractC23127l0.m118631b(m118633a, uuid.getBytes());
            if (m118631b != null) {
                str = AbstractC19509c.m101979b(m118631b);
            } else {
                str = null;
            }
            intent.putExtra("handle_zalo_ui_event_bundle_cipher", str);
            intent.removeExtra("handle_zalo_ui_event_bundle");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(("--Zalo--" + intent.getComponent() + intent.getAction() + intent.getSerializableExtra("handle_zalo_ui_event_sub_action") + intent.getBooleanExtra("handle_zalo_ui_event_show_main", true) + intent.getStringExtra("handle_zalo_ui_event_sign_salt")).getBytes());
            messageDigest.update(m118633a);
            String m122799e = AbstractC23356k.m122799e(messageDigest.digest());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("signZaloUiEventIntent - sign:");
            sb2.append(m122799e);
            intent.putExtra("handle_zalo_ui_event_sign", m122799e);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return intent;
    }

    /* renamed from: h */
    public static Intent m119693h(Intent intent) {
        try {
            intent.putExtra("zalo_view_sign_salt", UUID.randomUUID().toString());
            String m119689d = m119689d(intent);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("signZaloViewIntent:");
            sb2.append(m119689d);
            intent.putExtra("zalo_view_sign", m119689d);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return intent;
    }

    /* renamed from: i */
    public static boolean m119694i(Bundle bundle) {
        try {
            String string = bundle.getString("tgsign");
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            String m119687b = m119687b(bundle);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("verifyDirectShareIntent: ");
            sb2.append(string);
            return string.equals(m119687b);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m119695j(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("handle_zalo_ui_event_sign_salt");
            String stringExtra2 = intent.getStringExtra("handle_zalo_ui_event_bundle_cipher");
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                intent.removeExtra("handle_zalo_ui_event_bundle_cipher");
                byte[] m118630a = AbstractC23127l0.m118630a(AbstractC19509c.m101978a(stringExtra2), stringExtra.getBytes());
                intent.putExtra("handle_zalo_ui_event_bundle", (Bundle) AbstractC23132l5.m118635c(m118630a, Bundle.CREATOR));
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(("--Zalo--" + intent.getComponent() + intent.getAction() + intent.getSerializableExtra("handle_zalo_ui_event_sub_action") + intent.getBooleanExtra("handle_zalo_ui_event_show_main", true) + intent.getStringExtra("handle_zalo_ui_event_sign_salt")).getBytes());
                messageDigest.update(m118630a);
                String m122799e = AbstractC23356k.m122799e(messageDigest.digest());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("verifyZaloUiEventIntent - sign:");
                sb2.append(m122799e);
                return m122799e.equals(intent.getStringExtra("handle_zalo_ui_event_sign"));
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: k */
    public static boolean m119696k(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("zalo_view_sign");
            if (TextUtils.isEmpty(stringExtra)) {
                return false;
            }
            String m119689d = m119689d(intent);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("verifyZaloViewIntent:");
            sb2.append(m119689d);
            return stringExtra.equals(m119689d);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
