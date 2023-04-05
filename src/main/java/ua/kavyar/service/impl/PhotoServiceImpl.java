package ua.kavyar.service.impl;

import ua.kavyar.model.Photo;
import ua.kavyar.repository.PhotoRepository;
import ua.kavyar.service.PhotoService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PhotoServiceImpl implements PhotoService {
    private final PhotoRepository photoRepository;

    public PhotoServiceImpl(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @Override
    public Photo create(Photo photo) {
        return photoRepository.save(photo);
    }

    @Override
    public List<Photo> findAll() {
        return photoRepository.findAll();
    }

    @Override
    public Photo getById(Long id) {
        return photoRepository.getReferenceById(id);
    }

    @Override
    public void delete(Long id) {
        photoRepository.deleteById(id);
    }

    @Override
    public Photo update(Photo photo) {
        return photoRepository.save(photo);
    }
}
