package easyfilepickerdialog.kingfisher.com.library.view;

import java.io.File;
import java.util.List;

/**
 * Created by kingfisher on 5/22/17.
 */

public interface FilePickerView {
    void showFolderContent(String path, List<File> files);
}
