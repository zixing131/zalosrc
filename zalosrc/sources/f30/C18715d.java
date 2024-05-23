package f30;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f30.d */
/* loaded from: classes5.dex */
public class C18715d {

    /* renamed from: a */
    private int f94028a;

    /* renamed from: c */
    private final ByteBuffer f94030c;

    /* renamed from: d */
    private final String f94031d = "\"([!\\\"#$%&)(*+,-./:;=?@^_`{|}~\t\n‘’“”'])\"";

    /* renamed from: b */
    private final Map f94029b = new HashMap();

    public C18715d(String str, InterfaceC18712a interfaceC18712a) {
        this.f94028a = interfaceC18712a.mo98687e();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f94028a * 4);
        this.f94030c = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        m98705b(str);
    }

    /* renamed from: b */
    private void m98705b(String str) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
        int i11 = 0;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                this.f94029b.put(readLine.trim(), Integer.valueOf(i11));
                i11++;
            } else {
                bufferedReader.close();
                return;
            }
        }
    }

    /* renamed from: a */
    public ByteBuffer m98706a(String str, int i11) {
        int i12;
        String lowerCase = str.trim().toLowerCase();
        int i13 = 0;
        int i14 = 0;
        while (i14 < 40) {
            int i15 = i14 + 1;
            lowerCase = lowerCase.replace("\"([!\\\"#$%&)(*+,-./:;=?@^_`{|}~\t\n‘’“”'])\"".substring(i14, i15), " " + "\"([!\\\"#$%&)(*+,-./:;=?@^_`{|}~\t\n‘’“”'])\"".substring(i14, i15) + " ");
            i14 = i15;
        }
        String[] split = lowerCase.split("\\s+");
        String str2 = "";
        for (int i16 = 0; i16 < split.length; i16++) {
            if (this.f94029b.containsKey(split[i16].trim())) {
                str2 = str2 + split[i16] + " ";
            }
        }
        this.f94030c.rewind();
        String[] split2 = str2.split(" ");
        int length = split2.length;
        int i17 = this.f94028a;
        if (length > i17) {
            i12 = split2.length - i17;
        } else {
            i12 = 0;
        }
        int i18 = 0;
        while (true) {
            int i19 = this.f94028a;
            if (i13 >= i19) {
                break;
            }
            try {
                if (i13 < i19 - split2.length) {
                    this.f94030c.putFloat(((Integer) this.f94029b.get("<pad>")).intValue());
                } else {
                    this.f94030c.putFloat(((Integer) this.f94029b.get(split2[i12 + i18])).intValue());
                    i18++;
                }
            } catch (NullPointerException unused) {
                this.f94030c.putFloat(0.0f);
            }
            i13++;
        }
        if (i18 < i11) {
            return null;
        }
        return this.f94030c;
    }
}
