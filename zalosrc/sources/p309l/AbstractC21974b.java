package p309l;

import android.util.SparseArray;
import com.zing.zalo.zvideoutil.ZAbstractBase;

/* renamed from: l.b */
/* loaded from: classes2.dex */
public abstract class AbstractC21974b {

    /* renamed from: a */
    private static SparseArray f108156a;

    /* renamed from: b */
    private static SparseArray f108157b;

    static {
        SparseArray sparseArray = new SparseArray();
        f108156a = sparseArray;
        sparseArray.put(0, "There is no error");
        f108156a.put(1, "No network");
        f108156a.put(2, "XML open or read error");
        f108156a.put(3, "XML parse error");
        f108156a.put(4, "Schema validation error");
        f108156a.put(5, "Media file invalid");
        f108156a.put(6, "Exceeded wrapper limit");
        f108156a.put(7, "Audio playback error");
        f108156a.put(1001, "Missing title or description");
        f108156a.put(ZAbstractBase.ZVU_BLEND_PERCENTAGE, "Banner wrong format");
        f108156a.put(ZAbstractBase.ZVU_BLEND_GEN_THUMB, "Media file wrong bitrate");
        SparseArray sparseArray2 = new SparseArray();
        f108157b = sparseArray2;
        sparseArray2.put(0, "ERROR_NONE");
        f108157b.put(1, "ERROR_NO_NETWORK");
        f108157b.put(2, "ERROR_XML_OPEN_OR_READ");
        f108157b.put(3, "ERROR_XML_PARSE");
        f108157b.put(4, "ERROR_SCHEMA_VALIDATION");
        f108157b.put(5, "ERROR_MEDIA_FILE_INVALID");
        f108157b.put(6, "ERROR_EXCEEDED_WRAPPER_LIMIT");
        f108157b.put(7, "ERROR_AUDIO_PLAYBACK");
        f108157b.put(1001, "1001");
        f108157b.put(ZAbstractBase.ZVU_BLEND_PERCENTAGE, "1002");
        f108157b.put(ZAbstractBase.ZVU_BLEND_GEN_THUMB, "1003");
    }

    /* renamed from: a */
    public static String m114749a(int i11) {
        String str = (String) f108157b.get(i11);
        return str == null ? "ERROR_UNDEFINED" : str;
    }

    /* renamed from: b */
    public static String m114750b(int i11) {
        String str = (String) f108156a.get(i11);
        return str == null ? "Undefined error" : str;
    }
}
